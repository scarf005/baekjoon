package class1

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _10172KtTest : StringSpec({
  	val runner = TestGen(::`10172`)
    "example" {
        runner.fromResource().test()
    }
})