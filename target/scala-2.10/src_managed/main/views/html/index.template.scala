
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](_display_(Seq[Any](/*2.2*/main("Welcome to Play 2.1 New")/*2.33*/ {_display_(Seq[Any](format.raw/*2.35*/("""
<!DOCTYPE html>
<html>
<head>
    <title>Reader New</title> 
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<meta http-equiv="Cache-Control" content="no-store" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Expires" content="0" />
<style type="text/css">
     body """),format.raw/*12.11*/("""{"""),format.raw/*12.12*/("""
       padding-top: 40px;
       padding-bottom: 40px;
       background-color: #f5f5f5;
     """),format.raw/*16.6*/("""}"""),format.raw/*16.7*/("""

     .form-signin """),format.raw/*18.19*/("""{"""),format.raw/*18.20*/("""
       max-width: 300px;
       padding: 19px 29px 29px;
       margin: 0 auto 20px;
       background-color: #fff;
       border: 1px solid #e5e5e5;
       -webkit-border-radius: 5px;
          -moz-border-radius: 5px;
               border-radius: 5px;
       -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);
          -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);
               box-shadow: 0 1px 2px rgba(0,0,0,.05);
     """),format.raw/*30.6*/("""}"""),format.raw/*30.7*/("""
     .form-signin .form-signin-heading,
     .form-signin .checkbox """),format.raw/*32.29*/("""{"""),format.raw/*32.30*/("""
       margin-bottom: 10px;
     """),format.raw/*34.6*/("""}"""),format.raw/*34.7*/("""
     .form-signin input[type="text"],
     .form-signin input[type="password"] """),format.raw/*36.42*/("""{"""),format.raw/*36.43*/("""
       font-size: 16px;
       height: auto;
       margin-bottom: 15px;
       padding: 7px 9px;
     """),format.raw/*41.6*/("""}"""),format.raw/*41.7*/("""

   </style>

</head>

<body>
    <div class="container">

         """),_display_(Seq[Any](/*50.11*/form(routes.Application.save())/*50.42*/ {_display_(Seq[Any](format.raw/*50.44*/("""
           <h2 class="form-signin-heading">Please sign in</h2>
           <input type="text" name="email" class="input-block-level" placeholder="Email address">
           <input type="password" name="password" class="input-block-level" placeholder="Password">
           <label class="checkbox">
             <input type="checkbox" value="remember-me"> Remember me
           </label>
           <button class="btn btn-large btn-primary" type="submit">Sign in</button>
         """)))})),format.raw/*58.11*/("""

       </div> <!-- /container -->
	
</body>
</html>
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Nov 13 22:05:27 CST 2013
                    SOURCE: /Users/pdbi/Documents/PlayWorkSpace/MyReader/app/views/index.scala.html
                    HASH: ba956f142251601c190c17d4e5bcff54432d5e7c
                    MATRIX: 662->18|701->49|740->51|1078->361|1107->362|1229->457|1257->458|1305->478|1334->479|1784->902|1812->903|1909->972|1938->973|1999->1007|2027->1008|2135->1088|2164->1089|2295->1193|2323->1194|2429->1264|2469->1295|2509->1297|3022->1778
                    LINES: 23->2|23->2|23->2|33->12|33->12|37->16|37->16|39->18|39->18|51->30|51->30|53->32|53->32|55->34|55->34|57->36|57->36|62->41|62->41|71->50|71->50|71->50|79->58
                    -- GENERATED --
                */
            