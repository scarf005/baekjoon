package class2

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _11651KtTest : StringSpec({
  	val runner = TestGen(::`11651`)
    "example" {
        runner.fromResource().test()
    }
})