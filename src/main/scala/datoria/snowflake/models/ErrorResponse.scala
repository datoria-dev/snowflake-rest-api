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
  * @param message Error message returned by the server
  * @param code Error code.
  * @param errorCode Error code, same as `code` above. This property has been deprecated and will be removed in a future release, but is temporarily supported for for short-term backward compatibility.
  * @param requestId Unique request ID.
  */
case class ErrorResponse(
    message: Option[String] = None,
    code: Option[String] = None,
    errorCode: Option[String] = None,
    requestId: Option[String] = None
)
  
object ErrorResponse {
  given encoderErrorResponse: Encoder[ErrorResponse] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        t.message.map(v => "message" -> v.asJson),
        t.code.map(v => "code" -> v.asJson),
        t.errorCode.map(v => "error_code" -> v.asJson),
        t.requestId.map(v => "request_id" -> v.asJson)
      ).flatten
    }
  }
  given decoderErrorResponse: Decoder[ErrorResponse] = Decoder.instance { c =>
    for {
      message <- c.downField("message").as[Option[String]]
      code <- c.downField("code").as[Option[String]]
      errorCode <- c.downField("error_code").as[Option[String]]
      requestId <- c.downField("request_id").as[Option[String]]
    } yield ErrorResponse(
      message = message,
      code = code,
      errorCode = errorCode,
      requestId = requestId
    )
  }
}

