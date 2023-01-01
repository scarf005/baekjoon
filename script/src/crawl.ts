import {
  Document,
  DOMParser,
} from 'https://deno.land/x/deno_dom@v0.1.36-alpha/deno-dom-wasm.ts'
import { Meta, Sample } from './types.ts'
import { unescapeHtml } from 'https://deno.land/x/escape@1.4.2/mod.ts'

const nbspRegex = new RegExp(String.fromCharCode(160), 'g')

export const innerTextOfGen =
  (document: Document) =>
  (selector: string): string =>
    unescapeHtml(document.querySelector(selector)!.innerText)
      .replace(/\n$/, '')
      .replaceAll(nbspRegex, ' ') as string

export const crawl = (
  document: Document
): { meta: Meta; samples: Sample[] } => {
  const innerTextOf = innerTextOfGen(document)

  const meta = Object.fromEntries(
    Object.entries({
      title: '#problem_title',
      desc: '#problem_description',
      input: '#problem_input',
      output: '#problem_output',
    }).map(([key, value]) => [key, innerTextOf(value).trim()])
  ) as Meta

  const length = document.querySelectorAll(
    '#problem-body > div > div.row'
  ).length
  const samples = Array.from({ length }, (_, i) => i + 1).map(i => ({
    input: innerTextOf(`#sample-input-${i}`),
    output: innerTextOf(`#sample-output-${i}`),
  }))

  return { meta, samples }
}

const parser = new DOMParser()
export const get = async (url: string) =>
  parser.parseFromString(
    await fetch(url).then(r => r.text()),
    'text/html'
  ) as Document
