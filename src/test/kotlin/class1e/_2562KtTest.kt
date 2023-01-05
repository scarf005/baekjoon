package class1e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _2562KtTest : StringSpec({
    val runner = TestGen(::`2562`)
    "example" {
        runner.fromResource().test()
    }
})
