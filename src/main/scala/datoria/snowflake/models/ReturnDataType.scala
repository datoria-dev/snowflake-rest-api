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
  * @param datatype Return data type
  * @param nullable Argument null return acceptance criteria
  */
case class ReturnDataType(
    datatype: String,
    nullable: Option[Boolean] = None
)
  
object ReturnDataType {
  given encoderReturnDataType: Encoder[ReturnDataType] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        Some("datatype" -> t.datatype.asJson),
        t.nullable.map(v => "nullable" -> v.asJson)
      ).flatten
    }
  }
  given decoderReturnDataType: Decoder[ReturnDataType] = Decoder.instance { c =>
    for {
      datatype <- c.downField("datatype").as[String]
      nullable <- c.downField("nullable").as[Option[Boolean]]
    } yield ReturnDataType(
      datatype = datatype,
      nullable = nullable
    )
  }
}

