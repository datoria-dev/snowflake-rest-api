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
  * @param cronExpr A cron expression for the scheduled execution.
  * @param timezone The time zone for the schedule.
  */
case class CronSchedule1(
    cronExpr: String,
    timezone: String
)
  
object CronSchedule1 {
  given encoderCronSchedule1: Encoder[CronSchedule1] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        Some("cron_expr" -> t.cronExpr.asJson),
        Some("timezone" -> t.timezone.asJson)
      ).flatten
    }
  }
  given decoderCronSchedule1: Decoder[CronSchedule1] = Decoder.instance { c =>
    for {
      cronExpr <- c.downField("cron_expr").as[String]
      timezone <- c.downField("timezone").as[String]
    } yield CronSchedule1(
      cronExpr = cronExpr,
      timezone = timezone
    )
  }
}

