package class1e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _10869KtTest : StringSpec({
  	val runner = TestGen(::`10869`)
    "example" {
        runner.fromResource().test()
    }
})