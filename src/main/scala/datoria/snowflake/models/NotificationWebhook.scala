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
  * @param webhookUrl The URL for the webhook. The URL must use the https:// protocol.
  * @param webhookSecret 
  * @param webhookBodyTemplate A template for the body of the HTTP request to send for the notification.
  * @param webhookHeaders A list of HTTP headers and values to include in the HTTP request for the webhook.
  */
case class NotificationWebhook(
    webhookUrl: String,
    webhookSecret: Option[WebhookSecret] = None,
    webhookBodyTemplate: Option[String] = None,
    webhookHeaders: Option[Map[String, String]] = None
)
  
object NotificationWebhook {
  given encoderNotificationWebhook: Encoder[NotificationWebhook] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        Some("webhook_url" -> t.webhookUrl.asJson),
        t.webhookSecret.map(v => "webhook_secret" -> v.asJson),
        t.webhookBodyTemplate.map(v => "webhook_body_template" -> v.asJson),
        t.webhookHeaders.map(v => "webhook_headers" -> v.asJson)
      ).flatten
    }
  }
  given decoderNotificationWebhook: Decoder[NotificationWebhook] = Decoder.instance { c =>
    for {
      webhookUrl <- c.downField("webhook_url").as[String]
      webhookSecret <- c.downField("webhook_secret").as[Option[WebhookSecret]]
      webhookBodyTemplate <- c.downField("webhook_body_template").as[Option[String]]
      webhookHeaders <- c.downField("webhook_headers").as[Option[Map[String, String]]]
    } yield NotificationWebhook(
      webhookUrl = webhookUrl,
      webhookSecret = webhookSecret,
      webhookBodyTemplate = webhookBodyTemplate,
      webhookHeaders = webhookHeaders
    )
  }
}

