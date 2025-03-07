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

/** Unique keys are columns in a table that uniquely identify items in the rows. This sounds a lot like a primary key, but the main difference is that unique keys can have NULL values.
  */
case class UniqueKey(
)
  
object UniqueKey {
  given encoderUniqueKey: Encoder[UniqueKey] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
      ).flatten
    }
  }
  given decoderUniqueKey: Decoder[UniqueKey] = Decoder.instance { c =>
    for {
    } yield UniqueKey(
    )
  }
}

