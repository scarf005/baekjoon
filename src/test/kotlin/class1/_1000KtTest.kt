package class1

import io.kotest.core.spec.style.StringSpec
import utils.Examples

object _1000KtTest : StringSpec({
    "example" {
        Examples.test(::`1000`)
    }
})