package class1

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _2742KtTest : StringSpec({
    val runner = TestGen(::`2742`)
    "example" {
        runner.fromResource().test()
    }
})
