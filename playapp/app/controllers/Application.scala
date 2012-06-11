package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index(name: Option[String]) = Action {
    Ok(views.html.index(mymodel.Ahoy(name).greet))
  }
  
}