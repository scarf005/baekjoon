package class2

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _1654KtTest : StringSpec({
    val runner = TestGen(::`1654`)
    "example" {
        runner.fromResource().test()
    }
})
