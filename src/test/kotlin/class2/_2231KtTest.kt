package class2

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _2231KtTest : StringSpec({
    val runner = TestGen(::`2231`)
    "example" {
        runner.fromResource().test()
    }
})
