package class1e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _11654KtTest : StringSpec({
    val runner = TestGen(::`11654`)
    "example" {
        runner.fromResource().test()
    }
})
