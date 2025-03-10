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
  * @param text 
  */
case class MessageContentTextObject(
    text: String
)
  
object MessageContentTextObject {
  given encoderMessageContentTextObject: Encoder[MessageContentTextObject] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        Some("text" -> t.text.asJson)
      ).flatten
    }
  }
  given decoderMessageContentTextObject: Decoder[MessageContentTextObject] = Decoder.instance { c =>
    for {
      text <- c.downField("text").as[String]
    } yield MessageContentTextObject(
      text = text
    )
  }
}

