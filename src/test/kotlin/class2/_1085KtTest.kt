package class2

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _1085KtTest : StringSpec({
  	val runner = TestGen(::`1085`)
    "example" {
        runner.fromResource().test()
    }
})