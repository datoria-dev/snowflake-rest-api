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
enum MessageContentType(val value: String) {
  case Text extends MessageContentType("text")
  case Sql extends MessageContentType("sql")
  case Suggestions extends MessageContentType("suggestions")
}

object MessageContentType {

  def withValueOpt(value: String): Option[MessageContentType] = MessageContentType.values.find(_.value == value)
  def withValue(value: String): MessageContentType =
    withValueOpt(value).getOrElse(throw java.lang.IllegalArgumentException(s"MessageContentType enum case not found: $value"))

  given decoderMessageContentType: Decoder[MessageContentType] = Decoder.decodeString.map(withValue)
  given encoderMessageContentType: Encoder[MessageContentType] = Encoder.encodeString.contramap[MessageContentType](_.value)

}

