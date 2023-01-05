package class2

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _2869KtTest : StringSpec({
  	val runner = TestGen(::`2869`)
    "example" {
        runner.fromResource().test()
    }
})