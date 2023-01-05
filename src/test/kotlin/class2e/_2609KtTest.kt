package class2e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _2609KtTest : StringSpec({
  	val runner = TestGen(::`2609`)
    "example" {
        runner.fromResource().test()
    }
})