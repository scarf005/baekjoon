package class2

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _10989KtTest : StringSpec({
    val runner = TestGen(::`10989`)
    "example" {
        runner.fromResource().test()
    }
})
