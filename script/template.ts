import { stringify } from 'https://deno.land/std@0.170.0/encoding/yaml.ts'
import { fmti } from 'https://raw.githubusercontent.com/scarf005/fmti/main/main.ts'
import { Meta, Sample } from './types.ts'

const idNameGen = (id: number) => `\`${id}\``
export const urlGen = (id: number) => `https://www.acmicpc.net/problem/${id}`

export const testObject = (id: number) =>
  fmti`
      import io.kotest.core.spec.style.StringSpec
      import utils.Examples

      object _${id}KtTest : StringSpec({
          "example" {
              Examples.test(::${idNameGen(id)})
          }
      })
  `

export const testYaml = (samples: Sample[]) => stringify({ samples })

const section = (sx: readonly string[]) => sx.map(x => `* ${x}`).concat('*')

export const problemKDoc = (id: number, meta: Meta) => {
  const title = section([`# ${meta.title}`])
  const desc = section([`## 문제`, ...meta.desc.split('\n')])
  const input = section([`## 입력`, ...meta.input.split('\n')])
  const all = [title, desc, input].flat().join('\n')

  return fmti`
      /**
       ${all}
       * [See](${urlGen(id)})
       */
      fun ${idNameGen(id)}() = TODO()
    `
}
