package class2

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _2775KtTest : StringSpec({
    val runner = TestGen(::`2775`)
    "example" {
        runner.fromResource().test()
    }
})
