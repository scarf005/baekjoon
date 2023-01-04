import { recursiveReaddir } from 'https://deno.land/x/recursive_readdir@v2.0.0/mod.ts'
import clipboard from 'https://deno.land/x/clipboard@v0.0.2/mod.ts'
import { open } from 'https://deno.land/x/open@v0.0.5/index.ts'

const problems = await recursiveReaddir('src/main/kotlin')
const see = /\/\*\* \[See\].*\n/

const extract = (id: number, text: string) =>
  text
    .replace(/package .+/, '')
    .replace(see, '')
    .replace(/private /g, '')
    .replace(`fun \`${id}\`()`, 'fun main()')
    .trim()

const post = async (id: number) => {
  const problem = problems.find(file => file.endsWith(`${id}.kt`))

  if (problem) {
    const raw = await Deno.readTextFile(problem)
    const text = extract(id, raw)
    console.log(text)
    await clipboard.writeText(text)
    await open(`https://www.acmicpc.net/submit/${id}`)
  } else {
    console.log(`Problem ${id} not found`)
  }
}

if (import.meta.main) {
  Promise.all(Deno.args.map(Number).map(post))
}
