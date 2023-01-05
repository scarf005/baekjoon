package class1e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _2920KtTest : StringSpec({
  	val runner = TestGen(::`2920`)
    "example" {
        runner.fromResource().test()
    }
})