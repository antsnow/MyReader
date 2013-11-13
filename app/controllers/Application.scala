package controllers

import play.api._
import play.api.mvc._
import java.io._
import java.net._
import play.api.data._
import play.api.data.Forms._

object Application extends Controller {
  
  def index = Action {
	
	Ok(views.html.index())
  }
  
  val loginForm = Form(
    tuple(
      "email" -> text,
      "password" -> text
    )
  )
  
  def save = Action { implicit request =>
    val (email, password) = loginForm.bindFromRequest.get
	print((email, password))
	loginForm.fill((email, password))
	Ok(views.html.index())
  }
  
}