package class2e

import io.kotest.core.spec.style.StringSpec
import utils.Examples
import utils.TestCase

object _10250KtTest : StringSpec({
    "example" {
        Examples.test(::`10250`)
    }

    "n is multiple of h" {
        Examples(
            listOf(
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
            )
        ).test(::`10250`)
    }
})
