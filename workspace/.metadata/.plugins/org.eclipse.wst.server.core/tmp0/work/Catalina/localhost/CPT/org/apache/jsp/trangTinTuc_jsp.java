/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-05-27 16:23:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class trangTinTuc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/all/css.jsp", Long.valueOf(1716046732835L));
    _jspx_dependants.put("/all/homeFooter.jsp", Long.valueOf(1716826949901L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("<link href=\"https://getbootstrap.com/docs/5.3/assets/css/docs.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"all/style.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/sweetalert2@11/dist/sweetalert2.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/sweetalert2@11/dist/sweetalert2.min.css\">");
      out.write("\r\n");
      out.write("<title>Tin tức</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("* {\r\n");
      out.write("	padding: 0px;\r\n");
      out.write("	margin: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#wrap {\r\n");
      out.write("	width: 1344px;\r\n");
      out.write("	margin: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 75px;\r\n");
      out.write("	background-color: #192433;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=\"text\"] {\r\n");
      out.write("	width: 300px;\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("	border: 1px solid black;\r\n");
      out.write("	border-radius: 4px; /* bo góc boder*/\r\n");
      out.write("	outline: none;\r\n");
      out.write("	padding: 12px 14px;\r\n");
      out.write("	transition: 0.6s ease-in-out;\r\n");
      out.write("	margin-top: 15px;\r\n");
      out.write("	background-color: #151D28;\r\n");
      out.write("	color: #EEE;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form {\r\n");
      out.write("	float: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=\"submit\"] {\r\n");
      out.write("	width: 40px;\r\n");
      out.write("	height: 40px;\r\n");
      out.write("	margin-top: 15px;\r\n");
      out.write("	float: right;\r\n");
      out.write("	background-image: url(../ima/tk2.jpg);\r\n");
      out.write("	border: 1px solid black;\r\n");
      out.write("	border-radius: 4px;\r\n");
      out.write("	background-repeat: no-repeat;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".img1 {\r\n");
      out.write("	width: 75px;\r\n");
      out.write("	height: 75px;\r\n");
      out.write("	float: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".h2 {\r\n");
      out.write("	float: left;\r\n");
      out.write("	margin-left: 20px;\r\n");
      out.write("	color: #FFF;\r\n");
      out.write("	font-size: 26px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".h22 {\r\n");
      out.write("	color: #F00;\r\n");
      out.write("	margin-left: 20px;\r\n");
      out.write("	float: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h3 {\r\n");
      out.write("	color: #F00;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#menu {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 52px;\r\n");
      out.write("	background-color: #151D28;\r\n");
      out.write("	font-size: large;\r\n");
      out.write("	border: 0px solid #F00;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dk {\r\n");
      out.write("	float: right;\r\n");
      out.write("	padding-top: 10px;\r\n");
      out.write("	color: #EEE;\r\n");
      out.write("	padding-right: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dk a {\r\n");
      out.write("	color: #EEE;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	list-style-type: none;\r\n");
      out.write("	float: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ul {\r\n");
      out.write("	float: left;\r\n");
      out.write("	margin-left: 65px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li {\r\n");
      out.write("	display: inline-block; /* hien thi list hàng ngang */\r\n");
      out.write("	width: 115px;\r\n");
      out.write("	height: 40px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	padding-top: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#menu a:hover {\r\n");
      out.write("	color: #D00;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#a1 {\r\n");
      out.write("	color: #FFF;\r\n");
      out.write("	font-size: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("	text-decoration: none; /* link ko có gạch dưới */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#leftt {\r\n");
      out.write("	width: 1px;\r\n");
      out.write("	height: 1000px;\r\n");
      out.write("	color: #CCC;\r\n");
      out.write("	float: left;\r\n");
      out.write("	border: 1px #000;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".img5 {\r\n");
      out.write("	width: 197px;\r\n");
      out.write("	height: 1000px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#contend {\r\n");
      out.write("	width: 830px;\r\n");
      out.write("	float: left;\r\n");
      out.write("	background-color: #FFF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#noidung {\r\n");
      out.write("	width: 1170px;\r\n");
      out.write("	margin-left: 90px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".img2 {\r\n");
      out.write("	width: 580px;\r\n");
      out.write("	height: 330px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".img3 {\r\n");
      out.write("	width: 350px;\r\n");
      out.write("	height: 260px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".img4 {\r\n");
      out.write("	width: 800px;\r\n");
      out.write("	height: 260px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("b {\r\n");
      out.write("	text-align: justify;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".div121 {\r\n");
      out.write("	width: 830px;\r\n");
      out.write("	height: 780px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".div1211 {\r\n");
      out.write("	width: 600px;\r\n");
      out.write("	height: 465px;\r\n");
      out.write("	float: left;\r\n");
      out.write("	border: 0px solid #010;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".div1212 {\r\n");
      out.write("	width: 220px;\r\n");
      out.write("	height: 400px;\r\n");
      out.write("	border: 1px solid #C00;\r\n");
      out.write("	float: left;\r\n");
      out.write("	margin-left: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("hr {\r\n");
      out.write("	color: #9F9;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#right {\r\n");
      out.write("	width: 310px;\r\n");
      out.write("	float: right;\r\n");
      out.write("	border: 0px solid #000;\r\n");
      out.write("	padding-top: 20px;\r\n");
      out.write("	padding-left: 18px;\r\n");
      out.write("	background-color: #EEE;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#r1 {\r\n");
      out.write("	width: 290px;\r\n");
      out.write("	height: 80px;\r\n");
      out.write("	border: 0px solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#r1 img {\r\n");
      out.write("	width: 55px;\r\n");
      out.write("	height: 55px;\r\n");
      out.write("	float: left;\r\n");
      out.write("	padding-right: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".qc1 {\r\n");
      out.write("	width: 300px;\r\n");
      out.write("	height: 80px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".qc2 {\r\n");
      out.write("	width: 300px;\r\n");
      out.write("	height: 450px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#footer {\r\n");
      out.write("	width: 1344px;\r\n");
      out.write("	height: 300px;\r\n");
      out.write("	background-color: #192433;\r\n");
      out.write("	clear: both;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("span {\r\n");
      out.write("	width: 830px;\r\n");
      out.write("	height: 200px;\r\n");
      out.write("	border: 0px solid;\r\n");
      out.write("	float: left;\r\n");
      out.write("	padding-bottom: 17px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("span img {\r\n");
      out.write("	float: left;\r\n");
      out.write("	padding-right: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("span p {\r\n");
      out.write("	float: right;\r\n");
      out.write("	padding-top: 50px;\r\n");
      out.write("	font-style: italic;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".divtb {\r\n");
      out.write("	width: 200px;\r\n");
      out.write("	height: 25px;\r\n");
      out.write("	background-color: #F66;\r\n");
      out.write("	border-bottom-color: #000;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	margin-bottom: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".divtb p {\r\n");
      out.write("	color: #EEE;\r\n");
      out.write("	padding-top: 3px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".docnhieu {\r\n");
      out.write("	width: 830px;;\r\n");
      out.write("	height: 300px;\r\n");
      out.write("	border: 2px solid #010;\r\n");
      out.write("	float: left;\r\n");
      out.write("	padding-top: 5px;\r\n");
      out.write("	background-color: #232C38;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".docnhieu div {\r\n");
      out.write("	width: 250px;\r\n");
      out.write("	height: 250px;\r\n");
      out.write("	border: 1px solid #000;\r\n");
      out.write("	float: left;\r\n");
      out.write("	background-color: #151D28;\r\n");
      out.write("	margin-left: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".docnhieu hr {\r\n");
      out.write("	float: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".docnhieu img {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	padding-left: 30px;\r\n");
      out.write("	padding-top: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".docnhieu a {\r\n");
      out.write("	float: left;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	color: #DDD;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".divft {\r\n");
      out.write("	width: 200px;\r\n");
      out.write("	height: 220px;\r\n");
      out.write("	border: px solid #EEE;\r\n");
      out.write("	float: left;\r\n");
      out.write("	margin-left: 115px;\r\n");
      out.write("	line-height: 30px;\r\n");
      out.write("	padding-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".divft1 {\r\n");
      out.write("	width: 1344px;\r\n");
      out.write("	height: 50px;\r\n");
      out.write("	border: 0px solid;\r\n");
      out.write("	float: left;\r\n");
      out.write("	background-color: #151D28;\r\n");
      out.write("	padding-left: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".divft2 {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 100px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	border: 0px solid;\r\n");
      out.write("	float: left;\r\n");
      out.write("	background-color: #192433;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#aft {\r\n");
      out.write("	padding-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h4 {\r\n");
      out.write("	color: #EEE;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".divft a {\r\n");
      out.write("	color: #AAA;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".divft a:hover {\r\n");
      out.write("	color: #EEE;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".divft1 a {\r\n");
      out.write("	color: #3FF;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "all/homeHeader.jsp", out, false);
      out.write("\r\n");
      out.write("	<div id=\"wrap\">\r\n");
      out.write("		<div id=\"header\"></div>\r\n");
      out.write("		<br>\r\n");
      out.write("		<div id=\"noidung\">\r\n");
      out.write("			<div id=\"contend\">\r\n");
      out.write("				<div class=\"div121\">\r\n");
      out.write("					<div class=\"div1211\">\r\n");
      out.write("						<h3 class=\"divtb\">\r\n");
      out.write("							<p>TIN NỔI BẬT\r\n");
      out.write("						</h3>\r\n");
      out.write("						</a> <img src=\"img/win2.jpg\" class=\"img2\"> <br> <a\r\n");
      out.write("							href=\"http://genk.vn/samsung-galaxy-s10-vs-xiaomi-mi-9-cung-cau-hinh-manh-3-camera-cam-bien-van-tay-duoi-man-hinh-lieu-s10-co-dang-muc-gia-gap-doi-20190301133736815.chn\"\r\n");
      out.write("							class=\"a1\">\r\n");
      out.write("							<h2>6 Giải pháp đơn giản giúp khắc phục lỗi khởi động chậm\r\n");
      out.write("								trên Windows 10</h2>\r\n");
      out.write("						</a>\r\n");
      out.write("						<!-- <br> Nếu cảm thấy Windows 10 của bạn khởi động quá lâu, hãy xem ngay bài viết này.-->\r\n");
      out.write("					</div>\r\n");
      out.write("					<br>\r\n");
      out.write("					<div class=\"div1212\">\r\n");
      out.write("						<b> Tin công nghệ <img src=\"img/hot.gif\" width=\"30\"\r\n");
      out.write("							height=\"30\"></b> <br> <br>\r\n");
      out.write("						<marquee onmouseover=\"this.stop()\" direction=\"up\"\r\n");
      out.write("							onmouseout=\"this.start()\" Scroll scrollamount=\"5\">\r\n");
      out.write("							<a href=\"#\">Những chiếc Samsung Galaxy S10 đầu tiên đến tay\r\n");
      out.write("								Khách Hàng Việt Nam</a>\r\n");
      out.write("							<hr>\r\n");
      out.write("							<a href=\"#\">E ngại sức ép từ Mỹ, Huawei cầu cứu các nhà cung\r\n");
      out.write("								cấp Nhật Bản</a>\r\n");
      out.write("							<hr>\r\n");
      out.write("							<a href=\"#\">Các tiện ích Cổng thanh toán PayPal dành cho bạn</a>\r\n");
      out.write("							<hr>\r\n");
      out.write("							<a href=\"#\">Cách cài WordPress cục bộ trên máy tính với\r\n");
      out.write("								ServerPress</a>\r\n");
      out.write("							<hr>\r\n");
      out.write("							<a href=\"#\">Cách gỡ cài đặt Ubuntu an toàn khỏi PC dual boot\r\n");
      out.write("								Windows</a>\r\n");
      out.write("							<hr>\r\n");
      out.write("							<a href=\"#\">Tính năng nhận dạng chữ viết tay mới của Gboard\r\n");
      out.write("								được tích hợp AI, giảm thiểu lỗi tới 40%</a>\r\n");
      out.write("							<hr>\r\n");
      out.write("							<a href=\"#\">10 phím tắt mà người dùng hay vô tình nhấn phải </a>\r\n");
      out.write("							<hr>\r\n");
      out.write("							<a href=\"#\">\"Thứ giúp Samsung đả bại Apple chính là jack\r\n");
      out.write("								3.5mm\"</a>\r\n");
      out.write("						</marquee>\r\n");
      out.write("					</div>\r\n");
      out.write("					<br> <br> <a href=\"http://shopee.vn/cuahangit36\"\r\n");
      out.write("						class=\"a1\"><img src=\"img/banner.png\" class=\"img4\"></a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<h3 class=\"divtb\">\r\n");
      out.write("					<p>ĐỪNG BỎ LỠ\r\n");
      out.write("				</h3>\r\n");
      out.write("				</a> <br> <span> <img src=\"img/anh1.jpg\" width=\"200\"\r\n");
      out.write("					height=\"200\"> <a href=\"#\">\r\n");
      out.write("						<h2>5 công cụ giám sát cơ sở hạ tầng CNTT tốt nhất</h2>\r\n");
      out.write("				</a> <br> Các công cụ và phần mềm giám sát cơ sở hạ tầng CNTT rất\r\n");
      out.write("					quan trọng trong việc theo dõi những hệ thống mạng phức tạp và đang\r\n");
      out.write("					phát triển nhanh chóng như hiện nay. <br>\r\n");
      out.write("					<p>6 phút trước</p>\r\n");
      out.write("				</span> <br>\r\n");
      out.write("				<hr>\r\n");
      out.write("				<br> <span> <img src=\"img/anh2.jpg\" width=\"200\"\r\n");
      out.write("					height=\"200\"> <a href=\"#\">\r\n");
      out.write("						<h2>Lập trình viên sử dụng 12.000 dòng code ‘lột xác’ hoàn\r\n");
      out.write("							toàn cho đồ họa trong game Quake 2 từ năm 1997</h2>\r\n");
      out.write("				</a> <br> NVIDIA đã bắt tay với các lập trình viên của dự án để có\r\n");
      out.write("					thể tạo ra Quake II RTX, một game thuần hiệu ứng dò tia sáng. <br>\r\n");
      out.write("					<p>6 phút trước</p>\r\n");
      out.write("				</span> <br>\r\n");
      out.write("				<hr>\r\n");
      out.write("				<br> <span> <img src=\"img/anh3.jpg\" width=\"200\"\r\n");
      out.write("					height=\"200\"> <a href=\"#\">\r\n");
      out.write("						<h2>Chiêm ngưỡng ứng dụng AI mới của Nvidia: Biến nét vẽ\r\n");
      out.write("							nguệch ngoạc theo phong cách MS Paint thành những “kiệt tác” nghệ\r\n");
      out.write("							thuật</h2>\r\n");
      out.write("				</a> <br> Mới đây, các nhà nghiên cứu trí tuệ nhân tạo Nvidia đã\r\n");
      out.write("					phát triển thành công một mô hình học sâu (deep learning) có khả\r\n");
      out.write("					năng... <br>\r\n");
      out.write("					<p>6 phút trước</p>\r\n");
      out.write("				</span> <br>\r\n");
      out.write("				<hr>\r\n");
      out.write("				<br> <span> <img src=\"img/anh4.jpg\" width=\"200\"\r\n");
      out.write("					height=\"200\"> <a href=\"#\">\r\n");
      out.write("						<h2>Cách mở 178 định dạng ảnh trên Windows 10</h2>\r\n");
      out.write("				</a> <br> Ứng dụng Picture Opener Pro sẽ mở nhiều định dạng ảnh, mà\r\n");
      out.write("					không cần phải chuyển đổi định dạng. <br>\r\n");
      out.write("					<p>6 phút trước</p>\r\n");
      out.write("				</span>\r\n");
      out.write("				<hr>\r\n");
      out.write("				<div class=\"docnhieu\">\r\n");
      out.write("					<hr>\r\n");
      out.write("					<center>\r\n");
      out.write("						<h3 class=\"divtb\">\r\n");
      out.write("							<marquee>\r\n");
      out.write("								<p>TIN ĐỌC NHIỀU\r\n");
      out.write("							</marquee>\r\n");
      out.write("						</h3>\r\n");
      out.write("					</center>\r\n");
      out.write("					<div>\r\n");
      out.write("						<img src=\"img/a6.jpg\" width=\"200\" height=\"200\"> <a\r\n");
      out.write("							href=\"#\">Top ứng dụng Android đang miễn phí và giảm giá </a>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div>\r\n");
      out.write("						<img src=\"img/a7.jpg\" width=\"200\" height=\"200\"> <a\r\n");
      out.write("							href=\"#\">8 ứng dụng iPhone có thể khóa bằng Touch ID hoặc\r\n");
      out.write("							Face ID </a>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div>\r\n");
      out.write("						<img src=\"img/a8.png\" width=\"200\" height=\"200\"> <a\r\n");
      out.write("							href=\"#\">Cách hủy kết bạn Facebook ảo hàng loạt </a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<hr>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div id=\"right\">\r\n");
      out.write("				<img\r\n");
      out.write("					src=\"https://cdn.fptshop.com.vn/Uploads/Originals/2019/2/28/636869719313136991_H2.png\"\r\n");
      out.write("					class=\"qc1\"> <br> <br> <img src=\"img/qc4.jpg\"\r\n");
      out.write("					class=\"qc4\" width=\"300\" height=\"250\"> <br> <img\r\n");
      out.write("					src=\"img/qc3.png\" width=\"300\" height=\"250\"> <br> <br>\r\n");
      out.write("				<b>Tin video<b> <video controls height=\"200\" width=\"300\">\r\n");
      out.write("							<source src=\"../videos/1.mp4\" type=\"video/mp4\">\r\n");
      out.write("						</video> <br> <br>\r\n");
      out.write("						<h3>ICT NEWS</h3> <br>\r\n");
      out.write("						<div id=\"r1\">\r\n");
      out.write("							<b> <img src=\"img/r1.jpg\" width=\"80\" height=\"80\"> <a\r\n");
      out.write("								href=\"#\"> Cách khắc phục lỗi “Tin nhắn không gửi được” trên\r\n");
      out.write("									điện thoại Android</a>\r\n");
      out.write("						</div>\r\n");
      out.write("						<hr>\r\n");
      out.write("						<div id=\"r1\">\r\n");
      out.write("							<img src=\"img/r2.png\" width=\"80\" height=\"80\"> <a\r\n");
      out.write("								href=\"#\"> Cách sửa lỗi website hiện tiếng Pháp trên Chrome,\r\n");
      out.write("								Firefox </a>\r\n");
      out.write("						</div>\r\n");
      out.write("						<hr>\r\n");
      out.write("						<div id=\"r1\">\r\n");
      out.write("							<img src=\"img/r3.jpg\" width=\"80\" height=\"80\"> <a\r\n");
      out.write("								href=\"#\"> Mẹo khởi động thiết bị Android khi bị hỏng nút\r\n");
      out.write("								nguồn</a>\r\n");
      out.write("						</div>\r\n");
      out.write("						<hr>\r\n");
      out.write("						<div id=\"r1\">\r\n");
      out.write("							<img src=\"img/r4.jpg\" width=\"80\" height=\"80\"> <a\r\n");
      out.write("								href=\"#\"> Chiêm ngưỡng 19 bức ảnh tuy thật mà còn vi diệu\r\n");
      out.write("								hơn cả Photoshop</a>\r\n");
      out.write("						</div>\r\n");
      out.write("						<hr>\r\n");
      out.write("						<div id=\"r1\">\r\n");
      out.write("							<img src=\"img/r5.jpg\" width=\"80\" height=\"80\"> <a\r\n");
      out.write("								href=\"#\"> Chiêm ngưỡng 19 bức ảnh tuy thật mà còn vi diệu\r\n");
      out.write("								hơn cả Photoshop</a>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<hr> <br> <img src=\"img/vivo.jpg\" width=\"300\"\r\n");
      out.write("						height=\"400\"> <img src=\"ima/qc5.jpg\" class=\"qc4\"\r\n");
      out.write("						width=\"300\" height=\"300\"> <br>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<br> <img src=\"img/bnp.png\" width=\"100%\" height=\"75\">\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<footer class=\"text-center text-lg-start bg-body-tertiary text-muted\">\r\n");
      out.write("		<section\r\n");
      out.write("			class=\"d-flex justify-content-center justify-content-lg-between p-4 border-bottom\">\r\n");
      out.write("			<div class=\"me-5 d-none d-lg-block\">\r\n");
      out.write("				<span>Kết nối với chúng tôi:</span>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div>\r\n");
      out.write("				<a href=\"https://www.facebook.com/chinh.tong.587\"\r\n");
      out.write("					class=\"me-4 text-reset\"> <i class=\"fab fa-facebook-f\"></i>\r\n");
      out.write("				</a> <a href=\"\" class=\"me-4 text-reset\"> <i class=\"fab fa-twitter\"></i>\r\n");
      out.write("				</a> <a href=\"\" class=\"me-4 text-reset\"> <i class=\"fab fa-google\"></i>\r\n");
      out.write("				</a> <a href=\"\" class=\"me-4 text-reset\"> <i class=\"fab fa-instagram\"></i>\r\n");
      out.write("				</a> <a href=\"\" class=\"me-4 text-reset\"> <i class=\"fab fa-linkedin\"></i>\r\n");
      out.write("				</a> <a href=\"\" class=\"me-4 text-reset\"> <i class=\"fab fa-github\"></i>\r\n");
      out.write("				</a>\r\n");
      out.write("			</div>\r\n");
      out.write("		</section>\r\n");
      out.write("		<section class=\"\">\r\n");
      out.write("			<div class=\"container text-center text-md-start mt-5\">\r\n");
      out.write("				<div class=\"row mt-3\">\r\n");
      out.write("					<div class=\"col-md-2 col-lg-4 col-xl-3 mx-auto mb-4\">\r\n");
      out.write("						<h6 class=\"text-uppercase fw-bold mb-4\">\r\n");
      out.write("							<i class=\"fas fa-gem me-3\"></i>Laptop-Store.vn\r\n");
      out.write("						</h6>\r\n");
      out.write("						<p>Uy tín tạo lên thương hiệu</p>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-md-2 col-lg-2 col-xl-2 mx-auto mb-4\">\r\n");
      out.write("						<!-- Links -->\r\n");
      out.write("						<h6 class=\"text-uppercase fw-bold mb-4\">Menu</h6>\r\n");
      out.write("						<p>\r\n");
      out.write("							<a href=\"index.jsp\" class=\"text-reset\">Trang chủ</a>\r\n");
      out.write("						</p>\r\n");
      out.write("						<p>\r\n");
      out.write("							<a href=\"trangGioiThieu.jsp\" class=\"text-reset\">Giới thiệu</a>\r\n");
      out.write("						</p>\r\n");
      out.write("						<p>\r\n");
      out.write("							<a href=\"trangTinTuc.jsp\" class=\"text-reset\">Tin tức</a>\r\n");
      out.write("						</p>\r\n");
      out.write("						<p>\r\n");
      out.write("							<a href=\"trangKhuyenMai.jsp\" class=\"text-reset\">Khuyến mãi</a>\r\n");
      out.write("						</p>\r\n");
      out.write("						<p>\r\n");
      out.write("							<a href=\"trangLienHe.jsp\" class=\"text-reset\">Liên hệ</a>\r\n");
      out.write("						</p>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-md-3 col-lg-2 col-xl-2 mx-auto mb-4\">\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<h6 class=\"text-uppercase fw-bold mb-4\">Sản phẩm laptop</h6>\r\n");
      out.write("							<div class=\"col-md-2\">\r\n");
      out.write("								<p>\r\n");
      out.write("									<a href=\"lapAcer.jsp\" class=\"text-reset\">Acer</a>\r\n");
      out.write("								</p>\r\n");
      out.write("								<p>\r\n");
      out.write("									<a href=\"lapDell.jsp\" class=\"text-reset\">Dell</a>\r\n");
      out.write("								</p>\r\n");
      out.write("								<p>\r\n");
      out.write("									<a href=\"lapLenovo.jsp\" class=\"text-reset\">Lenovo</a>\r\n");
      out.write("								</p>\r\n");
      out.write("								<p>\r\n");
      out.write("									<a href=\"lapAsus.jsp\" class=\"text-reset\">Asus</a>\r\n");
      out.write("								</p>\r\n");
      out.write("								<p>\r\n");
      out.write("									<a href=\"macBook.jsp\" class=\"text-reset\">Apple</a>\r\n");
      out.write("								</p>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"col-md-2 mx-5\">\r\n");
      out.write("								<p>\r\n");
      out.write("									<a href=\"lapHP.jsp\" class=\"text-reset\">Hp</a>\r\n");
      out.write("								</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-md-2 col-lg-2 col-xl-2 mx-auto mb-4\">\r\n");
      out.write("						<!-- Links -->\r\n");
      out.write("						<h6 class=\"text-uppercase fw-bold mb-4\">Sản phẩm khác</h6>\r\n");
      out.write("						<p>\r\n");
      out.write("							<a href=\"sanphamkhac.jsp\" class=\"text-reset\">Các sản phẩm khác</a>\r\n");
      out.write("						</p>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-md-2 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4\">\r\n");
      out.write("						<h6 class=\"text-uppercase fw-bold mb-4\">Liên hệ</h6>\r\n");
      out.write("						<p>\r\n");
      out.write("							<i class=\"fas fa-home me-3\"></i> HUTU, 2030 ASRT, VN\r\n");
      out.write("						</p>\r\n");
      out.write("						<p>\r\n");
      out.write("							<i class=\"fas fa-envelope me-3\"></i> TONGCHINH@gmail.com\r\n");
      out.write("						</p>\r\n");
      out.write("						<p>\r\n");
      out.write("							<i class=\"fas fa-phone me-3\"></i> + 01 234 567 89\r\n");
      out.write("						</p>\r\n");
      out.write("						<p>\r\n");
      out.write("							<i class=\"fas fa-print me-3\"></i> + 01 234 567 89\r\n");
      out.write("						</p>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</section>\r\n");
      out.write("		<div class=\"text-center p-4\"\r\n");
      out.write("			style=\"background-color: rgba(0, 0, 0, 0.05);\">\r\n");
      out.write("			© 2024 Computer Caro: <a class=\"text-reset fw-bold\"\r\n");
      out.write("				href=\"https://docs.google.com/document/d/1mygQ8ZYOb9cEwQTx0xBLZqgMztIo64HYiAF25eEf7bY/edit\">ComputerCaro.com</a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
