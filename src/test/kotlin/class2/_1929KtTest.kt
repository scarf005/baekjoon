package class2

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _1929KtTest : StringSpec({
  	val runner = TestGen(::`1929`)
    "example" {
        runner.fromResource().test()
    }
})