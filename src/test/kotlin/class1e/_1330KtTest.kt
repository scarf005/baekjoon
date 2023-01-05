package class1e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _1330KtTest : StringSpec({
    val runner = TestGen(::`1330`)
    "example" {
        runner.fromResource().test()
    }
})
