package class1

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _10998KtTest : StringSpec({
  	val runner = TestGen(::`10998`)
    "example" {
        runner.fromResource().test()
    }
})