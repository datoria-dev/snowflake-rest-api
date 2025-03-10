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


/** The version details of a file based entity
  * @param name The last version name
  * @param alias The default/last version alias of a file based entity.
  * @param locationUrl The default/last version location.
  * @param sourceLocationUri The default/last version source location.
  * @param gitCommitHash The default/last version git commit#
  */
case class VersionDetails(
    name: Option[String] = None,
    alias: Option[String] = None,
    locationUrl: Option[String] = None,
    sourceLocationUri: Option[String] = None,
    gitCommitHash: Option[String] = None
)
  
object VersionDetails {
  given encoderVersionDetails: Encoder[VersionDetails] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        t.name.map(v => "name" -> v.asJson),
        t.alias.map(v => "alias" -> v.asJson),
        t.locationUrl.map(v => "location_url" -> v.asJson),
        t.sourceLocationUri.map(v => "source_location_uri" -> v.asJson),
        t.gitCommitHash.map(v => "git_commit_hash" -> v.asJson)
      ).flatten
    }
  }
  given decoderVersionDetails: Decoder[VersionDetails] = Decoder.instance { c =>
    for {
      name <- c.downField("name").as[Option[String]]
      alias <- c.downField("alias").as[Option[String]]
      locationUrl <- c.downField("location_url").as[Option[String]]
      sourceLocationUri <- c.downField("source_location_uri").as[Option[String]]
      gitCommitHash <- c.downField("git_commit_hash").as[Option[String]]
    } yield VersionDetails(
      name = name,
      alias = alias,
      locationUrl = locationUrl,
      sourceLocationUri = sourceLocationUri,
      gitCommitHash = gitCommitHash
    )
  }
}

