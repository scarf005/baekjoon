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
      import utils.Examples

      object _${id}KtTest : StringSpec({
          "example" {
              Examples.test(::${idNameGen(id)})
          }
      })
  `

export const testYaml = (samples: Sample[]) => yaml.stringify({ samples })

const section = (sx: readonly string[]) => sx.map(x => `* ${x}`).concat('*')

export const problemKDoc = (cls: string, id: number, meta: Meta) => {
  const lines = {
    title: [`# ${meta.title}`],
    desc: [`## 문제`, ...meta.desc.split('\n')],
    input: [`## 입력`, ...meta.input.split('\n')],
    output: [`## 출력`, ...meta.output.split('\n')],
  }
  const all = Object.values(lines).map(section).flat().join('\n')

  return fmti`
      ${packageGen(cls)}

      /**
       ${all}
       */
      /** [See](${urlGen(id)}) */
      fun ${idNameGen(id)}(): Nothing = TODO()
    ` + '\n'
}
