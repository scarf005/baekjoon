package class2e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _10828KtTest : StringSpec({
    val runner = TestGen(::`10828`)
    "example" {
        runner.fromResource().test()
    }
})
