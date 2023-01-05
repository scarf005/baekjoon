package class1

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _3052KtTest : StringSpec({
    val runner = TestGen(::`3052`)
    "example" {
        runner.fromResource().test()
    }
})
