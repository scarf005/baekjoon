package class1e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _10951KtTest : StringSpec({
    val runner = TestGen(::`10951`)
    "example" {
        runner.fromResource().test()
    }
})
