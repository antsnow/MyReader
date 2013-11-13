
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
object readerForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*2.2*/main("Welcome to Play 2.1")/*2.29*/ {_display_(Seq[Any](format.raw/*2.31*/("""
<!DOCTYPE html>
<html>
<head>
    <title>Reader123 </title> 
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<meta http-equiv="Cache-Control" content="no-store" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Expires" content="0" />


<style type="text/css">
      body """),format.raw/*14.12*/("""{"""),format.raw/*14.13*/("""
        padding-top: 60px;
        padding-bottom: 40px;
      """),format.raw/*17.7*/("""}"""),format.raw/*17.8*/("""
      .sidebar-nav """),format.raw/*18.20*/("""{"""),format.raw/*18.21*/("""
        padding: 9px 0;
      """),format.raw/*20.7*/("""}"""),format.raw/*20.8*/("""

      #myModal .modal-body """),format.raw/*22.28*/("""{"""),format.raw/*22.29*/("""
	  	max-height: 600px;
      """),format.raw/*24.7*/("""}"""),format.raw/*24.8*/("""
      #myModal """),format.raw/*25.16*/("""{"""),format.raw/*25.17*/("""
		width: 1200px; 
		margin: 1px 0 0 -600px;
	  """),format.raw/*28.4*/("""}"""),format.raw/*28.5*/("""
</style>

<script type="text/javascript">
$(document).ready(function() """),format.raw/*32.30*/("""{"""),format.raw/*32.31*/("""
	/* var links = ["http://feed.feedsky.com/leica", "http://feeds.feedburner.com/RailsInside" ,"http://apple4.us/feed"];
	for ( var int = 0; int < links.length; int++) """),format.raw/*34.48*/("""{"""),format.raw/*34.49*/("""
		$('#rssList').append('<li><a onclick=\"parseRSS(\''+links[int]+'\');\">Link</a></li>');
	"""),format.raw/*36.2*/("""}"""),format.raw/*36.3*/(""" */
	var data =[
			['0','4G spaces','4G spaces','http://blog.youxu.info/feed/','http://blog.youxu.info'],
			['1','Ajaxian » Front Page','Ajaxian » Front Page','http://feeds.feedburner.com/ajaxian','http://ajaxian.com'],
			['2','Android Developers Blog','Android Developers Blog','http://android-developers.blogspot.com/atom.xml','http://android-developers.blogspot.com/'],
			['3','Apple4.us','Apple4.us','http://apple4.us/feed','http://apple4us.com'],
			['4','Autoblog 简体中文版','Autoblog 简体中文版','http://cn.autoblog.com/rss.xml','http://cn.autoblog.com'],
			['5','BlogJava-庄周梦蝶','BlogJava-庄周梦蝶','http://feed.feedsky.com/killme2008','http://www.blogjava.net/killme2008/'],
			['6','cnBeta.COM','cnBeta.COM','http://www.cnbeta.com/backend.php','http://www.cnbeta.com'],
			['7','Community : All Content - jBPM','Community : All Content - jBPM','http://community.jboss.org/community/feeds/allcontent?community=2034','https://community.jboss.org/community/jbpm'],
			['8','demo@virushuo','demo@virushuo','http://feeds2.feedburner.com/virushuo','http://blog.devep.net/virushuo/'],
			['9','digg.com: Top News','digg.com: Top News','http://digg.com/rss/index.xml','http://digg.com/rss/top.rss'],
			['10','Dot Mac','Dot Mac','http://dotmac.rationalmind.net/feed/','http://automagical.rationalmind.net'],
			['11','downpour','downpour','http://downpour.javaeye.com/rss','http://downpour.iteye.com'],
			['12','Dustin Diaz','Dustin Diaz','http://feeds.feedburner.com/WSwI','http://dustindiaz.com'],
			['13','Engadget','Engadget','http://www.engadget.com/rss.xml','http://www.engadget.com'],
			['14','Engadget 中国版','Engadget 中国版','http://cn.engadget.com/rss.xml','http://cn.engadget.com'],
			['15','Erlang-China','Erlang-China','http://erlang-china.org/feed','http://erlang-china.org'],
			['16','Ext JS Blog','Ext JS Blog','http://feeds.feedburner.com/extblog','http://www.sencha.com/blog/'],
			['17','FlexLive.net','FlexLive.net','http://www.flexlive.net/?feed=rss2','http://www.flexlive.net'],
			['18','Google 黑板报 - Google （谷歌）中国的博客网志，走近我们的产品、技术和文化','Google 黑板报 - Google （谷歌）中国的博客网志，走近我们的产品、技术和文化','http://googlechinablog.com/atom.xml','http://googlechinablog.blogspot.com/'],
			['19','htmlor blog','htmlor blog','http://blog.htmlor.com/feed/','http://blog.htmlor.com'],
			['20','[ i D | 公 社 ]','[ i D | 公 社 ]','http://feed.feedsky.com/hiid','http://www.hi-id.com'],
			['21','i, Claud','i, Claud','http://blog.claudxiao.net/feed/','http://www.claudxiao.net'],
			['22','iFanr 爱范儿 ♂专注于拇指设备的小众讨论','iFanr 爱范儿 ♂专注于拇指设备的小众讨论','http://www.ifanr.com/feed','http://www.ifanr.com'],
			['23','Juno Chen','Juno Chen','http://blog.163.com/clover1008/rss','http://clover1008.blog.163.com'],
			['24','Leica中文摄影杂志','Leica中文摄影杂志','http://feed.feedsky.com/leica','http://www.leica.org.cn/index.php'],
			['25','Mac Tips | 苹果贴士','Mac Tips | 苹果贴士','http://mactips.blogbus.com/index.rdf','http://mactips.blogbus.com'],
			['26','Official Selenium Blog','Official Selenium Blog','http://feeds.feedburner.com/Selenium','http://seleniumhq.wordpress.com'],
			['27','Rails Inside','Rails Inside','http://feeds.feedburner.com/RailsInside','http://www.railsinside.com'],
			['28','robbin的自言自语','robbin的自言自语','http://robbinfan.com/rss','http://robbinfan.com'],
			['29','Ruby on Rails','Ruby on Rails','http://feeds.feedburner.com/yeeyan/ror','http://www.yeeyan.com/groups/show/ror'],
			['30','Solidot','Solidot','http://feeds.feedburner.com/solidot','http://www.solidot.org'],
			['31','SpringSource Team Blog','SpringSource Team Blog','http://feeds.feedburner.com/Interface21TeamBlog','http://blog.springsource.org'],
			['32','SpringSource.org','SpringSource.org','http://www.springsource.org/node/feed','http://www.springsource.org'],
			['33','The Rails Way - Home','The Rails Way - Home','http://feedproxy.google.com/TheRailsWay','http://www.therailsway.com/'],
			['34','Tinyfool的Blog','Tinyfool的Blog','http://feeds.feedburner.com/Tinyfoolblog','http://pipes.yahoo.com/pipes/pipe.info?_id=2fe2193bf4bad427c14f3c5bae4cfcf6'],
			['35','TopLanguage Google Group','TopLanguage Google Group','http://groups.google.com/group/pongba/feed/rss_v2_0_msgs.xml','http://groups.google.com/group/pongba'],
			['36','Trustno1','Trustno1','http://trustno1.javaeye.com/rss','http://trustno1.iteye.com'],
			['37','wiisola','wiisola','http://wiisola.javaeye.com/rss','http://wiisola.iteye.com'],
			['38','《程序员》官方BLOG','《程序员》官方BLOG','http://blog.csdn.net/programmer_editor/Rss.aspx','http://blog.csdn.net/programmer_editor'],
			['39','云中漫步','云中漫步','http://my.unix-center.net/~Simon_fu/?feed=rss2','http://my.unix-center.net/~Simon_fu'],
			['40','冰云@Blogging','冰云@Blogging','http://feeds.feedburner.com/icecloud','http://icecloud.posterous.com'],
			['41','创意·设计·生活','创意·设计·生活','http://feed.feedsky.com/elandy','http://www.elandy.com.cn'],
			['43','威锋网新闻- 最新RSS订阅','威锋网新闻- 最新RSS订阅','http://news.weiphone.com/rss.xml','http://www.google.com/reader/view/feed%2Fhttp%3A%2F%2Fnews.weiphone.com%2Frss.xml'],
			['44','平凡的世界','平凡的世界','http://feed.ccvita.com/','http://www.ccvita.com/'],
			['45','广告放肆','广告放肆','http://feed.feedsky.com/digiart','http://adfuns.com/index.php'],
			['46','庄周梦蝶','庄周梦蝶','http://blog.fnil.net/index.php/feed','http://blog.fnil.net'],
			['47','影像日报 | MovieSoon.com 好莱坞电影手册','影像日报 | MovieSoon.com 好莱坞电影手册','http://mymovie.blogbus.com/index.rdf','http://mymovie.blogbus.com'],
			['48','技术奇异点','技术奇异点','http://sipoint.wordpress.com/feed/','http://sipoint.wordpress.com'],
			['49','柴静','柴静','http://blog.tianya.cn/blogger/rss.asp?BlogID=2569265','http://GE_chaijing.blog.tianya.cn/'],
			['50','每日小抄','每日小抄','http://feed.feedsky.com/mrxc','http://meirixiaochao.blog.163.com'],
			['51','每日英语','每日英语','http://english-feed.beanwoo.com/','http://blog.beanwoo.com/english'],
			['52','爱枣报','爱枣报','http://feeds.feedburner.com/izaobaofeed','http://www.izaobao.us'],
			['53','疯狂的设计','疯狂的设计','http://hi.baidu.com/madesign/rss','http://hi.baidu.com/madesign'],
			['54','结网','结网','http://feed.feedsky.com/liuhw','http://blog.liuhongwei.cn'],
			['55','胡长城（银狐999）BLOG','胡长城（银狐999）BLOG','http://blog.csdn.net/james999/Rss.aspx','http://blog.csdn.net/james999'],
			['56','译言-精品外文翻译','译言-精品外文翻译','http://feed.feedsky.com/yeeyan_top','http://www.yeeyan.com'],
			['57','豆瓣: MacBook+Pro+Air小组的讨论','豆瓣: MacBook+Pro+Air小组的讨论','http://www.douban.com/feed/group/MACBOOK/discussion','http://www.douban.com/group/MACBOOK/discussion'],
			['58','豆瓣: 苹果迷小组的讨论','豆瓣: 苹果迷小组的讨论','http://www.douban.com/feed/group/macintosh/discussion','http://www.douban.com/group/macintosh/discussion'],
			['59','负暄琐话','负暄琐话','http://feeds.feedsky.com/csdn.net/g9yuayon','http://blog.csdn.net/g9yuayon'],
			['60','透明思考 - Thoughts','透明思考 - Thoughts','http://gigix.agilechina.net/feed/atom.xml','http://gigix.thoughtworkers.org/'],
			['61','酷壳 - CoolShell.cn','酷壳 - CoolShell.cn','http://coolshell.cn/feed?source=ignitionforkhttp://coolshell.cn/feed?source=ignitionfork','http://coolshell.cn'],
			['62','阮一峰的网络日志','阮一峰的网络日志','http://feeds.feedburner.com/ruanyifeng','http://www.ruanyifeng.com/blog/'],
			['63','随便玩玩','随便玩玩','http://feed.feedsky.com/victorsos','http://www.zhengkun.org/blog'],
			['64','韩寒','韩寒','http://blog.sina.com.cn/rss/1191258123.xml','http://blog.sina.com.cn/twocold'],
			['65','java eye total','java eye total','null','null']
	];
	for ( var int = 0; int < data.length; int++) """),format.raw/*104.47*/("""{"""),format.raw/*104.48*/("""
		var record = data[int];
		$('#rssList').append('<li><a href="#" onclick=\"parseRSS(\''+ record[3]+ '\');\">' + record[1] +'</a></li>');
	"""),format.raw/*107.2*/("""}"""),format.raw/*107.3*/("""
	
	/*  $.ajax("""),format.raw/*109.13*/("""{"""),format.raw/*109.14*/("""
		    url: '/RSS/app/ajax/list/getSubscriptions',
		    dataType: 'json',
		    success: function(data) """),format.raw/*112.31*/("""{"""),format.raw/*112.32*/("""
		    		for(p in data) """),format.raw/*113.24*/("""{"""),format.raw/*113.25*/("""
		    			$('#rssList').append('<li><a onclick=\"parseRSS(\''+ data[p]+ '\');\">' + p +'</a></li>');
		    		"""),format.raw/*115.9*/("""}"""),format.raw/*115.10*/("""
		    """),format.raw/*116.7*/("""}"""),format.raw/*116.8*/("""
	 """),format.raw/*117.3*/("""}"""),format.raw/*117.4*/(""");  */
	
	
	// var dataBase = openDatabase("RSS", "1.0", "Rss table", 1024 * 1024, function () """),format.raw/*120.85*/("""{"""),format.raw/*120.86*/(""" """),format.raw/*120.87*/("""}"""),format.raw/*120.88*/(""");
	// 	if (!dataBase) """),format.raw/*121.21*/("""{"""),format.raw/*121.22*/("""
	// 		alert("数据库创建失败！");
	// 	"""),format.raw/*123.6*/("""}"""),format.raw/*123.7*/(""" else """),format.raw/*123.13*/("""{"""),format.raw/*123.14*/("""
	// 		alert("数据库创建成功！");
	// 	"""),format.raw/*125.6*/("""}"""),format.raw/*125.7*/(""" 
	// 	
	// 	createTable=function() """),format.raw/*127.29*/("""{"""),format.raw/*127.30*/("""
	// 		dataBase.transaction( function(tx) """),format.raw/*128.42*/("""{"""),format.raw/*128.43*/(""" 
	// 			tx.executeSql("create table if not exists address (id REAL UNIQUE, title TEXT, name TEXT, xmlUrl TEXT, htmlUrl TEXT, userId TEXT)", 
	// 						[], 
	// 						function(tx,result)"""),format.raw/*131.30*/("""{"""),format.raw/*131.31*/(""" alert('创建address表成功'); """),format.raw/*131.55*/("""}"""),format.raw/*131.56*/(""", 
	// 						function(tx, error)"""),format.raw/*132.30*/("""{"""),format.raw/*132.31*/(""" alert('创建address表失败:' + error.message); 
	// 			"""),format.raw/*133.8*/("""}"""),format.raw/*133.9*/(""");
	// 		"""),format.raw/*134.7*/("""}"""),format.raw/*134.8*/(""");
	// 	"""),format.raw/*135.6*/("""}"""),format.raw/*135.7*/("""; 
	// 	createTable();
	// 	
	// 	insert = function () """),format.raw/*138.27*/("""{"""),format.raw/*138.28*/("""
	// 		dataBase.transaction(function (tx) """),format.raw/*139.42*/("""{"""),format.raw/*139.43*/("""
	// 		tx.executeSql(
	// 		"insert into stu (id, title, name, xmlUrl, htmlUrl, userId) values(?, ?, ?, ?, ?)",
	// 		['02', 'abc'],
	// 			function () """),format.raw/*143.20*/("""{"""),format.raw/*143.21*/(""" alert('添加数据成功'); """),format.raw/*143.39*/("""}"""),format.raw/*143.40*/(""",
	// 			function (tx, error) """),format.raw/*144.29*/("""{"""),format.raw/*144.30*/(""" alert('添加数据失败: ' + error.message); 
	// 			"""),format.raw/*145.8*/("""}"""),format.raw/*145.9*/(""" );
	// 		"""),format.raw/*146.7*/("""}"""),format.raw/*146.8*/(""");
	// 	"""),format.raw/*147.6*/("""}"""),format.raw/*147.7*/(""";
	// 	insert(); 
"""),format.raw/*149.1*/("""}"""),format.raw/*149.2*/(""");
function createCollapseStyle(e, i) """),format.raw/*150.36*/("""{"""),format.raw/*150.37*/("""
	
	var content = '<div class="accordion-group">';
		content += ' <div class="accordion-heading">';
			content += ' <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#' + i + '">';
			if( i % 2 == 0)	 """),format.raw/*155.21*/("""{"""),format.raw/*155.22*/("""
				content += '<p class="muted">' + e.title + '</p>';
			"""),format.raw/*157.4*/("""}"""),format.raw/*157.5*/(""" else """),format.raw/*157.11*/("""{"""),format.raw/*157.12*/("""
				content += e.title;
			"""),format.raw/*159.4*/("""}"""),format.raw/*159.5*/("""
			
			content += '</a>';
		content += '</div>';
		content += '<div id="' + i + '" class="accordion-body collapse">';
			content += '<div class="accordion-inner">';
				content += "<div class='contentId'><div class='hero-unit'><a target='_blank' href='" + e.link + "'>" + e.title +"</a>" + "<p>" + e.author + "</p>" + e.content + "</div></div>";
			content += "</div>";
		content += "</div>";
		content += "</div>";
		
		return content;
"""),format.raw/*171.1*/("""}"""),format.raw/*171.2*/("""
function parseRSS(url, callback) """),format.raw/*172.34*/("""{"""),format.raw/*172.35*/("""
	   $.ajax("""),format.raw/*173.12*/("""{"""),format.raw/*173.13*/("""
	    url: 'http://ajax.googleapis.com/ajax/services/feed/load?q=' + encodeURIComponent(url) + '&v=1.0&num=50&callback=?',
	    dataType: 'json',
	    success: function(data) """),format.raw/*176.30*/("""{"""),format.raw/*176.31*/("""
	    	 	var el = document.getElementById('contentId');
	    	 	if(el) """),format.raw/*178.16*/("""{"""),format.raw/*178.17*/("""
	    	 		$('.contentId').remove();
	    	 	"""),format.raw/*180.9*/("""}"""),format.raw/*180.10*/("""
	    		var rows = '<div class="accordion" id="accordion2">';
	    		if (data.responseData.feed && data.responseData.feed.entries) """),format.raw/*182.70*/("""{"""),format.raw/*182.71*/("""
	    			$.each(data.responseData.feed.entries, function (i, e) """),format.raw/*183.64*/("""{"""),format.raw/*183.65*/("""
	    				rows += createCollapseStyle(e, i);
	    	      	"""),format.raw/*185.14*/("""}"""),format.raw/*185.15*/("""); 
	    			rows += '</div>';
	    	    """),format.raw/*187.11*/("""}"""),format.raw/*187.12*/("""
	    		rows = "<div class='contentId'>" + rows + "</div>";
	    		 $('#span10').append(rows);
	    """),format.raw/*190.6*/("""}"""),format.raw/*190.7*/("""
	  """),format.raw/*191.4*/("""}"""),format.raw/*191.5*/("""); 
	"""),format.raw/*192.2*/("""}"""),format.raw/*192.3*/("""
	
</script>
</head>

<body>

	<div class="container-fluid">
      <div class="row-fluid">
        <div class="span2">
          <div class="well sidebar-nav">
            <ul id="rssList" class="nav nav-list">
            </ul>
          </div><!--/.well -->
        </div><!--/span-->
        <div id="span10" class="span10">
          <div id="contentId">
          </div>
        </div><!--/span-->
      </div><!--/row-->
      
      
      <!-- Button to trigger modal -->
	<a href="#myModal" role="button" class="btn" data-toggle="modal">Launch demo modal</a>
	 
	<!-- Modal -->
	<div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	  <div class="modal-header">
	    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
	    <h3 id="myModalLabel"></h3>
	  </div>
	  <div id="modelBody" class="modal-body">
	  </div>
	  <div class="modal-footer">
	    <button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
	    <button class="btn btn-primary">Save changes</button>
	  </div>
	</div>
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
                    DATE: Fri Nov 08 12:04:35 CST 2013
                    SOURCE: /Users/pdbi/Documents/PlayWorkSpace/RSS_copy/app/views/readerForm.scala.html
                    HASH: 8d8f0dafc226f3ceae3155de18cc595dcf92a933
                    MATRIX: 651->2|686->29|725->31|1066->344|1095->345|1186->409|1214->410|1262->430|1291->431|1349->462|1377->463|1434->492|1463->493|1520->523|1548->524|1592->540|1621->541|1696->589|1724->590|1824->662|1853->663|2048->830|2077->831|2196->923|2224->924|9610->8285|9640->8286|9808->8426|9837->8427|9881->8442|9911->8443|10045->8548|10075->8549|10128->8573|10158->8574|10295->8683|10325->8684|10360->8691|10389->8692|10420->8695|10449->8696|10573->8791|10603->8792|10633->8793|10663->8794|10715->8817|10745->8818|10804->8849|10833->8850|10868->8856|10898->8857|10957->8888|10986->8889|11051->8925|11081->8926|11152->8968|11182->8969|11397->9155|11427->9156|11480->9180|11510->9181|11571->9213|11601->9214|11678->9263|11707->9264|11744->9273|11773->9274|11809->9282|11838->9283|11922->9338|11952->9339|12023->9381|12053->9382|12234->9534|12264->9535|12311->9553|12341->9554|12400->9584|12430->9585|12502->9629|12531->9630|12569->9640|12598->9641|12634->9649|12663->9650|12709->9668|12738->9669|12805->9707|12835->9708|13098->9942|13128->9943|13215->10002|13244->10003|13279->10009|13309->10010|13365->10038|13394->10039|13860->10477|13889->10478|13952->10512|13982->10513|14023->10525|14053->10526|14257->10701|14287->10702|14387->10773|14417->10774|14489->10818|14519->10819|14679->10950|14709->10951|14802->11015|14832->11016|14919->11074|14949->11075|15018->11115|15048->11116|15176->11216|15205->11217|15237->11221|15266->11222|15299->11227|15328->11228
                    LINES: 22->2|22->2|22->2|34->14|34->14|37->17|37->17|38->18|38->18|40->20|40->20|42->22|42->22|44->24|44->24|45->25|45->25|48->28|48->28|52->32|52->32|54->34|54->34|56->36|56->36|124->104|124->104|127->107|127->107|129->109|129->109|132->112|132->112|133->113|133->113|135->115|135->115|136->116|136->116|137->117|137->117|140->120|140->120|140->120|140->120|141->121|141->121|143->123|143->123|143->123|143->123|145->125|145->125|147->127|147->127|148->128|148->128|151->131|151->131|151->131|151->131|152->132|152->132|153->133|153->133|154->134|154->134|155->135|155->135|158->138|158->138|159->139|159->139|163->143|163->143|163->143|163->143|164->144|164->144|165->145|165->145|166->146|166->146|167->147|167->147|169->149|169->149|170->150|170->150|175->155|175->155|177->157|177->157|177->157|177->157|179->159|179->159|191->171|191->171|192->172|192->172|193->173|193->173|196->176|196->176|198->178|198->178|200->180|200->180|202->182|202->182|203->183|203->183|205->185|205->185|207->187|207->187|210->190|210->190|211->191|211->191|212->192|212->192
                    -- GENERATED --
                */
            