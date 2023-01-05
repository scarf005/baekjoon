package class1e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _1008KtTest : StringSpec({
    val runner = TestGen(::`1008`)
    "example" {
        runner.fromResource().testNearEquality(10e-9)
    }
})
