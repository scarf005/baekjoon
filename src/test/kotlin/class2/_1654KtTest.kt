package class2

import io.kotest.core.spec.style.StringSpec
import utils.TestCase
import utils.TestGen

object _1654KtTest : StringSpec({
    val runner = TestGen(::`1654`)
    "example" {
        runner.fromResource().test()
    }
    "1 and 1" {
        runner.from(
            TestCase(
                """
                1 1
                1000
                """,
                "1000"
            )
        ).test()
    }
    "int max" {
        runner.from(
            TestCase(
                """
                2 1000
                2147483647
                2147483647
                """,
                "4294967"
            )
        ).test()
    }
})
