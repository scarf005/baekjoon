package class1

import io.kotest.core.spec.style.StringSpec
import utils.Examples

object _1546KtTest : StringSpec({
    "example" {
        Examples.testNearEquality(::`1546`, 1e-2)
    }
})
