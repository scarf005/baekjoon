package class2e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _1259KtTest : StringSpec({
    val runner = TestGen(::`1259`)
    "example" {
        runner.fromResource().test()
    }
})
