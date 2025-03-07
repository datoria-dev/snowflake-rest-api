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


/** Specifies whether the stage is permanent or temporary.
  */
enum StageKind(val value: String) {
  case PERMANENT extends StageKind("PERMANENT")
  case TEMPORARY extends StageKind("TEMPORARY")
}

object StageKind {

  def withValueOpt(value: String): Option[StageKind] = StageKind.values.find(_.value == value)
  def withValue(value: String): StageKind =
    withValueOpt(value).getOrElse(throw java.lang.IllegalArgumentException(s"StageKind enum case not found: $value"))

  given decoderStageKind: Decoder[StageKind] = Decoder.decodeString.map(withValue)
  given encoderStageKind: Encoder[StageKind] = Encoder.encodeString.contramap[StageKind](_.value)

}

