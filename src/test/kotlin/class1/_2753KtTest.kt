package class1

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _2753KtTest : StringSpec({
  	val runner = TestGen(::`2753`)
    "example" {
        runner.fromResource().test()
    }
})