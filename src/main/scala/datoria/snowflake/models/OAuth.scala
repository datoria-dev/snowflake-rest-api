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

/** 
  * @param oauthClientId The client ID of the OAuth2 credential associated with the Polaris service connection.
  * @param oauthClientSecret The secret for the OAuth2 credential associated with the Polaris service connection.
  * @param oauthAllowedScopes The scope of the OAuth token. Only one scope is included in the Iceberg REST API specification, but catalogs can support more than one scope in their implementation.
  */
case class OAuth(
    oauthClientId: String,
    oauthClientSecret: String,
    oauthAllowedScopes: Seq[String]
)
  
object OAuth {
  given encoderOAuth: Encoder[OAuth] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        Some("oauth_client_id" -> t.oauthClientId.asJson),
        Some("oauth_client_secret" -> t.oauthClientSecret.asJson),
        Some("oauth_allowed_scopes" -> t.oauthAllowedScopes.asJson)
      ).flatten
    }
  }
  given decoderOAuth: Decoder[OAuth] = Decoder.instance { c =>
    for {
      oauthClientId <- c.downField("oauth_client_id").as[String]
      oauthClientSecret <- c.downField("oauth_client_secret").as[String]
      oauthAllowedScopes <- c.downField("oauth_allowed_scopes").as[Seq[String]]
    } yield OAuth(
      oauthClientId = oauthClientId,
      oauthClientSecret = oauthClientSecret,
      oauthAllowedScopes = oauthAllowedScopes
    )
  }
}

