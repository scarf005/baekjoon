package class1

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _1000KtTest : StringSpec({
    val runner = TestGen(::`1000`)
    "example" {
        runner.fromResource().test()
    }
})
