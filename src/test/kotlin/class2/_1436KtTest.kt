package class2

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _1436KtTest : StringSpec({
    val runner = TestGen(::`1436`)
    "example" {
        runner.fromResource().test()
    }
})
