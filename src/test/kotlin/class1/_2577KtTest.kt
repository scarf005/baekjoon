package class1

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _2577KtTest : StringSpec({
    val runner = TestGen(::`2577`)
    "example" {
        runner.fromResource().test()
    }
})
