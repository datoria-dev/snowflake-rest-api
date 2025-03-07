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

/** Foreign keys link data in one table to the data in another table.
  * @param referencedTableName 
  * @param referencedColumnNames 
  */
case class ForeignKey(
    referencedTableName: String,
    referencedColumnNames: Seq[String]
)
  
object ForeignKey {
  given encoderForeignKey: Encoder[ForeignKey] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        Some("referenced_table_name" -> t.referencedTableName.asJson),
        Some("referenced_column_names" -> t.referencedColumnNames.asJson)
      ).flatten
    }
  }
  given decoderForeignKey: Decoder[ForeignKey] = Decoder.instance { c =>
    for {
      referencedTableName <- c.downField("referenced_table_name").as[String]
      referencedColumnNames <- c.downField("referenced_column_names").as[Seq[String]]
    } yield ForeignKey(
      referencedTableName = referencedTableName,
      referencedColumnNames = referencedColumnNames
    )
  }
}

