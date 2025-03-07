/** merged spec
  * merged spec
  *
  * The version of the OpenAPI document: 1.0.0
  * Contact: team@openapitools.org
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech
  * Do not edit the class manually.
  */
package datoria.snowflake.models

import io.circe.*
import io.circe.syntax.*
import io.circe.{Decoder, Encoder}


/** Guardrails configuration
  * @param enabled Controls whether guardrails are enabled
  * @param responseWhenUnsafe The response when the guardrails model marks the completion as unsafe
  */
case class GuardrailsConfig(
    enabled: Option[Boolean] = None,
    responseWhenUnsafe: Option[String] = None
)
  
object GuardrailsConfig {
  given encoderGuardrailsConfig: Encoder[GuardrailsConfig] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        t.enabled.map(v => "enabled" -> v.asJson),
        t.responseWhenUnsafe.map(v => "response_when_unsafe" -> v.asJson)
      ).flatten
    }
  }
  given decoderGuardrailsConfig: Decoder[GuardrailsConfig] = Decoder.instance { c =>
    for {
      enabled <- c.downField("enabled").as[Option[Boolean]]
      responseWhenUnsafe <- c.downField("response_when_unsafe").as[Option[String]]
    } yield GuardrailsConfig(
      enabled = enabled,
      responseWhenUnsafe = responseWhenUnsafe
    )
  }
}

