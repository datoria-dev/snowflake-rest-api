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
import scala.collection.immutable.Seq

/** A Snowflake notebook
  * @param name Name of the notebook
  * @param version User specified version alias
  * @param fromLocation Location to copy the file from. This must be a Snowflake stage location.
  * @param mainFile Name + path of the file for the Notebook
  * @param comment user comment associated to an object in the dictionary
  * @param defaultVersion The default version name of a file based entity.
  * @param queryWarehouse Warehouse against which the queries issued by the Streamlit app are run against
  * @param createdOn Date and time when the notebook was created.
  * @param databaseName Database in which the notebook is stored
  * @param schemaName Schema in which the notebook is stored
  * @param owner Role that owns the notebook
  * @param ownerRoleType The type of role that owns the notebook
  * @param urlId Unique ID associated with the notebook object.
  * @param title User facing title of the Streamlit app or an Organization Profile
  * @param defaultPackages Default packages of the notebook
  * @param userPackages User packages of the notebook
  * @param runtimeName The runtime to run the Streamlit or Notebook on.  If this is not set, the warehouse is assumed
  * @param computePool Compute pool name where the snowservice runs
  * @param importUrls List of urls
  * @param externalAccessIntegrations List of external access integrations attached to this function
  * @param externalAccessSecrets Secrets to be used with this function for external access
  * @param idleAutoShutdownTimeSeconds Sets the time in seconds for when to shutdown an idle Notebook.
  * @param defaultVersionDetails 
  * @param lastVersionDetails 
  * @param liveVersionLocationUri The current version location
  * @param budget Name of the budget if the notebook is monitored by a budget
  */
case class Notebook(
    name: String,
    version: Option[String] = None,
    fromLocation: Option[String] = None,
    mainFile: Option[String] = None,
    comment: Option[String] = None,
    defaultVersion: Option[String] = None,
    queryWarehouse: Option[String] = None,
    createdOn: Option[Instant] = None,
    databaseName: Option[String] = None,
    schemaName: Option[String] = None,
    owner: Option[String] = None,
    ownerRoleType: Option[String] = None,
    urlId: Option[String] = None,
    title: Option[String] = None,
    defaultPackages: Option[String] = None,
    userPackages: Option[String] = None,
    runtimeName: Option[String] = None,
    computePool: Option[String] = None,
    importUrls: Option[Seq[String]] = None,
    externalAccessIntegrations: Option[Seq[String]] = None,
    externalAccessSecrets: Option[String] = None,
    idleAutoShutdownTimeSeconds: Option[Long] = None,
    defaultVersionDetails: Option[VersionDetails] = None,
    lastVersionDetails: Option[VersionDetails] = None,
    liveVersionLocationUri: Option[String] = None,
    budget: Option[String] = None
)
  
object Notebook {
  given encoderNotebook: Encoder[Notebook] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        Some("name" -> t.name.asJson),
        t.version.map(v => "version" -> v.asJson),
        t.fromLocation.map(v => "fromLocation" -> v.asJson),
        t.mainFile.map(v => "main_file" -> v.asJson),
        t.comment.map(v => "comment" -> v.asJson),
        t.defaultVersion.map(v => "default_version" -> v.asJson),
        t.queryWarehouse.map(v => "query_warehouse" -> v.asJson),
        t.createdOn.map(v => "created_on" -> v.asJson),
        t.databaseName.map(v => "database_name" -> v.asJson),
        t.schemaName.map(v => "schema_name" -> v.asJson),
        t.owner.map(v => "owner" -> v.asJson),
        t.ownerRoleType.map(v => "owner_role_type" -> v.asJson),
        t.urlId.map(v => "url_id" -> v.asJson),
        t.title.map(v => "title" -> v.asJson),
        t.defaultPackages.map(v => "default_packages" -> v.asJson),
        t.userPackages.map(v => "user_packages" -> v.asJson),
        t.runtimeName.map(v => "runtime_name" -> v.asJson),
        t.computePool.map(v => "compute_pool" -> v.asJson),
        t.importUrls.map(v => "import_urls" -> v.asJson),
        t.externalAccessIntegrations.map(v => "external_access_integrations" -> v.asJson),
        t.externalAccessSecrets.map(v => "external_access_secrets" -> v.asJson),
        t.idleAutoShutdownTimeSeconds.map(v => "idle_auto_shutdown_time_seconds" -> v.asJson),
        t.defaultVersionDetails.map(v => "default_version_details" -> v.asJson),
        t.lastVersionDetails.map(v => "last_version_details" -> v.asJson),
        t.liveVersionLocationUri.map(v => "live_version_location_uri" -> v.asJson),
        t.budget.map(v => "budget" -> v.asJson)
      ).flatten
    }
  }
  given decoderNotebook: Decoder[Notebook] = Decoder.instance { c =>
    for {
      name <- c.downField("name").as[String]
      version <- c.downField("version").as[Option[String]]
      fromLocation <- c.downField("fromLocation").as[Option[String]]
      mainFile <- c.downField("main_file").as[Option[String]]
      comment <- c.downField("comment").as[Option[String]]
      defaultVersion <- c.downField("default_version").as[Option[String]]
      queryWarehouse <- c.downField("query_warehouse").as[Option[String]]
      createdOn <- c.downField("created_on").as[Option[Instant]]
      databaseName <- c.downField("database_name").as[Option[String]]
      schemaName <- c.downField("schema_name").as[Option[String]]
      owner <- c.downField("owner").as[Option[String]]
      ownerRoleType <- c.downField("owner_role_type").as[Option[String]]
      urlId <- c.downField("url_id").as[Option[String]]
      title <- c.downField("title").as[Option[String]]
      defaultPackages <- c.downField("default_packages").as[Option[String]]
      userPackages <- c.downField("user_packages").as[Option[String]]
      runtimeName <- c.downField("runtime_name").as[Option[String]]
      computePool <- c.downField("compute_pool").as[Option[String]]
      importUrls <- c.downField("import_urls").as[Option[Seq[String]]]
      externalAccessIntegrations <- c.downField("external_access_integrations").as[Option[Seq[String]]]
      externalAccessSecrets <- c.downField("external_access_secrets").as[Option[String]]
      idleAutoShutdownTimeSeconds <- c.downField("idle_auto_shutdown_time_seconds").as[Option[Long]]
      defaultVersionDetails <- c.downField("default_version_details").as[Option[VersionDetails]]
      lastVersionDetails <- c.downField("last_version_details").as[Option[VersionDetails]]
      liveVersionLocationUri <- c.downField("live_version_location_uri").as[Option[String]]
      budget <- c.downField("budget").as[Option[String]]
    } yield Notebook(
      name = name,
      version = version,
      fromLocation = fromLocation,
      mainFile = mainFile,
      comment = comment,
      defaultVersion = defaultVersion,
      queryWarehouse = queryWarehouse,
      createdOn = createdOn,
      databaseName = databaseName,
      schemaName = schemaName,
      owner = owner,
      ownerRoleType = ownerRoleType,
      urlId = urlId,
      title = title,
      defaultPackages = defaultPackages,
      userPackages = userPackages,
      runtimeName = runtimeName,
      computePool = computePool,
      importUrls = importUrls,
      externalAccessIntegrations = externalAccessIntegrations,
      externalAccessSecrets = externalAccessSecrets,
      idleAutoShutdownTimeSeconds = idleAutoShutdownTimeSeconds,
      defaultVersionDetails = defaultVersionDetails,
      lastVersionDetails = lastVersionDetails,
      liveVersionLocationUri = liveVersionLocationUri,
      budget = budget
    )
  }
}

