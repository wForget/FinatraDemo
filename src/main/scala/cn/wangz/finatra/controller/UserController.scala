package cn.wangz.finatra.controller

import javax.inject.Inject

import cn.wangz.finatra.service.UserService
import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

/**
  * Created by hadoop on 2018/10/12.
  */
class UserController @Inject()(userService:UserService) extends Controller {

  get("/get") { request: Request =>
    val id = request.getParam("id", "-1").toString
    userService.getUser(id)
  }

  get("/hi") { request: Request =>
    val name = request.getParam("name", "wangz").toString
    userService.hello(name)
  }

}
