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
import datoria.snowflake.models.Grant
import datoria.snowflake.models.Grant3
import scala.collection.immutable.Seq
import datoria.snowflake.models.SuccessAcceptedResponse
import datoria.snowflake.models.SuccessResponse
import java.util.UUID
import datoria.snowflake.models.User
import datoria.snowflake.models.*

trait UserApiEndpoints[F[*]] {

  def createOrAlterUser(name: String, user: User): F[SuccessResponse]
  def createUser(user: User, createMode: Option[CreateUserCreateModeParameter] = None): F[SuccessResponse]
  def deleteUser(name: String, ifExists: Option[Boolean] = None): F[SuccessResponse]
  def fetchUser(name: String): F[User]
  def grant(name: String, grant: Grant): F[SuccessResponse]
  def listGrants(name: String, showLimit: Option[Int] = None): F[Seq[Grant3]]
  def listUsers(like: Option[String] = None, startsWith: Option[String] = None, showLimit: Option[Int] = None, fromName: Option[String] = None): F[Seq[User]]
  def revokeGrants(name: String, grant: Grant): F[SuccessResponse]

}

class UserApiEndpointsImpl[F[*]: Concurrent](
  override val baseUrl: Uri,
  defaultHeaders: Seq[(String, String)] = Nil,
  httpClient: Http4sClient[F]
) extends BaseClient[F](baseUrl, defaultHeaders, httpClient) with UserApiEndpoints[F] {
  
  import JsonSupports.*
  import io.circe.syntax.EncoderOps
  import cats.implicits.toFlatMapOps

  override def createOrAlterUser(name: String, user: User): F[SuccessResponse] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten

    _executeRequest[User, SuccessResponse](
      method = "PUT",
      path = s"/api/v2/users/${name}",
      body = Some(user),
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

  override def createUser(user: User, createMode: Option[CreateUserCreateModeParameter] = None): F[SuccessResponse] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten
    val queryParameters = (
      createMode.map("createMode" -> _).map(Seq(_))
    ).toSeq.flatten

    _executeRequest[User, SuccessResponse](
      method = "POST",
      path = s"/api/v2/users",
      body = Some(user),
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

  override def deleteUser(name: String, ifExists: Option[Boolean] = None): F[SuccessResponse] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten
    val queryParameters = (
      ifExists.map("ifExists" -> _).map(Seq(_))
    ).toSeq.flatten

    _executeRequest[Unit, SuccessResponse](
      method = "DELETE",
      path = s"/api/v2/users/${name}",
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

  override def fetchUser(name: String): F[User] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten

    _executeRequest[Unit, User](
      method = "GET",
      path = s"/api/v2/users/${name}",
      body = None,
      formParameters = None,
      queryParameters = Nil,
      requestHeaders = requestHeaders,
      auth = None) {
        
        case r if r.status.code == 200 => parseJson[F, User]("User", r)
        case r if r.status.code == 202 => parseJson[F, User]("User", r)
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

  override def grant(name: String, grant: Grant): F[SuccessResponse] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten

    _executeRequest[Grant, SuccessResponse](
      method = "POST",
      path = s"/api/v2/users/${name}/grants",
      body = Some(grant),
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

  override def listGrants(name: String, showLimit: Option[Int] = None): F[Seq[Grant3]] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten
    val queryParameters = (
      showLimit.map("showLimit" -> _).map(Seq(_))
    ).toSeq.flatten

    _executeRequest[Unit, Seq[Grant3]](
      method = "GET",
      path = s"/api/v2/users/${name}/grants",
      body = None,
      formParameters = None,
      queryParameters = queryParameters,
      requestHeaders = requestHeaders,
      auth = None) {
        
        case r if r.status.code == 200 => parseJson[F, Seq[Grant3]]("Seq[Grant3]", r)
        case r if r.status.code == 202 => parseJson[F, Seq[Grant3]]("Seq[Grant3]", r)
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

  override def listUsers(like: Option[String] = None, startsWith: Option[String] = None, showLimit: Option[Int] = None, fromName: Option[String] = None): F[Seq[User]] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten
    val queryParameters = (
      like.map("like" -> _).map(Seq(_)) ++ 
      startsWith.map("startsWith" -> _).map(Seq(_)) ++ 
      showLimit.map("showLimit" -> _).map(Seq(_)) ++ 
      fromName.map("fromName" -> _).map(Seq(_))
    ).toSeq.flatten

    _executeRequest[Unit, Seq[User]](
      method = "GET",
      path = s"/api/v2/users",
      body = None,
      formParameters = None,
      queryParameters = queryParameters,
      requestHeaders = requestHeaders,
      auth = None) {
        
        case r if r.status.code == 200 => parseJson[F, Seq[User]]("Seq[User]", r)
        case r if r.status.code == 202 => parseJson[F, Seq[User]]("Seq[User]", r)
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

  override def revokeGrants(name: String, grant: Grant): F[SuccessResponse] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten

    _executeRequest[Grant, SuccessResponse](
      method = "POST",
      path = s"/api/v2/users/${name}/grants:revoke",
      body = Some(grant),
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


