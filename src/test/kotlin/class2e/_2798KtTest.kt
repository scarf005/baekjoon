package class2e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _2798KtTest : StringSpec({
    val runner = TestGen(::`2798`)
    "example" {
        runner.fromResource().test()
    }
})
