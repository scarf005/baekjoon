package class2

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _10773KtTest : StringSpec({
    val runner = TestGen(::`10773`)
    "example" {
        runner.fromResource().test()
    }
})
