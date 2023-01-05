package class2e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _1978KtTest : StringSpec({
    val runner = TestGen(::`1978`)
    "example" {
        runner.fromResource().test()
    }
})
