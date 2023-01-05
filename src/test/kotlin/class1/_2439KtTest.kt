package class1

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _2439KtTest : StringSpec({
    val runner = TestGen(::`2439`)
    "example" {
        runner.fromResource().test()
    }
})
