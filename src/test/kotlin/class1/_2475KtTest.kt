package class1

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _2475KtTest : StringSpec({
  	val runner = TestGen(::`2475`)
    "example" {
        runner.fromResource().test()
    }
})