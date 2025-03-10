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


/** A image in a Snowflake image repository.
  * @param createdOn Date and time when the image was uploaded to the image repository.
  * @param imageName Image name.
  * @param tags Image tags.
  * @param digest SHA256 digest of the image.
  * @param imagePath Image path (database_name/schema_name/repository_name/image_name:image_tag).
  */
case class Image(
    createdOn: Option[String] = None,
    imageName: Option[String] = None,
    tags: Option[String] = None,
    digest: Option[String] = None,
    imagePath: Option[String] = None
)
  
object Image {
  given encoderImage: Encoder[Image] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        t.createdOn.map(v => "created_on" -> v.asJson),
        t.imageName.map(v => "image_name" -> v.asJson),
        t.tags.map(v => "tags" -> v.asJson),
        t.digest.map(v => "digest" -> v.asJson),
        t.imagePath.map(v => "image_path" -> v.asJson)
      ).flatten
    }
  }
  given decoderImage: Decoder[Image] = Decoder.instance { c =>
    for {
      createdOn <- c.downField("created_on").as[Option[String]]
      imageName <- c.downField("image_name").as[Option[String]]
      tags <- c.downField("tags").as[Option[String]]
      digest <- c.downField("digest").as[Option[String]]
      imagePath <- c.downField("image_path").as[Option[String]]
    } yield Image(
      createdOn = createdOn,
      imageName = imageName,
      tags = tags,
      digest = digest,
      imagePath = imagePath
    )
  }
}

