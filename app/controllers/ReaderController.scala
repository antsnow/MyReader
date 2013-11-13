package controllers

import play.api._
import play.api.mvc._
import java.io._
import java.net._
import views._
import models._


object ReaderController extends Controller {
  def show = Action {
	Ok(views.html.readerForm())
  }
  
}