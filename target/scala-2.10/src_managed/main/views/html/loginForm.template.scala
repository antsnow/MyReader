
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
object loginForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

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
     
</style>

<script type="text/javascript">
	$(document).ready(function() """),format.raw/*18.31*/("""{"""),format.raw/*18.32*/("""
		
	"""),format.raw/*20.2*/("""}"""),format.raw/*20.3*/(""");
</script>
</head>

<body>
	"""),_display_(Seq[Any](/*25.3*/helper/*25.9*/.form(action = routes.Application.upload, 'enctype -> "multipart/form-data")/*25.85*/ {_display_(Seq[Any](format.raw/*25.87*/("""
    
	    <input type="file" name="picture">
    
	    <p>
	        <input type="submit">
	    </p>
    
	""")))})),format.raw/*33.3*/("""
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
                    DATE: Thu Nov 21 19:40:34 CST 2013
                    SOURCE: /Users/pdbi/Documents/PlayWorkSpace/MyReader/app/views/loginForm.scala.html
                    HASH: 5819671beb26d0de6532f19694536e22bcb9e350
                    MATRIX: 650->2|689->33|728->35|1136->415|1165->416|1197->421|1225->422|1291->453|1305->459|1390->535|1430->537|1569->645
                    LINES: 22->2|22->2|22->2|38->18|38->18|40->20|40->20|45->25|45->25|45->25|45->25|53->33
                    -- GENERATED --
                */
            