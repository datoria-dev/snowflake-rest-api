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

import java.net.URI
import java.util.UUID

/** 
  * @param code 
  * @param sqlState 
  * @param message 
  * @param statementHandle 
  * @param statementStatusUrl 
  */
case class CancelStatus(
    code: Option[String] = None,
    sqlState: Option[String] = None,
    message: Option[String] = None,
    statementHandle: UUID,
    statementStatusUrl: Option[URI] = None
)
  
object CancelStatus {
  given encoderCancelStatus: Encoder[CancelStatus] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        t.code.map(v => "code" -> v.asJson),
        t.sqlState.map(v => "sqlState" -> v.asJson),
        t.message.map(v => "message" -> v.asJson),
        Some("statementHandle" -> t.statementHandle.asJson),
        t.statementStatusUrl.map(v => "statementStatusUrl" -> v.asJson)
      ).flatten
    }
  }
  given decoderCancelStatus: Decoder[CancelStatus] = Decoder.instance { c =>
    for {
      code <- c.downField("code").as[Option[String]]
      sqlState <- c.downField("sqlState").as[Option[String]]
      message <- c.downField("message").as[Option[String]]
      statementHandle <- c.downField("statementHandle").as[UUID]
      statementStatusUrl <- c.downField("statementStatusUrl").as[Option[URI]]
    } yield CancelStatus(
      code = code,
      sqlState = sqlState,
      message = message,
      statementHandle = statementHandle,
      statementStatusUrl = statementStatusUrl
    )
  }
}

