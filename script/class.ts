import {
  Document,
  DOMParser,
  Element,
} from 'https://deno.land/x/deno_dom@v0.1.36-alpha/deno-dom-wasm.ts'

const classIdsImpl = (document: Document) =>
  (
    [
      ...document.querySelectorAll(
        'a[href^="https://www.acmicpc.net/problem/"]'
      ),
    ] as Element[]
  )
    .map(a => a.getAttribute('href'))
    .map(href => href?.split('/').pop())
    .map(Number)

export const classIds = (document: Document) => [
  ...new Set(classIdsImpl(document)),
]

const getClassIds = async (id: number) => {
  const raw = await Deno.readTextFile(`class${id}.html`)
  const document = new DOMParser().parseFromString(raw, 'text/html') as Document

  console.log(classIds(document).join(' '))
}

if (import.meta.main) {
  if (Deno.args.length === 0) {
    console.log('no args provided.')
  } else {
    Deno.args.map(Number).forEach(getClassIds)
  }
}
