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


/** Specifies the Azure credentials of the stage.
  * @param azureSasToken Specifies the SAS (shared access signature) token for connecting to Azure.
  */
case class AzureCredentials(
    azureSasToken: Option[String] = None
)
  
object AzureCredentials {
  given encoderAzureCredentials: Encoder[AzureCredentials] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        t.azureSasToken.map(v => "azure_sas_token" -> v.asJson)
      ).flatten
    }
  }
  given decoderAzureCredentials: Decoder[AzureCredentials] = Decoder.instance { c =>
    for {
      azureSasToken <- c.downField("azure_sas_token").as[Option[String]]
    } yield AzureCredentials(
      azureSasToken = azureSasToken
    )
  }
}

