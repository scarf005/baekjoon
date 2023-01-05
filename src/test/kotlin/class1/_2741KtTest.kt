package class1

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _2741KtTest : StringSpec({
  	val runner = TestGen(::`2741`)
    "example" {
        runner.fromResource().test()
    }
})