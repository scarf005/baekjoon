package class1e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _10818KtTest : StringSpec({
  	val runner = TestGen(::`10818`)
    "example" {
        runner.fromResource().test()
    }
})