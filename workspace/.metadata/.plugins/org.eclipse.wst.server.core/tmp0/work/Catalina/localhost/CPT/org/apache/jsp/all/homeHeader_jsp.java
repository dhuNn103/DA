/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-05-13 17:52:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.all;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homeHeader_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1710684298696L));
    _jspx_dependants.put("jar:file:/D:/DA/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/CPT/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".ctr-cl {\r\n");
      out.write("	background-color: #76ccf5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nv-cl {\r\n");
      out.write("	background-color: #f7723e;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tl {\r\n");
      out.write("	color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sea:hover {\r\n");
      out.write("	background-color: #f7723e;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<section class=\"header\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"row px-5\">\r\n");
      out.write("				<div class=\"col-md-2\" id=\"logo\">\r\n");
      out.write("					<a href=\"index.jsp\"> <img src=\"img/Logo1.png\"\r\n");
      out.write("						style=\"width: 120px; height: 90px\">\r\n");
      out.write("					</a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-7\">\r\n");
      out.write("					<div class=\"row py-3\">\r\n");
      out.write("						<div class=\"col-md-4\">\r\n");
      out.write("							<div class=\"row text-danger\">\r\n");
      out.write("								<div class=\"col-2 fs-3 p-1\">\r\n");
      out.write("									<i class=\"fa-solid fa-truck\"></i>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-10\">\r\n");
      out.write("									SHIP CODE\r\n");
      out.write("									<p class=\"text-dark\">Phạm vị toàn quốc</p>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col-md-5\">\r\n");
      out.write("							<div class=\"row text-danger\">\r\n");
      out.write("								<div class=\"col-2 fs-3 p-1\">\r\n");
      out.write("									<i class=\"fa-solid fa-phone-volume\"></i>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-10\">\r\n");
      out.write("									HOTLINE: 0123456789\r\n");
      out.write("									<p class=\"text-dark\">Tư vẫn miễn phí 24/24</p>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col-md-3\">\r\n");
      out.write("							<div class=\"row text-danger\">\r\n");
      out.write("								<div class=\"col-2 fs-3 p-1\">\r\n");
      out.write("									<i class=\"fa-solid fa-hand-holding-dollar\"></i>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-10\">\r\n");
      out.write("									THANH TOÁN\r\n");
      out.write("									<p class=\"text-dark\">Khi nhận hàng</p>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-3\">\r\n");
      out.write("					<div class=\"row py-3\">\r\n");
      out.write("						<div class=\"col-md-8\">\r\n");
      out.write("							<div class=\"my-2\">\r\n");
      out.write("								");

								String loggedInUser = (String) session.getAttribute("emls");
								
      out.write("\r\n");
      out.write("								");

								if (loggedInUser == null) {
								
      out.write("\r\n");
      out.write("								<a href=\"login.jsp\">\r\n");
      out.write("									<button class=\"btn btn-primary\">Đăng\r\n");
      out.write("										nhập/đăng ký</button>\r\n");
      out.write("								</a>\r\n");
      out.write("								");

								} else {
								
      out.write("\r\n");
      out.write("								<p><form action=\"LogoutServlet\" method=\"post\">\r\n");
      out.write("										<input type=\"submit\" value=\"Đăng xuất\" class=\"bg-primary text-white ms-4\">\r\n");
      out.write("									</form>\r\n");
      out.write("									Hi, ");
      out.print(session.getAttribute("emls"));
      out.write("	\r\n");
      out.write("								</p>\r\n");
      out.write("								");

								}
								
      out.write("\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col-md-2\">\r\n");
      out.write("							<div class=\"row\">\r\n");
      out.write("								<div class=\"fs-3 p-1\">\r\n");
      out.write("									<a href=\"#\"> <i class=\"fa-solid fa-cart-shopping text-dark\"></i>\r\n");
      out.write("									</a>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col-md-2\">\r\n");
      out.write("							<div class=\"row\">\r\n");
      out.write("								<div class=\"fs-3 p-1\">\r\n");
      out.write("									<a href=\"#\"> <i class=\"fa-solid fa-bell text-dark\"></i>\r\n");
      out.write("									</a>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"container-fluid ctr-cl\">\r\n");
      out.write("			<div class=\"container ctr-cl\">\r\n");
      out.write("				<div class=\"row px-5 fs-5\">\r\n");
      out.write("					<div class=\"col-md-3\">\r\n");
      out.write("						<nav class=\"navbar navbar-expand-sm nv-cl\">\r\n");
      out.write("							<ul class=\"navbar-nav \">\r\n");
      out.write("								<li class=\"nav-item dropdown px-1\"><a\r\n");
      out.write("									class=\"nav-link dropdown-toggle tl\"\r\n");
      out.write("									data-bs-auto-close=\"outside\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("									data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> <i\r\n");
      out.write("										class=\"fa-solid fa-bars\"></i> DANH MỤC SẢN PHẨM\r\n");
      out.write("								</a>\r\n");
      out.write("									<ul class=\"dropdown-menu mt-3 fs-5\">\r\n");
      out.write("										<li class=\"dropend\">\r\n");
      out.write("											<!-- 										<a --> <!-- 											class=\"dropdown-item dropdown-toggle\" -->\r\n");
      out.write("											<!-- 											data-bs-toggle=\"dropdown\" href=\"#\">Laptop</a> 											<ul class=\"dropdown-menu  mt-4 fs-5\"> -->\r\n");
      out.write("											<!-- 												<li><a class=\"dropdown-item \" href=\"lapacer.jsp\">Thương -->\r\n");
      out.write("											<!-- 														hiệu Acer</a></li> --> <!-- 												<li><a class=\"dropdown-item \" href=\"lapdell.jsp\">Thương -->\r\n");
      out.write("											<!-- 														hiệu Dell</a></li> --> <!-- 												<li><a class=\"dropdown-item \" href=\"laplenovo.jsp\">Thương -->\r\n");
      out.write("											<!-- 														hiệu Lenovo</a></li> --> <!-- 												<li><a class=\"dropdown-item \" href=\"lapasus.jsp\">Thương -->\r\n");
      out.write("											<!-- 														hiệu Asus</a></li> --> <!-- 												<li><a class=\"dropdown-item \" href=\"lapapple.jsp\">Thương -->\r\n");
      out.write("											<!-- 														hiệu Apple</a></li> --> <!-- 												<li><a class=\"dropdown-item \" href=\"laphp.jsp\">Thương -->\r\n");
      out.write("											<!-- 														hiệu Hp</a></li> --> <!-- 											</ul>-->\r\n");
      out.write("										</li>\r\n");
      out.write("										<li><a class=\"dropdown-item \" href=\"linkkien.jsp\">Laptop\r\n");
      out.write("												Acer</a></li>\r\n");
      out.write("										<li><a class=\"dropdown-item \" href=\"linkkien.jsp\">Laptop\r\n");
      out.write("												Dell</a></li>\r\n");
      out.write("										<li><a class=\"dropdown-item \" href=\"linkkien.jsp\">Laptop\r\n");
      out.write("												Lenovo</a></li>\r\n");
      out.write("										<li><a class=\"dropdown-item \" href=\"linkkien.jsp\">Laptop\r\n");
      out.write("												Asus</a></li>\r\n");
      out.write("										<li><a class=\"dropdown-item \" href=\"linkkien.jsp\">Laptop\r\n");
      out.write("												HP</a></li>\r\n");
      out.write("										<li><a class=\"dropdown-item \" href=\"linkkien.jsp\">Laptop\r\n");
      out.write("												Lenovo</a></li>\r\n");
      out.write("										<li><a class=\"dropdown-item \" href=\"linkkien.jsp\">Các\r\n");
      out.write("												thiết bị sản phẩm khác</a></li>\r\n");
      out.write("									</ul></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</nav>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-md-6 \">\r\n");
      out.write("						<nav class=\"navbar navbar-expand-sm\">\r\n");
      out.write("							<ul class=\"navbar-nav mx-2 \">\r\n");
      out.write("								<li class=\"nav-item mx-2\"><a class=\"nav-link tl\"\r\n");
      out.write("									href=\"index.jsp\">Trang chủ</i></a></li>\r\n");
      out.write("								<li class=\"nav-item mx-2\"><a class=\"nav-link tl\"\r\n");
      out.write("									href=\"trangGioiThieu.jsp\">Giới thiệu</a></li>\r\n");
      out.write("								<li class=\"nav-item mx-2\"><a class=\"nav-link tl\"\r\n");
      out.write("									href=\"trangTinTuc.jsp\">Tin tức</a></li>\r\n");
      out.write("								<li class=\"nav-item mx-2\"><a class=\"nav-link tl\"\r\n");
      out.write("									href=\"trangKhuyenMai.jsp\">Khuyến mãi</a></li>\r\n");
      out.write("								<li class=\"nav-item mx-2\"><a class=\"nav-link tl\"\r\n");
      out.write("									href=\"trangLienHe.jsp\">Liên hệ</a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</nav>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-md-3 pt-1\">\r\n");
      out.write("						<nav class=\"navbar navbar-expand-sm justify-content-end\">\r\n");
      out.write("							<ul class=\"navbar-nav\">\r\n");
      out.write("								<form class=\"d-flex\">\r\n");
      out.write("									<input class=\"form-control me-2\" type=\"search\"\r\n");
      out.write("										placeholder=\"Search...\" aria-label=\"Search\">\r\n");
      out.write("									<button class=\"btn btn-light sea\" type=\"submit\">\r\n");
      out.write("										<i class=\"fa-solid fa-magnifying-glass \"></i>\r\n");
      out.write("									</button>\r\n");
      out.write("								</form>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</nav>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
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
