package utils

import kotlinx.serialization.Serializable

@Suppress("DataClassPrivateConstructor")
@Serializable
data class TestCase private constructor(val input: String, val output: String) {
    companion object {
        operator fun invoke(input: String, output: String) = TestCase(input.trimIndent(), output.trimIndent())
    }
}
