package class2

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _2292KtTest : StringSpec({
    val runner = TestGen(::`2292`)
    "example" {
        runner.fromResource().test()
    }
})
