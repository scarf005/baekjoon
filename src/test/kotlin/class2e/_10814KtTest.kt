package class2e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _10814KtTest : StringSpec({
    val runner = TestGen(::`10814`)
    "example" {
        runner.fromResource().test()
    }
})
