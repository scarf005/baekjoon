package class2e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _11866KtTest : StringSpec({
    val runner = TestGen(::`11866`)
    "example" {
        runner.fromResource().test()
    }
})
