package class1e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _2675KtTest : StringSpec({
  	val runner = TestGen(::`2675`)
    "example" {
        runner.fromResource().test()
    }
})