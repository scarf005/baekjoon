import { crawl, get } from './crawl.ts'
import { problemKDoc, testObject, testYaml, urlGen } from './template.ts'

const pathGen = (id: number) => ({
  src: `src/main/kotlin/${id}.kt`,
  test: `src/test/kotlin/_${id}KtTest.kt`,
  resources: `src/test/resources/${id}.yaml`,
})

const tryWrite = async (path: string, text: string) => {
  try {
    await Deno.writeTextFile(path, text, { createNew: true })
  } catch (_) {
    console.log(`File ${path} already exists, skipping`)
  }
}

const problem = async (id: number) => {
  const url = urlGen(id)
  const { src, test, resources } = pathGen(id)
  const { meta, samples } = crawl(await get(url))

  await Deno.writeTextFile(resources, testYaml(samples))
  await tryWrite(test, testObject(id))
  await tryWrite(src, problemKDoc(id, meta))
}

if (import.meta.main) {
  if (Deno.args.length === 0) {
    console.log('no args provided.')
  } else {
    Deno.args.map(Number).forEach(problem)
  }
}
