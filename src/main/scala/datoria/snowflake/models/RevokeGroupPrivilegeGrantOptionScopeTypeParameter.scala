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
  */
enum RevokeGroupPrivilegeGrantOptionScopeTypeParameter(val value: String) {
  case Database extends RevokeGroupPrivilegeGrantOptionScopeTypeParameter("database")
  case Schema extends RevokeGroupPrivilegeGrantOptionScopeTypeParameter("schema")
}

object RevokeGroupPrivilegeGrantOptionScopeTypeParameter {

  def withValueOpt(value: String): Option[RevokeGroupPrivilegeGrantOptionScopeTypeParameter] = RevokeGroupPrivilegeGrantOptionScopeTypeParameter.values.find(_.value == value)
  def withValue(value: String): RevokeGroupPrivilegeGrantOptionScopeTypeParameter =
    withValueOpt(value).getOrElse(throw java.lang.IllegalArgumentException(s"RevokeGroupPrivilegeGrantOptionScopeTypeParameter enum case not found: $value"))

  given decoderRevokeGroupPrivilegeGrantOptionScopeTypeParameter: Decoder[RevokeGroupPrivilegeGrantOptionScopeTypeParameter] = Decoder.decodeString.map(withValue)
  given encoderRevokeGroupPrivilegeGrantOptionScopeTypeParameter: Encoder[RevokeGroupPrivilegeGrantOptionScopeTypeParameter] = Encoder.encodeString.contramap[RevokeGroupPrivilegeGrantOptionScopeTypeParameter](_.value)

}

