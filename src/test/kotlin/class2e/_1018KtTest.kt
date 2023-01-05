package class2e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _1018KtTest : StringSpec({
  	val runner = TestGen(::`1018`)
    "example" {
        runner.fromResource().test()
    }
})