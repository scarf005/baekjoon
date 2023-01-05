package class2

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _1874KtTest : StringSpec({
    val runner = TestGen(::`1874`)
    "example" {
        runner.fromResource().test()
    }
})
