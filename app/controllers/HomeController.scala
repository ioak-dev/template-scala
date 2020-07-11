package controllers

import javax.inject._
import play.api.mvc._

@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def getDemoString = Action{
    Ok("IOAK first GET service in scala with play framework")
  }

  def getName(name: String) = Action{
    Ok(s"$name : It is a parameterised get service")
  }

}
