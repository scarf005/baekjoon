package class1e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _10952KtTest : StringSpec({
    val runner = TestGen(::`10952`)
    "example" {
        runner.fromResource().test()
    }
})
