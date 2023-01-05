package class2e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _4153KtTest : StringSpec({
  	val runner = TestGen(::`4153`)
    "example" {
        runner.fromResource().test()
    }
})