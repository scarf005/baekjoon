import { crawl, get } from './src/crawl.ts'
import { problemKDoc, testObject, testYaml, urlGen } from './src/template.ts'
import {
  brightYellow,
  brightGreen,
} from 'https://deno.land/std@0.167.0/fmt/colors.ts'

const dirGen = (cls: string) => ({
  src: `src/main/kotlin/class${cls}`,
  test: `src/test/kotlin/class${cls}`,
  resources: `src/test/resources`,
})

const pathGen = (cls: string, id: number) => {
  const { src, test, resources } = dirGen(cls)

  return {
    src: `${src}/${id}.kt`,
    test: `${test}/_${id}KtTest.kt`,
    resources: `${resources}/${id}.yaml`,
  }
}

const tryWrite = async (path: string, text: string) => {
  try {
    await Deno.writeTextFile(path, text, { createNew: true })
    console.log(brightGreen(`write :: ${path}`))
  } catch (_) {
    console.log(brightYellow(`skip  :: ${path}`))
  }
}

const problem = async (cls: string, id: number) => {
  const url = urlGen(id)
  const { src, test, resources } = pathGen(cls, id)
  const { meta, samples } = crawl(await get(url))

  const files = [
    [resources, testYaml(samples)],
    [test, testObject(cls, id)],
    [src, problemKDoc(cls, id, meta)],
  ]

  Promise.all(files.map(([path, text]) => tryWrite(path, text)))
}

const genFiles = async (cls: string, problems: number[]) => {
  await Promise.all(
    Object.values(dirGen(cls)).map(dir => Deno.mkdir(dir, { recursive: true }))
  )
  await Promise.all(problems.map(id => problem(cls, id)))
}

if (import.meta.main) {
  if (Deno.args.length != 1) {
    console.log('class required')
  } else {
    const text = await Deno.readTextFile('class.json')
    const classes: Record<string, number[]> = JSON.parse(text)
    const n = Number(Deno.args[0])
    console.log(`query :: ${n}`)
    const [normal, essential] = [classes[`${n}ne`], classes[`${n}e`]]

    await Promise.all([
      genFiles(`${n}`, normal),
      genFiles(`${n}e`, essential),
    ])
  }
}
