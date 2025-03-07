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
import scala.collection.immutable.Seq
import datoria.snowflake.models.SuccessAcceptedResponse
import datoria.snowflake.models.SuccessResponse
import java.util.UUID
import datoria.snowflake.models.Warehouse
import datoria.snowflake.models.*

trait WarehouseApiEndpoints[F[*]] {

  def abortAllQueriesOnWarehouse(name: String, ifExists: Option[Boolean] = None): F[SuccessResponse]
  def createOrAlterWarehouse(name: String, warehouse: Warehouse): F[SuccessResponse]
  def createWarehouse(warehouse: Warehouse, createMode: Option[CreateUserCreateModeParameter] = None): F[SuccessResponse]
  def deleteWarehouse(name: String, ifExists: Option[Boolean] = None): F[SuccessResponse]
  def fetchWarehouse(name: String): F[Warehouse]
  def listWarehouses(like: Option[String] = None): F[Seq[Warehouse]]
  def renameWarehouse(name: String, warehouse: Warehouse, ifExists: Option[Boolean] = None): F[SuccessResponse]
  def resumeWarehouse(name: String, ifExists: Option[Boolean] = None): F[SuccessResponse]
  def suspendWarehouse(name: String, ifExists: Option[Boolean] = None): F[SuccessResponse]
  def useWarehouse(name: String): F[SuccessResponse]

}

class WarehouseApiEndpointsImpl[F[*]: Concurrent](
  override val baseUrl: Uri,
  defaultHeaders: Seq[(String, String)] = Nil,
  httpClient: Http4sClient[F]
) extends BaseClient[F](baseUrl, defaultHeaders, httpClient) with WarehouseApiEndpoints[F] {
  
  import JsonSupports.*
  import io.circe.syntax.EncoderOps
  import cats.implicits.toFlatMapOps

  override def abortAllQueriesOnWarehouse(name: String, ifExists: Option[Boolean] = None): F[SuccessResponse] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten
    val queryParameters = (
      ifExists.map("ifExists" -> _).map(Seq(_))
    ).toSeq.flatten

    _executeRequest[Unit, SuccessResponse](
      method = "POST",
      path = s"/api/v2/warehouses/${name}:abort",
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

  override def createOrAlterWarehouse(name: String, warehouse: Warehouse): F[SuccessResponse] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten

    _executeRequest[Warehouse, SuccessResponse](
      method = "PUT",
      path = s"/api/v2/warehouses/${name}",
      body = Some(warehouse),
      formParameters = None,
      queryParameters = Nil,
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

  override def createWarehouse(warehouse: Warehouse, createMode: Option[CreateUserCreateModeParameter] = None): F[SuccessResponse] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten
    val queryParameters = (
      createMode.map("createMode" -> _).map(Seq(_))
    ).toSeq.flatten

    _executeRequest[Warehouse, SuccessResponse](
      method = "POST",
      path = s"/api/v2/warehouses",
      body = Some(warehouse),
      formParameters = None,
      queryParameters = queryParameters,
      requestHeaders = requestHeaders,
      auth = None) {
        
        case r if r.status.code == 200 => parseJson[F, SuccessResponse]("SuccessResponse", r)
        case r if r.status.code == 202 => parseJson[F, SuccessResponse]("SuccessResponse", r)
        case r if r.status.code == 400 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 401 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 403 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
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

  override def deleteWarehouse(name: String, ifExists: Option[Boolean] = None): F[SuccessResponse] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten
    val queryParameters = (
      ifExists.map("ifExists" -> _).map(Seq(_))
    ).toSeq.flatten

    _executeRequest[Unit, SuccessResponse](
      method = "DELETE",
      path = s"/api/v2/warehouses/${name}",
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

  override def fetchWarehouse(name: String): F[Warehouse] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten

    _executeRequest[Unit, Warehouse](
      method = "GET",
      path = s"/api/v2/warehouses/${name}",
      body = None,
      formParameters = None,
      queryParameters = Nil,
      requestHeaders = requestHeaders,
      auth = None) {
        
        case r if r.status.code == 200 => parseJson[F, Warehouse]("Warehouse", r)
        case r if r.status.code == 202 => parseJson[F, Warehouse]("Warehouse", r)
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

  override def listWarehouses(like: Option[String] = None): F[Seq[Warehouse]] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten
    val queryParameters = (
      like.map("like" -> _).map(Seq(_))
    ).toSeq.flatten

    _executeRequest[Unit, Seq[Warehouse]](
      method = "GET",
      path = s"/api/v2/warehouses",
      body = None,
      formParameters = None,
      queryParameters = queryParameters,
      requestHeaders = requestHeaders,
      auth = None) {
        
        case r if r.status.code == 200 => parseJson[F, Seq[Warehouse]]("Seq[Warehouse]", r)
        case r if r.status.code == 202 => parseJson[F, Seq[Warehouse]]("Seq[Warehouse]", r)
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

  override def renameWarehouse(name: String, warehouse: Warehouse, ifExists: Option[Boolean] = None): F[SuccessResponse] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten
    val queryParameters = (
      ifExists.map("ifExists" -> _).map(Seq(_))
    ).toSeq.flatten

    _executeRequest[Warehouse, SuccessResponse](
      method = "POST",
      path = s"/api/v2/warehouses/${name}:rename",
      body = Some(warehouse),
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

  override def resumeWarehouse(name: String, ifExists: Option[Boolean] = None): F[SuccessResponse] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten
    val queryParameters = (
      ifExists.map("ifExists" -> _).map(Seq(_))
    ).toSeq.flatten

    _executeRequest[Unit, SuccessResponse](
      method = "POST",
      path = s"/api/v2/warehouses/${name}:resume",
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

  override def suspendWarehouse(name: String, ifExists: Option[Boolean] = None): F[SuccessResponse] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten
    val queryParameters = (
      ifExists.map("ifExists" -> _).map(Seq(_))
    ).toSeq.flatten

    _executeRequest[Unit, SuccessResponse](
      method = "POST",
      path = s"/api/v2/warehouses/${name}:suspend",
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

  override def useWarehouse(name: String): F[SuccessResponse] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten

    _executeRequest[Unit, SuccessResponse](
      method = "POST",
      path = s"/api/v2/warehouses/${name}:use",
      body = None,
      formParameters = None,
      queryParameters = Nil,
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


