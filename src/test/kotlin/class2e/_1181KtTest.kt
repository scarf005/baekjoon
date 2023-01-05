package class2e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _1181KtTest : StringSpec({
    val runner = TestGen(::`1181`)
    "example" {
        runner.fromResource().test()
    }
})
