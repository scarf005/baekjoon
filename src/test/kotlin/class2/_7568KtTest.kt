package class2

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _7568KtTest : StringSpec({
  	val runner = TestGen(::`7568`)
    "example" {
        runner.fromResource().test()
    }
})