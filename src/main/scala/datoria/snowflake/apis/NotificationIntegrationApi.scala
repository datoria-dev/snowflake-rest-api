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
import datoria.snowflake.models.NotificationIntegration
import scala.collection.immutable.Seq
import datoria.snowflake.models.SuccessAcceptedResponse
import datoria.snowflake.models.SuccessResponse
import java.util.UUID
import datoria.snowflake.models.*

trait NotificationIntegrationApiEndpoints[F[*]] {

  def createNotificationIntegration(notificationIntegration: NotificationIntegration, createMode: Option[CreateUserCreateModeParameter] = None): F[SuccessResponse]
  def deleteNotificationIntegration(name: String, ifExists: Option[Boolean] = None): F[SuccessResponse]
  def fetchNotificationIntegration(name: String): F[NotificationIntegration]
  def listNotificationIntegrations(like: Option[String] = None): F[Seq[NotificationIntegration]]

}

class NotificationIntegrationApiEndpointsImpl[F[*]: Concurrent](
  override val baseUrl: Uri,
  defaultHeaders: Seq[(String, String)] = Nil,
  httpClient: Http4sClient[F]
) extends BaseClient[F](baseUrl, defaultHeaders, httpClient) with NotificationIntegrationApiEndpoints[F] {
  
  import JsonSupports.*
  import io.circe.syntax.EncoderOps
  import cats.implicits.toFlatMapOps

  override def createNotificationIntegration(notificationIntegration: NotificationIntegration, createMode: Option[CreateUserCreateModeParameter] = None): F[SuccessResponse] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten
    val queryParameters = (
      createMode.map("createMode" -> _).map(Seq(_))
    ).toSeq.flatten

    _executeRequest[NotificationIntegration, SuccessResponse](
      method = "POST",
      path = s"/api/v2/notification-integrations",
      body = Some(notificationIntegration),
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

  override def deleteNotificationIntegration(name: String, ifExists: Option[Boolean] = None): F[SuccessResponse] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten
    val queryParameters = (
      ifExists.map("ifExists" -> _).map(Seq(_))
    ).toSeq.flatten

    _executeRequest[Unit, SuccessResponse](
      method = "DELETE",
      path = s"/api/v2/notification-integrations/${name}",
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

  override def fetchNotificationIntegration(name: String): F[NotificationIntegration] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten

    _executeRequest[Unit, NotificationIntegration](
      method = "GET",
      path = s"/api/v2/notification-integrations/${name}",
      body = None,
      formParameters = None,
      queryParameters = Nil,
      requestHeaders = requestHeaders,
      auth = None) {
        
        case r if r.status.code == 200 => parseJson[F, NotificationIntegration]("NotificationIntegration", r)
        case r if r.status.code == 202 => parseJson[F, NotificationIntegration]("NotificationIntegration", r)
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

  override def listNotificationIntegrations(like: Option[String] = None): F[Seq[NotificationIntegration]] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten
    val queryParameters = (
      like.map("like" -> _).map(Seq(_))
    ).toSeq.flatten

    _executeRequest[Unit, Seq[NotificationIntegration]](
      method = "GET",
      path = s"/api/v2/notification-integrations",
      body = None,
      formParameters = None,
      queryParameters = queryParameters,
      requestHeaders = requestHeaders,
      auth = None) {
        
        case r if r.status.code == 200 => parseJson[F, Seq[NotificationIntegration]]("Seq[NotificationIntegration]", r)
        case r if r.status.code == 202 => parseJson[F, Seq[NotificationIntegration]]("Seq[NotificationIntegration]", r)
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


