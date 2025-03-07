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

/** A Snowflake table
  * @param name Specifies the name for the table, must be unique for the schema in which the table is created
  * @param kind 
  * @param clusterBy Specifies one or more columns or column expressions in the table as the clustering key
  * @param enableSchemaEvolution Table has schema evolution enabled or disabled
  * @param changeTracking Change tracking is enabled or disabled
  * @param dataRetentionTimeInDays Specifies the retention period for the table so that Time Travel actions SELECT, CLONE, UNDROP can be performed on historical data in the table
  * @param maxDataExtensionTimeInDays Specifies the retention period for the table so that Time Travel actions SELECT, CLONE, UNDROP can be performed on historical data in the table
  * @param defaultDdlCollation Specifies a default collation specification for the columns in the table, including columns added to the table in the future
  * @param columns 
  * @param constraints 
  * @param comment Comment for the table
  * @param createdOn Date and time when the table was created.
  * @param databaseName Database in which the table is stored
  * @param schemaName Schema in which the table is stored
  * @param rows Number of rows in the table. Returns NULL for external tables.
  * @param bytes Number of bytes that will be scanned if the entire table is scanned in a query. Note that this number may be different than the number of actual physical bytes stored on-disk for the table
  * @param owner Role that owns the table
  * @param droppedOn Date and time when the table was dropped
  * @param automaticClustering If Automatic Clustering is enabled for your account, specifies whether it is explicitly enabled or disabled for the table.
  * @param searchOptimization If ON, the table has the search optimization service enabled
  * @param searchOptimizationProgress Percentage of the table that has been optimized for search.
  * @param searchOptimizationBytes Number of additional bytes of storage that the search optimization service consumes for this table
  * @param ownerRoleType The type of role that owns the object.
  * @param budget Name of the budget if the object is monitored by a budget
  * @param tableType 
  */
case class Table(
    name: String,
    kind: Option[TableKind] = None,
    clusterBy: Option[Seq[String]] = None,
    enableSchemaEvolution: Option[Boolean] = None,
    changeTracking: Option[Boolean] = None,
    dataRetentionTimeInDays: Option[Int] = None,
    maxDataExtensionTimeInDays: Option[Int] = None,
    defaultDdlCollation: Option[String] = None,
    columns: Option[Seq[TableColumn]] = None,
    constraints: Option[Seq[Constraint]] = None,
    comment: Option[String] = None,
    createdOn: Option[Instant] = None,
    databaseName: Option[String] = None,
    schemaName: Option[String] = None,
    rows: Option[Long] = None,
    bytes: Option[Long] = None,
    owner: Option[String] = None,
    droppedOn: Option[Instant] = None,
    automaticClustering: Option[Boolean] = None,
    searchOptimization: Option[Boolean] = None,
    searchOptimizationProgress: Option[Long] = None,
    searchOptimizationBytes: Option[Long] = None,
    ownerRoleType: Option[String] = None,
    budget: Option[String] = None,
    tableType: Option[TableTableType] = None
)
  
object Table {
  given encoderTable: Encoder[Table] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        Some("name" -> t.name.asJson),
        t.kind.map(v => "kind" -> v.asJson),
        t.clusterBy.map(v => "cluster_by" -> v.asJson),
        t.enableSchemaEvolution.map(v => "enable_schema_evolution" -> v.asJson),
        t.changeTracking.map(v => "change_tracking" -> v.asJson),
        t.dataRetentionTimeInDays.map(v => "data_retention_time_in_days" -> v.asJson),
        t.maxDataExtensionTimeInDays.map(v => "max_data_extension_time_in_days" -> v.asJson),
        t.defaultDdlCollation.map(v => "default_ddl_collation" -> v.asJson),
        t.columns.map(v => "columns" -> v.asJson),
        t.constraints.map(v => "constraints" -> v.asJson),
        t.comment.map(v => "comment" -> v.asJson),
        t.createdOn.map(v => "created_on" -> v.asJson),
        t.databaseName.map(v => "database_name" -> v.asJson),
        t.schemaName.map(v => "schema_name" -> v.asJson),
        t.rows.map(v => "rows" -> v.asJson),
        t.bytes.map(v => "bytes" -> v.asJson),
        t.owner.map(v => "owner" -> v.asJson),
        t.droppedOn.map(v => "dropped_on" -> v.asJson),
        t.automaticClustering.map(v => "automatic_clustering" -> v.asJson),
        t.searchOptimization.map(v => "search_optimization" -> v.asJson),
        t.searchOptimizationProgress.map(v => "search_optimization_progress" -> v.asJson),
        t.searchOptimizationBytes.map(v => "search_optimization_bytes" -> v.asJson),
        t.ownerRoleType.map(v => "owner_role_type" -> v.asJson),
        t.budget.map(v => "budget" -> v.asJson),
        t.tableType.map(v => "table_type" -> v.asJson)
      ).flatten
    }
  }
  given decoderTable: Decoder[Table] = Decoder.instance { c =>
    for {
      name <- c.downField("name").as[String]
      kind <- c.downField("kind").as[Option[TableKind]]
      clusterBy <- c.downField("cluster_by").as[Option[Seq[String]]]
      enableSchemaEvolution <- c.downField("enable_schema_evolution").as[Option[Boolean]]
      changeTracking <- c.downField("change_tracking").as[Option[Boolean]]
      dataRetentionTimeInDays <- c.downField("data_retention_time_in_days").as[Option[Int]]
      maxDataExtensionTimeInDays <- c.downField("max_data_extension_time_in_days").as[Option[Int]]
      defaultDdlCollation <- c.downField("default_ddl_collation").as[Option[String]]
      columns <- c.downField("columns").as[Option[Seq[TableColumn]]]
      constraints <- c.downField("constraints").as[Option[Seq[Constraint]]]
      comment <- c.downField("comment").as[Option[String]]
      createdOn <- c.downField("created_on").as[Option[Instant]]
      databaseName <- c.downField("database_name").as[Option[String]]
      schemaName <- c.downField("schema_name").as[Option[String]]
      rows <- c.downField("rows").as[Option[Long]]
      bytes <- c.downField("bytes").as[Option[Long]]
      owner <- c.downField("owner").as[Option[String]]
      droppedOn <- c.downField("dropped_on").as[Option[Instant]]
      automaticClustering <- c.downField("automatic_clustering").as[Option[Boolean]]
      searchOptimization <- c.downField("search_optimization").as[Option[Boolean]]
      searchOptimizationProgress <- c.downField("search_optimization_progress").as[Option[Long]]
      searchOptimizationBytes <- c.downField("search_optimization_bytes").as[Option[Long]]
      ownerRoleType <- c.downField("owner_role_type").as[Option[String]]
      budget <- c.downField("budget").as[Option[String]]
      tableType <- c.downField("table_type").as[Option[TableTableType]]
    } yield Table(
      name = name,
      kind = kind,
      clusterBy = clusterBy,
      enableSchemaEvolution = enableSchemaEvolution,
      changeTracking = changeTracking,
      dataRetentionTimeInDays = dataRetentionTimeInDays,
      maxDataExtensionTimeInDays = maxDataExtensionTimeInDays,
      defaultDdlCollation = defaultDdlCollation,
      columns = columns,
      constraints = constraints,
      comment = comment,
      createdOn = createdOn,
      databaseName = databaseName,
      schemaName = schemaName,
      rows = rows,
      bytes = bytes,
      owner = owner,
      droppedOn = droppedOn,
      automaticClustering = automaticClustering,
      searchOptimization = searchOptimization,
      searchOptimizationProgress = searchOptimizationProgress,
      searchOptimizationBytes = searchOptimizationBytes,
      ownerRoleType = ownerRoleType,
      budget = budget,
      tableType = tableType
    )
  }
}

