package class2

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _2839KtTest : StringSpec({
  	val runner = TestGen(::`2839`)
    "example" {
        runner.fromResource().test()
    }
})