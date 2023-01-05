package class1

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _1001KtTest : StringSpec({
    val runner = TestGen(::`1001`)
    "example" {
        runner.fromResource().test()
    }
})
