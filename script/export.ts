import { recursiveReaddir } from 'https://deno.land/x/recursive_readdir@v2.0.0/mod.ts'

const problems = await recursiveReaddir('src/main/kotlin')

const extract = (id: number, text: string) => {
  const signature = `fun \`${id}\`()`
  const start = text.indexOf(signature)
  return text.substring(start).replace(signature, 'fun main()')
}

if (import.meta.main) {
  const id = Deno.args.map(Number)[0]
  const problem = problems.find(file => file.endsWith(`${id}.kt`))

  if (problem) {
    const text = await Deno.readTextFile(problem)

    console.log(extract(id, text))
  } else {
    console.log(`Problem ${id} not found`)
  }
}
