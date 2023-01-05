package class1

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _10871KtTest : StringSpec({
  	val runner = TestGen(::`10871`)
    "example" {
        runner.fromResource().test()
    }
})