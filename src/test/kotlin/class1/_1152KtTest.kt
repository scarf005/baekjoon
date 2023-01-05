package class1

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _1152KtTest : StringSpec({
    val runner = TestGen(::`1152`)
    "example" {
        runner.fromResource().test()
    }
})
