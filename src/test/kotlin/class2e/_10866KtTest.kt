package class2e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _10866KtTest : StringSpec({
    val runner = TestGen(::`10866`)
    "example" {
        runner.fromResource().test()
    }
})
