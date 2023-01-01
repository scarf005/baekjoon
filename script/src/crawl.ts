import {
  Document,
  DOMParser,
} from 'https://deno.land/x/deno_dom@v0.1.36-alpha/deno-dom-wasm.ts'
import { Meta, Sample } from './types.ts'

export const innerTextOfGen =
  (document: Document) =>
  (selector: string): string =>
    document.querySelector(selector)?.innerText.trim() as string

export const crawl = (
  document: Document
): { meta: Meta; samples: Sample[] } => {
  const innerTextOf = innerTextOfGen(document)

  const title = innerTextOf('#problem_title')
  const desc = innerTextOf('#problem_description')
  const input = innerTextOf('#problem_input')

  const length = document.querySelectorAll(
    '#problem-body > div > div.row'
  ).length
  const samples = Array.from({ length }, (_, i) => i + 1).map(i => ({
    input: innerTextOf(`#sample-input-${i}`),
    output: innerTextOf(`#sample-output-${i}`),
  }))

  return { meta: { title, desc, input }, samples }
}

const parser = new DOMParser()
export const get = async (url: string) =>
  parser.parseFromString(
    await fetch(url).then(r => r.text()),
    'text/html'
  ) as Document
