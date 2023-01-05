package class2e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _10816KtTest : StringSpec({
  	val runner = TestGen(::`10816`)
    "example" {
        runner.fromResource().test()
    }
})