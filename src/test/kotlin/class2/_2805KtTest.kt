package class2

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _2805KtTest : StringSpec({
    val runner = TestGen(::`2805`)
    "example" {
        runner.fromResource().test()
    }
})
