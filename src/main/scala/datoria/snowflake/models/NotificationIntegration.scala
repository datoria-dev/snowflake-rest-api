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

/** A Snowflake notification
  * @param name Name of the notification.
  * @param enabled Whether the notification integration is enabled.
  * @param comment Comment for the notification integration.
  * @param createdOn Date and time when the notification was created.
  * @param notificationHook 
  */
case class NotificationIntegration(
    name: String,
    enabled: Option[Boolean] = None,
    comment: Option[String] = None,
    createdOn: Option[Instant] = None,
    notificationHook: NotificationHook
)
  
object NotificationIntegration {
  given encoderNotificationIntegration: Encoder[NotificationIntegration] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        Some("name" -> t.name.asJson),
        t.enabled.map(v => "enabled" -> v.asJson),
        t.comment.map(v => "comment" -> v.asJson),
        t.createdOn.map(v => "created_on" -> v.asJson),
        Some("notification_hook" -> t.notificationHook.asJson)
      ).flatten
    }
  }
  given decoderNotificationIntegration: Decoder[NotificationIntegration] = Decoder.instance { c =>
    for {
      name <- c.downField("name").as[String]
      enabled <- c.downField("enabled").as[Option[Boolean]]
      comment <- c.downField("comment").as[Option[String]]
      createdOn <- c.downField("created_on").as[Option[Instant]]
      notificationHook <- c.downField("notification_hook").as[NotificationHook]
    } yield NotificationIntegration(
      name = name,
      enabled = enabled,
      comment = comment,
      createdOn = createdOn,
      notificationHook = notificationHook
    )
  }
}

