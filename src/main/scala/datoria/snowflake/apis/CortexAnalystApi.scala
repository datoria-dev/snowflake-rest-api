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
import datoria.snowflake.models.ErrorResponse
import datoria.snowflake.models.SendMessageRequest
import datoria.snowflake.models.SendMessageResponse
import java.util.UUID
import datoria.snowflake.models.*

trait CortexAnalystApiEndpoints[F[*]] {

  def sendMessage(sendMessageRequest: SendMessageRequest): F[SendMessageResponse]

}

class CortexAnalystApiEndpointsImpl[F[*]: Concurrent](
  override val baseUrl: Uri,
  defaultHeaders: Seq[(String, String)] = Nil,
  httpClient: Http4sClient[F]
) extends BaseClient[F](baseUrl, defaultHeaders, httpClient) with CortexAnalystApiEndpoints[F] {
  
  import JsonSupports.*
  import io.circe.syntax.EncoderOps
  import cats.implicits.toFlatMapOps

  override def sendMessage(sendMessageRequest: SendMessageRequest): F[SendMessageResponse] = {
    val requestHeaders = Seq(
      Some("Content-Type" -> "application/json")
    ).flatten

    _executeRequest[SendMessageRequest, SendMessageResponse](
      method = "POST",
      path = s"/api/v2/cortex/analyst/message",
      body = Some(sendMessageRequest),
      formParameters = None,
      queryParameters = Nil,
      requestHeaders = requestHeaders,
      auth = None) {
        
        case r if r.status.code == 200 => parseJson[F, SendMessageResponse]("SendMessageResponse", r)
        case r if r.status.code == 400 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 401 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 403 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 404 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 405 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 429 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 500 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 503 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
        case r if r.status.code == 504 => parseJson[F, ErrorResponse]("ErrorResponse", r).flatMap(res => Concurrent[F].raiseError(_FailedRequest(r.status.code, r.status.reason, Some(res.asJson))))
    }
  }

}


