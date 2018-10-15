package cn.wangz.finatra

import cn.wangz.finatra.controller.UserController
import com.twitter.finatra.http.HttpServer
import com.twitter.finatra.http.routing.HttpRouter

/**
  * Created by hadoop on 2018/10/12.
  */
class MainServer extends HttpServer{

  override val defaultHttpPort: String = ":8080"

  override protected def configureHttp(router: HttpRouter): Unit = {
    router.add[UserController]
  }
}

object ServerMain extends MainServer