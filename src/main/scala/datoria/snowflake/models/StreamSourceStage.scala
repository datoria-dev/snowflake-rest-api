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
case class StreamSourceStage(
)
  
object StreamSourceStage {
  given encoderStreamSourceStage: Encoder[StreamSourceStage] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
      ).flatten
    }
  }
  given decoderStreamSourceStage: Decoder[StreamSourceStage] = Decoder.instance { c =>
    Right(StreamSourceStage())
  }
}

