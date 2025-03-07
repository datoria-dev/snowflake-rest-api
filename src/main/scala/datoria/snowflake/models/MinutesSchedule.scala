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


/** A schedule for executing a task at specified intervals of minutes.
  * @param minutes The number of minutes between each task run.
  */
case class MinutesSchedule(
    minutes: Int
)
  
object MinutesSchedule {
  given encoderMinutesSchedule: Encoder[MinutesSchedule] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        Some("minutes" -> t.minutes.asJson)
      ).flatten
    }
  }
  given decoderMinutesSchedule: Decoder[MinutesSchedule] = Decoder.instance { c =>
    for {
      minutes <- c.downField("minutes").as[Int]
    } yield MinutesSchedule(
      minutes = minutes
    )
  }
}

