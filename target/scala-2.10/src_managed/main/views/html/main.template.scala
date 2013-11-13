
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png"))),format.raw/*9.97*/("""">

 		<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*11.49*/routes/*11.55*/.Assets.at("stylesheets/bootstrap/3.0/css/bootstrap.min.css"))),format.raw/*11.116*/("""">
        <script src=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*12.74*/(""""></script>
    </head>
    <body>
        """),_display_(Seq[Any](/*15.10*/content)),format.raw/*15.17*/("""
		<script src=""""),_display_(Seq[Any](/*16.17*/routes/*16.23*/.Assets.at("stylesheets/bootstrap/3.0/js/bootstrap.min.js"))),format.raw/*16.82*/(""""></script>
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Nov 08 12:04:34 CST 2013
                    SOURCE: /Users/pdbi/Documents/PlayWorkSpace/RSS_copy/app/views/main.scala.html
                    HASH: 389881ee0ff717056bbb94bd6c9c07f48e933855
                    MATRIX: 560->1|684->31|772->84|798->89|895->151|909->157|964->191|1060->252|1074->258|1127->290|1215->342|1230->348|1314->409|1375->434|1390->440|1457->485|1537->529|1566->536|1619->553|1634->559|1715->618
                    LINES: 19->1|22->1|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|32->11|32->11|32->11|33->12|33->12|33->12|36->15|36->15|37->16|37->16|37->16
                    -- GENERATED --
                */
            