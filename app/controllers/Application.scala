package controllers

import play.api._
import play.api.mvc._
import java.io._
import java.net._
import play.api.data._
import play.api.data.Forms._
import models._


object Application extends Controller {
  
  def index = Action {
	  val feed = new Feed(null,"1","2","3")
	 
	  Feed.insert(feed)
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
	Ok(views.html.loginForm())
  }
  
  def upload = Action(parse.multipartFormData) { request =>
    request.body.file("picture").map { picture =>
      import java.io.File
      val filename = picture.filename
      val contentType = picture.contentType
      picture.ref.moveTo(new File(s"/tmp/picture/$filename"))
	  
	  
      Ok("File uploaded" + filename +contentType )
    }.getOrElse {
      Redirect(routes.Application.index).flashing(
        "error" -> "Missing file")
    }
  }
}