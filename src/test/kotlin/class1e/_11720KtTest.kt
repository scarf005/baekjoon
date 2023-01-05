package class1e

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _11720KtTest : StringSpec({
  	val runner = TestGen(::`11720`)
    "example" {
        runner.fromResource().test()
    }
})