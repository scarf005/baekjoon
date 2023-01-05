package class2e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _11050KtTest : StringSpec({
  	val runner = TestGen(::`11050`)
    "example" {
        runner.fromResource().test()
    }
})