package class2e

import io.kotest.core.spec.style.StringSpec
import utils.TestCase
import utils.TestGen

object _10250KtTest : StringSpec({
    val runner = TestGen(::`10250`)
    "example" {
        runner.fromResource().test()
    }

    "n is multiple of h" {
        runner.from(
            TestCase(
                """
                2
                6 10 6
                6 10 12
                """,
                """
                601
                602
                """
            )
        ).test()
    }
})
