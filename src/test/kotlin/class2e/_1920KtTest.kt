package class2e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _1920KtTest : StringSpec({
    val runner = TestGen(::`1920`)
    "example" {
        runner.fromResource().test()
    }
})
