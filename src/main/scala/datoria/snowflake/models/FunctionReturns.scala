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


/** Specifies the type for the function return value.
  */
enum FunctionReturns(val value: String) {
  case FIXED extends FunctionReturns("FIXED")
  case `INT` extends FunctionReturns("INT")
  case REAL extends FunctionReturns("REAL")
  case NUMBER extends FunctionReturns("NUMBER")
  case TEXT extends FunctionReturns("TEXT")
  case BOOLEAN extends FunctionReturns("BOOLEAN")
  case DATE extends FunctionReturns("DATE")
  case TIME extends FunctionReturns("TIME")
  case TIMESTAMPTZ extends FunctionReturns("TIMESTAMP_TZ")
  case TIMESTAMPLTZ extends FunctionReturns("TIMESTAMP_LTZ")
  case TIMESTAMPNTZ extends FunctionReturns("TIMESTAMP_NTZ")
}

object FunctionReturns {

  def withValueOpt(value: String): Option[FunctionReturns] = FunctionReturns.values.find(_.value == value)
  def withValue(value: String): FunctionReturns =
    withValueOpt(value).getOrElse(throw java.lang.IllegalArgumentException(s"FunctionReturns enum case not found: $value"))

  given decoderFunctionReturns: Decoder[FunctionReturns] = Decoder.decodeString.map(withValue)
  given encoderFunctionReturns: Encoder[FunctionReturns] = Encoder.encodeString.contramap[FunctionReturns](_.value)

}

