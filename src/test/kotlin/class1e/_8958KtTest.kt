package class1e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _8958KtTest : StringSpec({
    val runner = TestGen(::`8958`)
    "example" {
        runner.fromResource().test()
    }
})
