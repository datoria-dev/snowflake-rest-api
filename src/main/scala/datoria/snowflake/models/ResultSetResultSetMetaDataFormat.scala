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


/** For v2 endpoints the only possible value for this field is jsonv2.
  */
enum ResultSetResultSetMetaDataFormat(val value: String) {
  case Jsonv2 extends ResultSetResultSetMetaDataFormat("jsonv2")
}

object ResultSetResultSetMetaDataFormat {

  def withValueOpt(value: String): Option[ResultSetResultSetMetaDataFormat] = ResultSetResultSetMetaDataFormat.values.find(_.value == value)
  def withValue(value: String): ResultSetResultSetMetaDataFormat =
    withValueOpt(value).getOrElse(throw java.lang.IllegalArgumentException(s"ResultSetResultSetMetaDataFormat enum case not found: $value"))

  given decoderResultSetResultSetMetaDataFormat: Decoder[ResultSetResultSetMetaDataFormat] = Decoder.decodeString.map(withValue)
  given encoderResultSetResultSetMetaDataFormat: Encoder[ResultSetResultSetMetaDataFormat] = Encoder.encodeString.contramap[ResultSetResultSetMetaDataFormat](_.value)

}

