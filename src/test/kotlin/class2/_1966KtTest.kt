package class2

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _1966KtTest : StringSpec({
    val runner = TestGen(::`1966`)
    "example" {
        runner.fromResource().test()
    }
})
