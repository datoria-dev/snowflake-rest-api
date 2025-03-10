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
package datoria.snowflake.apis

import cats.effect.Concurrent
import io.circe.Encoder
import org.http4s.Uri
import org.http4s.client.Client as Http4sClient
import datoria.snowflake.models.CreateUserCreateModeParameter
import datoria.snowflake.models.ErrorResponse
import datoria.snowflake.models.EventTable
import scala.collection.immutable.Seq
import datoria.snowflake.models.SuccessAcceptedResponse
import datoria.snowflake.models.SuccessResponse
import java.util.UUID
import datoria.snowflake.models.*

trait EventTableApiEndpoints[F[*]] {

  def createEventTable(database: String, schema: String, eventTable: EventTable, createMode: Option[CreateUserCreateModeParameter] = None, copyGrants: Option[Boolean] = None): F[SuccessResponse]
  def deleteEventTable(database: String, schema: String, name: String, ifExists: Option[Boolean] = None): F[SuccessResponse]
  def fetchEventTable(database: String, schema: String, name: String): F[EventTable]
  def listEventTables(database: String, schema: String, like: Option[String] = None, startsWith: Option[String] = None, showLimit: Option[Int] = None, fromName: Option[String] = None): F[Seq[EventTable]]
  def renameEventTable(database: String, schema: String, name: String, targetName: String, ifExists: Option[Boolean] = None): F[SuccessResponse]

}

class EventTableApiEndpointsImpl[F[*]: Concurrent](
  override val baseUrl: Uri,
  defaultHeaders: Seq[(String, String)] = Nil,
  httpClient: Http4sClient[F]
) extends BaseClient[F](baseUrl, defaultHeaders, httpClient) with EventTableApiEndpoints[F] {
  
  import JsonSupports.*
  import io.circe.syntax.EncoderOps
  import cats.implicits.toFlatMapOps

  override def createEventTable(database: String, schema: String, eventTable: EventTable, createMode: Option[CreateUserCreateModeParameter] = None, copyGrants: Option[Boolean] = None): F[SuccessResponse] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten
    val queryParameters = (
      createMode.map("createMode" -> _).map(Seq(_)) ++ 
      copyGrants.map("copyGrants" -> _).map(Seq(_))
    ).toSeq.flatten

    _executeRequest[EventTable, SuccessResponse](
      method = "POST",
      path = s"/api/v2/databases/${database}/schemas/${schema}/event-tables",
      body = Some(eventTable),
      formParameters = None,
      queryParameters = queryParameters,
      requestHeaders = requestHeaders,
      auth = None) {
        
        case r if r.status.code == 200 => parseJson[F, SuccessResponse]("SuccessResponse", r)
        case r if r.status.code == 202 => parseJson[F, SuccessResponse]("SuccessResponse", r)
        case r if r.status.code == 400 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 401 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 403 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 404 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 405 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 408 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 409 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 410 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 429 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 500 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 503 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 504 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
    }
  }

  override def deleteEventTable(database: String, schema: String, name: String, ifExists: Option[Boolean] = None): F[SuccessResponse] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten
    val queryParameters = (
      ifExists.map("ifExists" -> _).map(Seq(_))
    ).toSeq.flatten

    _executeRequest[Unit, SuccessResponse](
      method = "DELETE",
      path = s"/api/v2/databases/${database}/schemas/${schema}/event-tables/${name}",
      body = None,
      formParameters = None,
      queryParameters = queryParameters,
      requestHeaders = requestHeaders,
      auth = None) {
        
        case r if r.status.code == 200 => parseJson[F, SuccessResponse]("SuccessResponse", r)
        case r if r.status.code == 202 => parseJson[F, SuccessResponse]("SuccessResponse", r)
        case r if r.status.code == 400 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 401 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 403 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 404 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 405 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 408 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 409 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 410 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 429 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 500 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 503 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 504 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
    }
  }

  override def fetchEventTable(database: String, schema: String, name: String): F[EventTable] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten

    _executeRequest[Unit, EventTable](
      method = "GET",
      path = s"/api/v2/databases/${database}/schemas/${schema}/event-tables/${name}",
      body = None,
      formParameters = None,
      queryParameters = Nil,
      requestHeaders = requestHeaders,
      auth = None) {
        
        case r if r.status.code == 200 => parseJson[F, EventTable]("EventTable", r)
        case r if r.status.code == 202 => parseJson[F, EventTable]("EventTable", r)
        case r if r.status.code == 400 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 401 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 403 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 404 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 405 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 408 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 409 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 410 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 429 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 500 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 503 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 504 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
    }
  }

  override def listEventTables(database: String, schema: String, like: Option[String] = None, startsWith: Option[String] = None, showLimit: Option[Int] = None, fromName: Option[String] = None): F[Seq[EventTable]] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten
    val queryParameters = (
      like.map("like" -> _).map(Seq(_)) ++ 
      startsWith.map("startsWith" -> _).map(Seq(_)) ++ 
      showLimit.map("showLimit" -> _).map(Seq(_)) ++ 
      fromName.map("fromName" -> _).map(Seq(_))
    ).toSeq.flatten

    _executeRequest[Unit, Seq[EventTable]](
      method = "GET",
      path = s"/api/v2/databases/${database}/schemas/${schema}/event-tables",
      body = None,
      formParameters = None,
      queryParameters = queryParameters,
      requestHeaders = requestHeaders,
      auth = None) {
        
        case r if r.status.code == 200 => parseJson[F, Seq[EventTable]]("Seq[EventTable]", r)
        case r if r.status.code == 202 => parseJson[F, Seq[EventTable]]("Seq[EventTable]", r)
        case r if r.status.code == 400 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 401 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 403 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 404 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 405 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 408 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 409 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 410 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 429 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 500 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 503 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 504 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
    }
  }

  override def renameEventTable(database: String, schema: String, name: String, targetName: String, ifExists: Option[Boolean] = None): F[SuccessResponse] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten
    val queryParameters = (
      ifExists.map("ifExists" -> _).map(Seq(_)) ++ 
      Some(Seq("targetName" -> targetName))
    ).toSeq.flatten

    _executeRequest[Unit, SuccessResponse](
      method = "POST",
      path = s"/api/v2/databases/${database}/schemas/${schema}/event-tables/${name}:rename",
      body = None,
      formParameters = None,
      queryParameters = queryParameters,
      requestHeaders = requestHeaders,
      auth = None) {
        
        case r if r.status.code == 200 => parseJson[F, SuccessResponse]("SuccessResponse", r)
        case r if r.status.code == 202 => parseJson[F, SuccessResponse]("SuccessResponse", r)
        case r if r.status.code == 400 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 401 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 403 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 404 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 405 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 408 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 409 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 410 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 429 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 500 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 503 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 504 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
    }
  }

}


