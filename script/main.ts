import { crawl, get } from './crawl.ts'
import { problemText, testText, urlGen } from './template.ts'

const pathGen = (id: number) => ({
  src: `src/main/kotlin/${id}.kt`,
  test: `src/test/kotlin/_${id}KtTest.kt`,
})

const problem = async (id: number) => {
  const url = urlGen(id)
  const { src, test } = pathGen(id)
  const { meta, samples } = crawl(await get(url))

  await Deno.writeTextFile(test, testText(id, samples))
  try {
    await Deno.writeTextFile(src, problemText(id, meta), { createNew: true })
  } catch (_) {
    console.log(problemText(id, meta))
    console.log(`File ${src} already exists, skipping`)
  }
}

if (import.meta.main) {
  if (Deno.args.length === 0) {
    console.log('no args provided.')
  } else {
    Deno.args.map(Number).forEach(problem)
  }

  // const io = [
  //   1000, 1924, 2438, 2439, 2440, 2441, 2442, 2445, 2446, 2522, 2557, 2558,
  //   2739, 2741, 2742, 8393, 10818, 10950, 10951, 10952, 10953, 10991, 10992,
  //   11021, 11022, 11718, 11719, 11720, 11721,
  // ]
  // ;[1000, 1001, 2558, 10828].forEach(problem)
}
