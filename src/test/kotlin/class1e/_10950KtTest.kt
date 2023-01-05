package class1e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _10950KtTest : StringSpec({
    val runner = TestGen(::`10950`)
    "example" {
        runner.fromResource().test()
    }
})
