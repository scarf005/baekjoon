import * as yaml from 'https://deno.land/std@0.170.0/encoding/yaml.ts'
import { fmti } from 'https://raw.githubusercontent.com/scarf005/fmti/main/main.ts'
import { Meta, Sample } from './types.ts'

const packageGen = (cls: string) => `package class${cls}`

const idNameGen = (id: number) => `\`${id}\``
export const urlGen = (id: number) => `https://www.acmicpc.net/problem/${id}`

export const testObject = (cls: string, id: number) =>
  fmti`
      ${packageGen(cls)}

      import io.kotest.core.spec.style.StringSpec
      import utils.TestGen

      object _${id}KtTest : StringSpec({
          val runner = TestGen(::${idNameGen(id)})
          "example" {
              runner.fromResource().test()
          }
      })
  `

export const testYaml = (samples: Sample[]) => yaml.stringify({ samples })

const section = (sx: readonly string[]) => sx.map(x => `* ${x}`).concat('*')

export const problemKDoc = (cls: string, id: number, meta: Meta) => {
  const toMultiline = (s: string) =>
    s.split('\n').flatMap(x => x.match(/.{1,80}/g) ?? [])
  const toHeader = (title: string, s: string) => [title, ...toMultiline(s)]

  const lines = {
    title: [`# ${meta.title}`],
    desc: toHeader('## 설명', meta.desc),
    input: toHeader('## 입력', meta.input),
    output: toHeader('## 출력', meta.output),
  }
  const all = Object.values(lines).map(section).flat().join('\n')

  return (
    fmti`
      ${packageGen(cls)}

      /**
       ${all}
       */
      /** [See](${urlGen(id)}) */
      fun ${idNameGen(id)}() = println()
    ` + '\n'
  )
}
