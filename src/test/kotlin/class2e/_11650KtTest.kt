package class2e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _11650KtTest : StringSpec({
  	val runner = TestGen(::`11650`)
    "example" {
        runner.fromResource().test()
    }
})