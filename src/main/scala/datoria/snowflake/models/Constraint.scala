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

/** Constraints define integrity and consistency rules for data stored in tables.
  * @param name Name of the Constraint
  * @param columnNames 
  * @param constraintType Type of the constraint
  */
case class Constraint(
    name: Option[String] = None,
    columnNames: Option[Seq[String]] = None,
    constraintType: Option[String] = None
)
  
object Constraint {
  given encoderConstraint: Encoder[Constraint] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        t.name.map(v => "name" -> v.asJson),
        t.columnNames.map(v => "column_names" -> v.asJson),
        t.constraintType.map(v => "constraint_type" -> v.asJson)
      ).flatten
    }
  }
  given decoderConstraint: Decoder[Constraint] = Decoder.instance { c =>
    for {
      name <- c.downField("name").as[Option[String]]
      columnNames <- c.downField("column_names").as[Option[Seq[String]]]
      constraintType <- c.downField("constraint_type").as[Option[String]]
    } yield Constraint(
      name = name,
      columnNames = columnNames,
      constraintType = constraintType
    )
  }
}

