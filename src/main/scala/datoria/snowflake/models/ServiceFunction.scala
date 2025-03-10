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

import java.time.Instant
import scala.collection.immutable.Seq

/** Service based function
  * @param service A Snowflake object identifier.
  * @param serviceDatabase A Snowflake object identifier.
  * @param serviceSchema A Snowflake object identifier.
  * @param endpoint Function's endpoint
  * @param path Function's path
  */
case class ServiceFunction(
    service: String,
    serviceDatabase: Option[String] = None,
    serviceSchema: Option[String] = None,
    endpoint: String,
    path: String
)
  
object ServiceFunction {
  given encoderServiceFunction: Encoder[ServiceFunction] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        Some("service" -> t.service.asJson),
        t.serviceDatabase.map(v => "service_database" -> v.asJson),
        t.serviceSchema.map(v => "service_schema" -> v.asJson),
        Some("endpoint" -> t.endpoint.asJson),
        Some("path" -> t.path.asJson)
      ).flatten
    }
  }
  given decoderServiceFunction: Decoder[ServiceFunction] = Decoder.instance { c =>
    for {
      service <- c.downField("service").as[String]
      serviceDatabase <- c.downField("service_database").as[Option[String]]
      serviceSchema <- c.downField("service_schema").as[Option[String]]
      endpoint <- c.downField("endpoint").as[String]
      path <- c.downField("path").as[String]
    } yield ServiceFunction(
      service = service,
      serviceDatabase = serviceDatabase,
      serviceSchema = serviceSchema,
      endpoint = endpoint,
      path = path
    )
  }
}

