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
  * @param name Name of the alert
  * @param pointOfTime 
  */
case class AlertClone(
    name: String,
    pointOfTime: Option[PointOfTime] = None
)
  
object AlertClone {
  given encoderAlertClone: Encoder[AlertClone] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        Some("name" -> t.name.asJson),
        t.pointOfTime.map(v => "point_of_time" -> v.asJson)
      ).flatten
    }
  }
  given decoderAlertClone: Decoder[AlertClone] = Decoder.instance { c =>
    for {
      name <- c.downField("name").as[String]
      pointOfTime <- c.downField("point_of_time").as[Option[PointOfTime]]
    } yield AlertClone(
      name = name,
      pointOfTime = pointOfTime
    )
  }
}

