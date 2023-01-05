package class2e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _9012KtTest : StringSpec({
  	val runner = TestGen(::`9012`)
    "example" {
        runner.fromResource().test()
    }
})