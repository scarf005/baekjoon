package utils

import com.charleskorn.kaml.Yaml
import kotlinx.serialization.Serializable

@Serializable
data class Examples(val samples: List<TestCase>) {
    companion object {
        private fun resourceStream(id: Int) =
            Examples::class.java.getResourceAsStream("/$id.yaml")!!

        fun fromResource(id: Int): Examples =
            Yaml.default.decodeFromStream(serializer(), resourceStream(id))
    }
}
