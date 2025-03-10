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

/** Catalog integration
  * @param name Name of the catalog integration.
  * @param catalog 
  * @param tableFormat 
  * @param enabled whether this catalog integration is available to use for Iceberg tables. 
  * @param comment Comment.
  * @param `type` Type of the integration. Always CATALOG.
  * @param category Category of the integration. Always CATALOG.
  * @param createdOn Date and time when the catalog integration was created.
  */
case class CatalogIntegration(
    name: String,
    catalog: Catalog,
    tableFormat: CatalogIntegrationTableFormat,
    enabled: Boolean,
    comment: Option[String] = None,
    `type`: Option[String] = None,
    category: Option[String] = None,
    createdOn: Option[Instant] = None
)
  
object CatalogIntegration {
  given encoderCatalogIntegration: Encoder[CatalogIntegration] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        Some("name" -> t.name.asJson),
        Some("catalog" -> t.catalog.asJson),
        Some("table_format" -> t.tableFormat.asJson),
        Some("enabled" -> t.enabled.asJson),
        t.comment.map(v => "comment" -> v.asJson),
        t.`type`.map(v => "type" -> v.asJson),
        t.category.map(v => "category" -> v.asJson),
        t.createdOn.map(v => "created_on" -> v.asJson)
      ).flatten
    }
  }
  given decoderCatalogIntegration: Decoder[CatalogIntegration] = Decoder.instance { c =>
    for {
      name <- c.downField("name").as[String]
      catalog <- c.downField("catalog").as[Catalog]
      tableFormat <- c.downField("table_format").as[CatalogIntegrationTableFormat]
      enabled <- c.downField("enabled").as[Boolean]
      comment <- c.downField("comment").as[Option[String]]
      `type` <- c.downField("type").as[Option[String]]
      category <- c.downField("category").as[Option[String]]
      createdOn <- c.downField("created_on").as[Option[Instant]]
    } yield CatalogIntegration(
      name = name,
      catalog = catalog,
      tableFormat = tableFormat,
      enabled = enabled,
      comment = comment,
      `type` = `type`,
      category = category,
      createdOn = createdOn
    )
  }
}

