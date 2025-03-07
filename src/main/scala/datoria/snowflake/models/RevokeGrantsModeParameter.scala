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


/** 
  */
enum RevokeGrantsModeParameter(val value: String) {
  case Restrict extends RevokeGrantsModeParameter("restrict")
  case Cascade extends RevokeGrantsModeParameter("cascade")
}

object RevokeGrantsModeParameter {

  def withValueOpt(value: String): Option[RevokeGrantsModeParameter] = RevokeGrantsModeParameter.values.find(_.value == value)
  def withValue(value: String): RevokeGrantsModeParameter =
    withValueOpt(value).getOrElse(throw java.lang.IllegalArgumentException(s"RevokeGrantsModeParameter enum case not found: $value"))

  given decoderRevokeGrantsModeParameter: Decoder[RevokeGrantsModeParameter] = Decoder.decodeString.map(withValue)
  given encoderRevokeGrantsModeParameter: Encoder[RevokeGrantsModeParameter] = Encoder.encodeString.contramap[RevokeGrantsModeParameter](_.value)

}

