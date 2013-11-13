
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
object readerNew extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*2.2*/main("Welcome to Play 2.1 New")/*2.33*/ {_display_(Seq[Any](format.raw/*2.35*/("""
<!DOCTYPE html>
<html>
<head>
    <title>Reader123 New</title> 
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

	var data =[
			['0','4G spaces','4G spaces','http://blog.youxu.info/feed/','http://blog.youxu.info'],
			['1','Ajaxian » Front Page','Ajaxian » Front Page','http://feeds.feedburner.com/ajaxian','http://ajaxian.com'],
			['2','Android Developers Blog','Android Developers Blog','http://android-developers.blogspot.com/atom.xml','http://android-developers.blogspot.com/'],
			['3','Apple4.us','Apple4.us','http://apple4.us/feed','http://apple4us.com'],
			['4','Autoblog 简体中文版','Autoblog 简体中文版','http://cn.autoblog.com/rss.xml','http://cn.autoblog.com'],
			['5','BlogJava-庄周梦蝶','BlogJava-庄周梦蝶','http://www.blog.fnil.net/index.php/feed','http://www.blog.fnil.net/index.php/feed'],
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
			['65','JavaEye新闻','JavaEye新闻','http://www.javaeye.com/rss/news','http://www.iteye.com'],
			['66','Scala fineqtbull','fineqtbull','http://fineqtbull.iteye.com/rss','http://www.iteye.com'],
			['67','淘宝核心系统团队博客','淘宝核心系统团队博客','http://rdc.taobao.com/blog/cs/?feed=rss2', 'http://rdc.taobao.com/blog/cs/?feed=rss2'],
			['68', 'UC技术博客','UC技术博客', 'http://tech.uc.cn/?feed=rss2','http://tech.uc.cn/?feed=rss2'],
			['69', '结构之法 算法之道','结构之法 算法之道','feed://blog.csdn.net/v_july_v/rss/list','feed://blog.csdn.net/v_july_v/rss/list']
			
	];
	for ( var int = 0; int < data.length; int++) """),format.raw/*106.47*/("""{"""),format.raw/*106.48*/("""
		var record = data[int];
		$('#rssList').append('<li class="list-group-item"><span class="badge">14</span><a href="#" onclick=\"parseRSS(\''+ record[3]+ '\');\">' + record[1] +'</a></li>');
		
		
	"""),format.raw/*111.2*/("""}"""),format.raw/*111.3*/("""
	debugger;
	/*  $.ajax("""),format.raw/*113.13*/("""{"""),format.raw/*113.14*/("""
		    url: '/RSS/app/ajax/list/getSubscriptions',
		    dataType: 'json',
		    success: function(data) """),format.raw/*116.31*/("""{"""),format.raw/*116.32*/("""
		    		for(p in data) """),format.raw/*117.24*/("""{"""),format.raw/*117.25*/("""
		    			$('#rssList').append('<li><a onclick=\"parseRSS(\''+ data[p]+ '\');\">' + p +'</a></li>');
		    		"""),format.raw/*119.9*/("""}"""),format.raw/*119.10*/("""
		    """),format.raw/*120.7*/("""}"""),format.raw/*120.8*/("""
	 """),format.raw/*121.3*/("""}"""),format.raw/*121.4*/(""");  */
	
	
	// var dataBase = openDatabase("RSS", "1.0", "Rss table", 1024 * 1024, function () """),format.raw/*124.85*/("""{"""),format.raw/*124.86*/(""" """),format.raw/*124.87*/("""}"""),format.raw/*124.88*/(""");
	// 	if (!dataBase) """),format.raw/*125.21*/("""{"""),format.raw/*125.22*/("""
	// 		alert("数据库创建失败！");
	// 	"""),format.raw/*127.6*/("""}"""),format.raw/*127.7*/(""" else """),format.raw/*127.13*/("""{"""),format.raw/*127.14*/("""
	// 		alert("数据库创建成功！");
	// 	"""),format.raw/*129.6*/("""}"""),format.raw/*129.7*/(""" 
	// 	
	// 	createTable=function() """),format.raw/*131.29*/("""{"""),format.raw/*131.30*/("""
	// 		dataBase.transaction( function(tx) """),format.raw/*132.42*/("""{"""),format.raw/*132.43*/(""" 
	// 			tx.executeSql("create table if not exists address (id REAL UNIQUE, title TEXT, name TEXT, xmlUrl TEXT, htmlUrl TEXT, userId TEXT)", 
	// 						[], 
	// 						function(tx,result)"""),format.raw/*135.30*/("""{"""),format.raw/*135.31*/(""" alert('创建address表成功'); """),format.raw/*135.55*/("""}"""),format.raw/*135.56*/(""", 
	// 						function(tx, error)"""),format.raw/*136.30*/("""{"""),format.raw/*136.31*/(""" alert('创建address表失败:' + error.message); 
	// 			"""),format.raw/*137.8*/("""}"""),format.raw/*137.9*/(""");
	// 		"""),format.raw/*138.7*/("""}"""),format.raw/*138.8*/(""");
	// 	"""),format.raw/*139.6*/("""}"""),format.raw/*139.7*/("""; 
	// 	createTable();
	// 	
	// 	insert = function () """),format.raw/*142.27*/("""{"""),format.raw/*142.28*/("""
	// 		dataBase.transaction(function (tx) """),format.raw/*143.42*/("""{"""),format.raw/*143.43*/("""
	// 		tx.executeSql(
	// 		"insert into stu (id, title, name, xmlUrl, htmlUrl, userId) values(?, ?, ?, ?, ?)",
	// 		['02', 'abc'],
	// 			function () """),format.raw/*147.20*/("""{"""),format.raw/*147.21*/(""" alert('添加数据成功'); """),format.raw/*147.39*/("""}"""),format.raw/*147.40*/(""",
	// 			function (tx, error) """),format.raw/*148.29*/("""{"""),format.raw/*148.30*/(""" alert('添加数据失败: ' + error.message); 
	// 			"""),format.raw/*149.8*/("""}"""),format.raw/*149.9*/(""" );
	// 		"""),format.raw/*150.7*/("""}"""),format.raw/*150.8*/(""");
	// 	"""),format.raw/*151.6*/("""}"""),format.raw/*151.7*/(""";
	// 	insert(); 
"""),format.raw/*153.1*/("""}"""),format.raw/*153.2*/(""");
function createCollapseStyle(e, i) """),format.raw/*154.36*/("""{"""),format.raw/*154.37*/("""
	
		var content = '<div class="panel-group" id="accordion">';
				content += 	'<div class="panel panel-default">';
				content += 		'<div class="panel-heading">';
				content +=			'<h4 class="panel-title">';
				content +=				'<a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion" href="#' + i + '">';
				content +=				 e.title;
				content +=				'</a>';
				content +=			'</h4>';
				content +=		'</div>';
				content +=	'<div id="' + i + '" class="panel-collapse collapse">';
				content +=		'<div class="panel-body">';
				
				content +=			'<h4><a target="_blank" href="' + e.link + '">' + e.title +'</a></h4><p>' + e.author + '</p>' + e.content;
				content +=		'</div>';
				content +=	'</div>';
				content +=	'</div>';
				content +=	'</div>';

		return content;
"""),format.raw/*175.1*/("""}"""),format.raw/*175.2*/("""
function parseRSS(url, callback) """),format.raw/*176.34*/("""{"""),format.raw/*176.35*/("""
	   $.ajax("""),format.raw/*177.12*/("""{"""),format.raw/*177.13*/("""
	    url: 'http://ajax.googleapis.com/ajax/services/feed/load?q=' + encodeURIComponent(url) + '&v=1.0&num=50&callback=?',
	    dataType: 'json',
	    success: function(data) """),format.raw/*180.30*/("""{"""),format.raw/*180.31*/("""
	    	 	if(	$('#majorLayout')) """),format.raw/*181.32*/("""{"""),format.raw/*181.33*/("""
	    	 		$('#majorLayout').empty();
	    	 	"""),format.raw/*183.9*/("""}"""),format.raw/*183.10*/("""
	    		var rows = '';
	    		if (data.responseData.feed && data.responseData.feed.entries) """),format.raw/*185.70*/("""{"""),format.raw/*185.71*/("""
	    			$.each(data.responseData.feed.entries, function (i, e) """),format.raw/*186.64*/("""{"""),format.raw/*186.65*/("""
	    				rows += createCollapseStyle(e, i);
	    	      	"""),format.raw/*188.14*/("""}"""),format.raw/*188.15*/("""); 
	    	    """),format.raw/*189.11*/("""}"""),format.raw/*189.12*/("""
	    		
	    		 $('#majorLayout').append(rows);
	    """),format.raw/*192.6*/("""}"""),format.raw/*192.7*/("""
	  """),format.raw/*193.4*/("""}"""),format.raw/*193.5*/("""); 
	"""),format.raw/*194.2*/("""}"""),format.raw/*194.3*/("""
	
</script>
</head>

<body>
	<div class="col-xs-6 col-sm-3 sidebar-offcanvas" style='height:800px; position:relative;overflow:auto' data-spy="scroll"  data-offset="0">
		<ul id="rssList" ></ul>
	</div>
	<div class="col-xs-12 col-sm-9" style='height:800px; position:relative;overflow:auto' data-spy="scroll"  data-offset="0">
		<div id="majorLayout" >
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
                    SOURCE: /Users/pdbi/Documents/PlayWorkSpace/RSS_copy/app/views/readerNew.scala.html
                    HASH: b1b3c634bc57ba0c3bc35d9174c9faec431113a8
                    MATRIX: 650->2|689->33|728->35|1072->351|1101->352|1192->416|1220->417|1268->437|1297->438|1355->469|1383->470|1440->499|1469->500|1526->530|1554->531|1598->547|1627->548|1702->596|1730->597|1830->669|1859->670|9724->8510|9754->8511|9981->8710|10010->8711|10063->8735|10093->8736|10227->8841|10257->8842|10310->8866|10340->8867|10477->8976|10507->8977|10542->8984|10571->8985|10602->8988|10631->8989|10755->9084|10785->9085|10815->9086|10845->9087|10897->9110|10927->9111|10986->9142|11015->9143|11050->9149|11080->9150|11139->9181|11168->9182|11233->9218|11263->9219|11334->9261|11364->9262|11579->9448|11609->9449|11662->9473|11692->9474|11753->9506|11783->9507|11860->9556|11889->9557|11926->9566|11955->9567|11991->9575|12020->9576|12104->9631|12134->9632|12205->9674|12235->9675|12416->9827|12446->9828|12493->9846|12523->9847|12582->9877|12612->9878|12684->9922|12713->9923|12751->9933|12780->9934|12816->9942|12845->9943|12891->9961|12920->9962|12987->10000|13017->10001|13840->10796|13869->10797|13932->10831|13962->10832|14003->10844|14033->10845|14237->11020|14267->11021|14328->11053|14358->11054|14431->11099|14461->11100|14582->11192|14612->11193|14705->11257|14735->11258|14822->11316|14852->11317|14895->11331|14925->11332|15007->11386|15036->11387|15068->11391|15097->11392|15130->11397|15159->11398
                    LINES: 22->2|22->2|22->2|34->14|34->14|37->17|37->17|38->18|38->18|40->20|40->20|42->22|42->22|44->24|44->24|45->25|45->25|48->28|48->28|52->32|52->32|126->106|126->106|131->111|131->111|133->113|133->113|136->116|136->116|137->117|137->117|139->119|139->119|140->120|140->120|141->121|141->121|144->124|144->124|144->124|144->124|145->125|145->125|147->127|147->127|147->127|147->127|149->129|149->129|151->131|151->131|152->132|152->132|155->135|155->135|155->135|155->135|156->136|156->136|157->137|157->137|158->138|158->138|159->139|159->139|162->142|162->142|163->143|163->143|167->147|167->147|167->147|167->147|168->148|168->148|169->149|169->149|170->150|170->150|171->151|171->151|173->153|173->153|174->154|174->154|195->175|195->175|196->176|196->176|197->177|197->177|200->180|200->180|201->181|201->181|203->183|203->183|205->185|205->185|206->186|206->186|208->188|208->188|209->189|209->189|212->192|212->192|213->193|213->193|214->194|214->194
                    -- GENERATED --
                */
            