import { fmti } from 'https://raw.githubusercontent.com/scarf005/fmti/main/main.ts'
import { Meta, Sample } from './types.ts'

const idNameGen = (id: number) => `\`${id}\``
export const urlGen = (id: number) => `https://www.acmicpc.net/problem/${id}`

export const testText = (id: number, samples: Sample[]) => {
  const idName = idNameGen(id)

  const testcase = (sample: Sample, i: number) => fmti`
      "case ${i}" {
          mock(
              """
              ${fmti`${sample.input}`}
              """.trimIndent()
          ) { ${idName}() } shouldBe """
              ${fmti`${sample.output}`}
          """.toOutput()
      }
  `

  return fmti`
      import io.kotest.core.spec.style.StringSpec
      import io.kotest.matchers.shouldBe

      object ${idName} : StringSpec({
          ${samples
            .map((s, i) => testcase(s, i + 1))
            .map(x => fmti`${x}`)
            .join('\n')}
      })
  `
}

const section = (sx: readonly string[]) => sx.map(x => `* ${x}`).concat('*')

export const problemText = (id: number, meta: Meta) => {
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
