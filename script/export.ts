import { recursiveReaddir } from 'https://deno.land/x/recursive_readdir@v2.0.0/mod.ts'
import clipboard from 'https://deno.land/x/clipboard@v0.0.2/mod.ts'
import { open } from 'https://deno.land/x/open@v0.0.5/index.ts'

const problems = await recursiveReaddir('src/main/kotlin')

const extract = (id: number, text: string) => {
  const signature = `fun \`${id}\`()`
  const imports = text.match(/import .+/g)?.join('\n') ?? ''
  const start = text.indexOf(signature)
  return [imports, text.substring(start).replace(signature, 'fun main()')]
    .join('\n\n')
    .trim()
}

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
