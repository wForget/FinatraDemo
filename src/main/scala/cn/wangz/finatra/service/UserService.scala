package cn.wangz.finatra.service

/**
  * Created by hadoop on 2018/10/12.
  */
class UserService {

  def getUser(id:String):String = {
    val name = id match {
      case "1" => "Jack"
      case "2" => "Rose"
      case _ => "no name"
    }
    name
  }

  def hello(name:String):String = {
    "Hello, " + name
  }

}
