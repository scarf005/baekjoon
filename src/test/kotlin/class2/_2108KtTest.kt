package class2

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _2108KtTest : StringSpec({
  	val runner = TestGen(::`2108`)
    "example" {
        runner.fromResource().test()
    }
})