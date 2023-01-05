package class1

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _9498KtTest : StringSpec({
    val runner = TestGen(::`9498`)
    "example" {
        runner.fromResource().test()
    }
})
