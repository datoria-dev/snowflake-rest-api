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

import scala.collection.immutable.Seq

/** Search results.
  * @param results List of result rows.
  * @param requestId ID of the request.
  */
case class QueryResponse(
    results: Seq[Map[String, AnyType]],
    requestId: String
)
  
object QueryResponse {
  given encoderQueryResponse: Encoder[QueryResponse] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        Some("results" -> t.results.asJson),
        Some("request_id" -> t.requestId.asJson)
      ).flatten
    }
  }
  given decoderQueryResponse: Decoder[QueryResponse] = Decoder.instance { c =>
    for {
      results <- c.downField("results").as[Seq[Map[String, AnyType]]]
      requestId <- c.downField("request_id").as[String]
    } yield QueryResponse(
      results = results,
      requestId = requestId
    )
  }
}

