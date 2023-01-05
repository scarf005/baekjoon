package class2

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _15829KtTest : StringSpec({
  	val runner = TestGen(::`15829`)
    "example" {
        runner.fromResource().test()
    }
})