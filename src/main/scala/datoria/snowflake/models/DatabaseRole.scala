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

/** A Snowflake database role
  * @param name Name of the database role
  * @param comment User comment associated to an object in the dictionary
  * @param createdOn Date and time when the database role was created
  * @param grantedToRoles How many roles this database role has been granted to
  * @param grantedToDatabaseRoles How many database roles this database role has been granted to
  * @param grantedDatabaseRoles How many database roles this database role has been granted
  * @param owner Role that owns the database role
  * @param ownerRoleType The type of role that owns the database role
  */
case class DatabaseRole(
    name: String,
    comment: Option[String] = None,
    createdOn: Option[Instant] = None,
    grantedToRoles: Option[Long] = None,
    grantedToDatabaseRoles: Option[Long] = None,
    grantedDatabaseRoles: Option[Long] = None,
    owner: Option[String] = None,
    ownerRoleType: Option[String] = None
)
  
object DatabaseRole {
  given encoderDatabaseRole: Encoder[DatabaseRole] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        Some("name" -> t.name.asJson),
        t.comment.map(v => "comment" -> v.asJson),
        t.createdOn.map(v => "created_on" -> v.asJson),
        t.grantedToRoles.map(v => "granted_to_roles" -> v.asJson),
        t.grantedToDatabaseRoles.map(v => "granted_to_database_roles" -> v.asJson),
        t.grantedDatabaseRoles.map(v => "granted_database_roles" -> v.asJson),
        t.owner.map(v => "owner" -> v.asJson),
        t.ownerRoleType.map(v => "owner_role_type" -> v.asJson)
      ).flatten
    }
  }
  given decoderDatabaseRole: Decoder[DatabaseRole] = Decoder.instance { c =>
    for {
      name <- c.downField("name").as[String]
      comment <- c.downField("comment").as[Option[String]]
      createdOn <- c.downField("created_on").as[Option[Instant]]
      grantedToRoles <- c.downField("granted_to_roles").as[Option[Long]]
      grantedToDatabaseRoles <- c.downField("granted_to_database_roles").as[Option[Long]]
      grantedDatabaseRoles <- c.downField("granted_database_roles").as[Option[Long]]
      owner <- c.downField("owner").as[Option[String]]
      ownerRoleType <- c.downField("owner_role_type").as[Option[String]]
    } yield DatabaseRole(
      name = name,
      comment = comment,
      createdOn = createdOn,
      grantedToRoles = grantedToRoles,
      grantedToDatabaseRoles = grantedToDatabaseRoles,
      grantedDatabaseRoles = grantedDatabaseRoles,
      owner = owner,
      ownerRoleType = ownerRoleType
    )
  }
}

