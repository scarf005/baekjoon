package class1

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _2908KtTest : StringSpec({
  	val runner = TestGen(::`2908`)
    "example" {
        runner.fromResource().test()
    }
})