package class1

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _2884KtTest : StringSpec({
    val runner = TestGen(::`2884`)
    "example" {
        runner.fromResource().test()
    }
})
