package class2e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _10845KtTest : StringSpec({
    val runner = TestGen(::`10845`)
    "example" {
        runner.fromResource().test()
    }
})
