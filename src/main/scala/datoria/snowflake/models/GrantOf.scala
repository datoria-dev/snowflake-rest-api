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

/** 
  * @param createdOn Date and time when the grant was created
  * @param role The name of the service role
  * @param grantedTo The type of the grantee, can be USER or ROLE
  * @param granteeName The name of the grantee
  * @param grantedBy The name of role that granted the service role to the grantee
  */
case class GrantOf(
    createdOn: Option[Instant] = None,
    role: Option[String] = None,
    grantedTo: Option[String] = None,
    granteeName: Option[String] = None,
    grantedBy: Option[String] = None
)
  
object GrantOf {
  given encoderGrantOf: Encoder[GrantOf] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        t.createdOn.map(v => "created_on" -> v.asJson),
        t.role.map(v => "role" -> v.asJson),
        t.grantedTo.map(v => "granted_to" -> v.asJson),
        t.granteeName.map(v => "grantee_name" -> v.asJson),
        t.grantedBy.map(v => "granted_by" -> v.asJson)
      ).flatten
    }
  }
  given decoderGrantOf: Decoder[GrantOf] = Decoder.instance { c =>
    for {
      createdOn <- c.downField("created_on").as[Option[Instant]]
      role <- c.downField("role").as[Option[String]]
      grantedTo <- c.downField("granted_to").as[Option[String]]
      granteeName <- c.downField("grantee_name").as[Option[String]]
      grantedBy <- c.downField("granted_by").as[Option[String]]
    } yield GrantOf(
      createdOn = createdOn,
      role = role,
      grantedTo = grantedTo,
      granteeName = granteeName,
      grantedBy = grantedBy
    )
  }
}

