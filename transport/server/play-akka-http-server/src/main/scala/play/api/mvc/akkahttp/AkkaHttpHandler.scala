/*
 * Copyright (C) from 2022 The Play Framework Contributors <https://github.com/playframework>, 2011-2021 Lightbend Inc. <https://www.lightbend.com>
 */

package play.api.mvc.akkahttp

import play.api.mvc.Handler

import akka.http.scaladsl.model.HttpRequest
import akka.http.scaladsl.model.HttpResponse
import scala.concurrent.Future

trait AkkaHttpHandler extends (HttpRequest => Future[HttpResponse]) with Handler

object AkkaHttpHandler {
  def apply(handler: HttpRequest => Future[HttpResponse]): AkkaHttpHandler = new AkkaHttpHandler {
    def apply(request: HttpRequest): Future[HttpResponse] = handler(request)
  }
}
