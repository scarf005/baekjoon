package class2

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _18111KtTest : StringSpec({
    val runner = TestGen(::`18111`)
    "example" {
        runner.fromResource().test()
    }
})
