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
  * @param externalAccessIntegrations List of external access integrations attached to this function/procedure
  * @param secrets Secrets to be used with this function/procedure for external access
  * @param targetPath Specifies where Snowflake should write the compiled code for inline procedures
  * @param runtimeVersion Specifies the Java JDK runtime version to use.                      The supported versions of Java are 11.x and 17.x (Preview support)
  */
case class JavaFunction1(
    externalAccessIntegrations: Option[Seq[String]] = None,
    secrets: Option[Map[String, String]] = None,
    targetPath: Option[String] = None,
    runtimeVersion: String
)
  
object JavaFunction1 {
  given encoderJavaFunction1: Encoder[JavaFunction1] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        t.externalAccessIntegrations.map(v => "external_access_integrations" -> v.asJson),
        t.secrets.map(v => "secrets" -> v.asJson),
        t.targetPath.map(v => "target_path" -> v.asJson),
        Some("runtime_version" -> t.runtimeVersion.asJson)
      ).flatten
    }
  }
  given decoderJavaFunction1: Decoder[JavaFunction1] = Decoder.instance { c =>
    for {
      externalAccessIntegrations <- c.downField("external_access_integrations").as[Option[Seq[String]]]
      secrets <- c.downField("secrets").as[Option[Map[String, String]]]
      targetPath <- c.downField("target_path").as[Option[String]]
      runtimeVersion <- c.downField("runtime_version").as[String]
    } yield JavaFunction1(
      externalAccessIntegrations = externalAccessIntegrations,
      secrets = secrets,
      targetPath = targetPath,
      runtimeVersion = runtimeVersion
    )
  }
}

