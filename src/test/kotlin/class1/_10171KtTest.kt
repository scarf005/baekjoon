package class1

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _10171KtTest : StringSpec({
  	val runner = TestGen(::`10171`)
    "example" {
        runner.fromResource().test()
    }
})