// @SOURCE:/Users/pdbi/Documents/PlayWorkSpace/RSS_copy/conf/routes
// @HASH:b08d8e924e1df4cb74a3c9ef56f7ece6f74fcb2e
// @DATE:Fri Nov 08 12:15:33 CST 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:10
// @LINE:9
class ReverseReaderController {
    

// @LINE:9
def show(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "rss")
}
                                                

// @LINE:10
def showNewStyle(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "rssN")
}
                                                
    
}
                          

// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:10
// @LINE:9
class ReverseReaderController {
    

// @LINE:9
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ReaderController.show",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rss"})
      }
   """
)
                        

// @LINE:10
def showNewStyle : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ReaderController.showNewStyle",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rssN"})
      }
   """
)
                        
    
}
              

// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:10
// @LINE:9
class ReverseReaderController {
    

// @LINE:9
def show(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ReaderController.show(), HandlerDef(this, "controllers.ReaderController", "show", Seq(), "GET", """RSS reader form show""", _prefix + """rss""")
)
                      

// @LINE:10
def showNewStyle(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ReaderController.showNewStyle(), HandlerDef(this, "controllers.ReaderController", "showNewStyle", Seq(), "GET", """""", _prefix + """rssN""")
)
                      
    
}
                          

// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    