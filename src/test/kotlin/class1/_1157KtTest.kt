package class1

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _1157KtTest : StringSpec({
    val runner = TestGen(::`1157`)
    "example" {
        runner.fromResource().test()
    }
})
