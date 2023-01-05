package class2e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _2164KtTest : StringSpec({
    val runner = TestGen(::`2164`)
    "example" {
        runner.fromResource().test()
    }
})
