package class1

import io.kotest.core.spec.style.StringSpec
import utils.TestGen

object _10809KtTest : StringSpec({
  	val runner = TestGen(::`10809`)
    "example" {
        runner.fromResource().test()
    }
})