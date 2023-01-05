package class1e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _2557KtTest : StringSpec({
    val runner = TestGen(::`2557`)
    "example" {
        runner.fromResource().test()
    }
})
