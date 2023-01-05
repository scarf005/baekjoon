package class1e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _2739KtTest : StringSpec({
  	val runner = TestGen(::`2739`)
    "example" {
        runner.fromResource().test()
    }
})