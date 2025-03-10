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


/** Relation to the point of time.  Currently, the API supports `at` and `before`
  */
enum PointOfTimeReference(val value: String) {
  case At extends PointOfTimeReference("at")
  case Before extends PointOfTimeReference("before")
}

object PointOfTimeReference {

  def withValueOpt(value: String): Option[PointOfTimeReference] = PointOfTimeReference.values.find(_.value == value)
  def withValue(value: String): PointOfTimeReference =
    withValueOpt(value).getOrElse(throw java.lang.IllegalArgumentException(s"PointOfTimeReference enum case not found: $value"))

  given decoderPointOfTimeReference: Decoder[PointOfTimeReference] = Decoder.decodeString.map(withValue)
  given encoderPointOfTimeReference: Encoder[PointOfTimeReference] = Encoder.encodeString.contramap[PointOfTimeReference](_.value)

}

