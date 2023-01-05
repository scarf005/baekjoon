package class1e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _2438KtTest : StringSpec({
  	val runner = TestGen(::`2438`)
    "example" {
        runner.fromResource().test()
    }
})