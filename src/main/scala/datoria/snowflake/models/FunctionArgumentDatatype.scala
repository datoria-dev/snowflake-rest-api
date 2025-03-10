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


/** Argument's type
  */
enum FunctionArgumentDatatype(val value: String) {
  case FIXED extends FunctionArgumentDatatype("FIXED")
  case `INT` extends FunctionArgumentDatatype("INT")
  case REAL extends FunctionArgumentDatatype("REAL")
  case NUMBER extends FunctionArgumentDatatype("NUMBER")
  case TEXT extends FunctionArgumentDatatype("TEXT")
  case BOOLEAN extends FunctionArgumentDatatype("BOOLEAN")
  case DATE extends FunctionArgumentDatatype("DATE")
  case TIME extends FunctionArgumentDatatype("TIME")
  case TIMESTAMPTZ extends FunctionArgumentDatatype("TIMESTAMP_TZ")
  case TIMESTAMPLTZ extends FunctionArgumentDatatype("TIMESTAMP_LTZ")
  case TIMESTAMPNTZ extends FunctionArgumentDatatype("TIMESTAMP_NTZ")
}

object FunctionArgumentDatatype {

  def withValueOpt(value: String): Option[FunctionArgumentDatatype] = FunctionArgumentDatatype.values.find(_.value == value)
  def withValue(value: String): FunctionArgumentDatatype =
    withValueOpt(value).getOrElse(throw java.lang.IllegalArgumentException(s"FunctionArgumentDatatype enum case not found: $value"))

  given decoderFunctionArgumentDatatype: Decoder[FunctionArgumentDatatype] = Decoder.decodeString.map(withValue)
  given encoderFunctionArgumentDatatype: Encoder[FunctionArgumentDatatype] = Encoder.encodeString.contramap[FunctionArgumentDatatype](_.value)

}

