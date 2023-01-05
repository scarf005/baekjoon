package class2

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _4949KtTest : StringSpec({
  	val runner = TestGen(::`4949`)
    "example" {
        runner.fromResource().test()
    }
})