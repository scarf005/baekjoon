package class1

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _1546KtTest : StringSpec({
    val runner = TestGen(::`1546`)
    "example" {
        runner.fromResource().testNearEquality(10e-2)
    }
})
