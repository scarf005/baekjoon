package class2e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _2751KtTest : StringSpec({
  	val runner = TestGen(::`2751`)
    "example" {
        runner.fromResource().test()
    }
})