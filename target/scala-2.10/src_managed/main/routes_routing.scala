// @SOURCE:/Users/pdbi/Documents/PlayWorkSpace/RSS_copy/conf/routes
// @HASH:b08d8e924e1df4cb74a3c9ef56f7ece6f74fcb2e
// @DATE:Fri Nov 08 12:15:33 CST 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_ReaderController_show1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("rss"))))
        

// @LINE:10
private[this] lazy val controllers_ReaderController_showNewStyle2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("rssN"))))
        

// @LINE:13
private[this] lazy val controllers_Assets_at3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """rss""","""controllers.ReaderController.show"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """rssN""","""controllers.ReaderController.showNewStyle"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_ReaderController_show1(params) => {
   call { 
        invokeHandler(controllers.ReaderController.show, HandlerDef(this, "controllers.ReaderController", "show", Nil,"GET", """RSS reader form show""", Routes.prefix + """rss"""))
   }
}
        

// @LINE:10
case controllers_ReaderController_showNewStyle2(params) => {
   call { 
        invokeHandler(controllers.ReaderController.showNewStyle, HandlerDef(this, "controllers.ReaderController", "showNewStyle", Nil,"GET", """""", Routes.prefix + """rssN"""))
   }
}
        

// @LINE:13
case controllers_Assets_at3(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     