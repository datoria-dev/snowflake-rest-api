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
  * @param createdOn Timestamp that specifies when the statement execution started.‌ The timestamp is expressed in milliseconds since the epoch.
  * @param statementStatusUrl 
  */
case class QueryFailureStatus(
    code: Option[String] = None,
    sqlState: Option[String] = None,
    message: String,
    statementHandle: UUID,
    createdOn: Option[Long] = None,
    statementStatusUrl: Option[URI] = None
)
  
object QueryFailureStatus {
  given encoderQueryFailureStatus: Encoder[QueryFailureStatus] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        t.code.map(v => "code" -> v.asJson),
        t.sqlState.map(v => "sqlState" -> v.asJson),
        Some("message" -> t.message.asJson),
        Some("statementHandle" -> t.statementHandle.asJson),
        t.createdOn.map(v => "createdOn" -> v.asJson),
        t.statementStatusUrl.map(v => "statementStatusUrl" -> v.asJson)
      ).flatten
    }
  }
  given decoderQueryFailureStatus: Decoder[QueryFailureStatus] = Decoder.instance { c =>
    for {
      code <- c.downField("code").as[Option[String]]
      sqlState <- c.downField("sqlState").as[Option[String]]
      message <- c.downField("message").as[String]
      statementHandle <- c.downField("statementHandle").as[UUID]
      createdOn <- c.downField("createdOn").as[Option[Long]]
      statementStatusUrl <- c.downField("statementStatusUrl").as[Option[URI]]
    } yield QueryFailureStatus(
      code = code,
      sqlState = sqlState,
      message = message,
      statementHandle = statementHandle,
      createdOn = createdOn,
      statementStatusUrl = statementStatusUrl
    )
  }
}

