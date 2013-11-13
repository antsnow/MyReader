package controllers

import play.api._
import play.api.mvc._
import java.io._
import java.net._

object Application extends Controller {
  
  def index = Action {
	var out: OutputStream = null;
	var in: InputStream = null;
	try{
		val url = new URL("http://cn.engadget.com/rss.xml")

	      val connection = url.openConnection().asInstanceOf[HttpURLConnection]
	      connection.setRequestMethod("GET")
	      in = connection.getInputStream
	      val localfile = "/Users/pdbi/Desktop/sample1232.xml"
	      out = new BufferedOutputStream(new FileOutputStream(localfile))
	      val byteArray = Stream.continually(in.read).takeWhile(-1 !=).map(_.toByte).toArray

	      out.write(byteArray)
	    } catch {
	      case e: Exception => println(e.printStackTrace()) 
	    } finally {
	      out.close
	      in.close
	    }
    Ok(views.html.index("Your new application is ready123."))
  }
  
}