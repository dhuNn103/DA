/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-05-21 06:27:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.CPT.Entities.SanPham;
import com.CPT.DB.DBConnect;
import com.CPT.Dao.SanPhamDaoImpl;

public final class SanPhamEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/all/css.jsp", Long.valueOf(1716046732835L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1710684298696L));
    _jspx_dependants.put("jar:file:/D:/DA/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/CPT/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/admin/template/header.jsp", Long.valueOf(1716135961824L));
    _jspx_dependants.put("/admin/template/sidebar.jsp", Long.valueOf(1716190981770L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(3);
    _jspx_imports_classes.add("com.CPT.Dao.SanPhamDaoImpl");
    _jspx_imports_classes.add("com.CPT.DB.DBConnect");
    _jspx_imports_classes.add("com.CPT.Entities.SanPham");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
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
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<header class=\"py-3 mb-3 border-bottom sticky-top px-5 bg-success\">\r\n");
      out.write("		<div\r\n");
      out.write("			class=\"container-fluid d-grid gap-3 align-items-center text-white\"\r\n");
      out.write("			style=\"grid-template-columns: 1fr 2fr;\">\r\n");
      out.write("			<h5 class=\"ps-5 pt-1\">Trang quản trị</h5>\r\n");
      out.write("			<div class=\"d-flex align-items justify-content-end\">\r\n");
      out.write("				");

				String loggedInUser = (String) session.getAttribute("emls");
				
      out.write("\r\n");
      out.write("				Hi,\r\n");
      out.write("				");
      out.print(session.getAttribute("emls"));
      out.write(" \r\n");
      out.write("				<div class=\"flex-shrink-0 dropdown\">\r\n");
      out.write("					<a href=\"#\"\r\n");
      out.write("						class=\"d-block link-dark text-decoration-none dropdown-toggle text-white\"\r\n");
      out.write("						id=\"dropdownUser2\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("						<i class=\"fa-solid fa-user ps-3\"></i>\r\n");
      out.write("					</a>\r\n");
      out.write("					<form action=\"../LogoutServlet\" method=\"post\">\r\n");
      out.write("						<ul class=\"dropdown-menu text-small shadow\"\r\n");
      out.write("							aria-labelledby=\"dropdownUser2\">\r\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"ThongTinCaNhan.jsp\">Thông tin tài\r\n");
      out.write("									khoản</a></li>\r\n");
      out.write("							<li><a class=\"dropdown-item\">\r\n");
      out.write("									<button type=\"submit\" class=\"px-5\">Đăng xuất</button>\r\n");
      out.write("							</a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</header>\r\n");
      out.write("\r\n");
      out.write("	<!-- 	<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark sticky-top\"> -->\r\n");
      out.write("	<!--         <div class=\"container\"> -->\r\n");
      out.write("	<!--             <a class=\"navbar-brand\" href=\"#\">Trang quản trị</a> -->\r\n");
      out.write("	<!--             <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"> -->\r\n");
      out.write("	<!--                 <span class=\"navbar-toggler-icon\"></span> -->\r\n");
      out.write("	<!--             </button> -->\r\n");
      out.write("	<!--             <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarNavDropdown\"> -->\r\n");
      out.write("	<!--                 <ul class=\"navbar-nav\"> -->\r\n");
      out.write("	<!--                     <li class=\"nav-item dropdown\"> -->\r\n");
      out.write("	<!--                         <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> -->\r\n");
      out.write("	<!--                             Thông tin tài khoản -->\r\n");
      out.write("	<!--                         </a> -->\r\n");
      out.write("	<!--                         <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\"> -->\r\n");
      out.write("	<!--                             <li><a class=\"dropdown-item\" href=\"#\">Tùy chọn 1</a></li> -->\r\n");
      out.write("	<!--                             <li><a class=\"dropdown-item\" href=\"#\">Tùy chọn 2</a></li> -->\r\n");
      out.write("	<!--                             <li><hr class=\"dropdown-divider\"></li> -->\r\n");
      out.write("	<!--                             <li><a class=\"dropdown-item\" href=\"#\">Đổi mật khẩu</a></li> -->\r\n");
      out.write("	<!--                         </ul> -->\r\n");
      out.write("	<!--                     </li> -->\r\n");
      out.write("	<!--                     <li class=\"nav-item\"> -->\r\n");
      out.write("	<!--                         <a class=\"nav-link\" href=\"#\">Đăng xuất</a> -->\r\n");
      out.write("	<!--                     </li> -->\r\n");
      out.write("	<!--                 </ul> -->\r\n");
      out.write("	<!--             </div> -->\r\n");
      out.write("	<!--         </div> -->\r\n");
      out.write("	<!--     </nav> -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
      out.write('	');
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
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".nav-pills .nav-link:hover {\r\n");
      out.write("	background-color: #f7723e;\r\n");
      out.write("}\r\n");
      out.write(".nav-pills .nav-link:active {\r\n");
      out.write("	background-color: red;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"flex-column flex-shrink-0 p-3 text-white bg-success\"\r\n");
      out.write("		style=\"position: fixed; top: 0; left: 0; height: 100vh; width: auto\">\r\n");
      out.write("		<a href=\"/\"\r\n");
      out.write("			class=\"d-flex align-items-center mb-3 mb-md-0 me-md-auto text-white text-decoration-none\">\r\n");
      out.write("			<svg class=\"bi me-2\" width=\"40\" height=\"32\">\r\n");
      out.write("            <use xlink:href=\"#bootstrap\"></use>\r\n");
      out.write("        </svg> <span class=\"fs-4\">Sidebar</span>\r\n");
      out.write("		</a>\r\n");
      out.write("		<hr>\r\n");
      out.write("		<ul class=\"nav nav-pills flex-column mb-auto\">\r\n");
      out.write("			<li class=\"nav-item\"><a id=\"homeLink\" href=\"homeAdmin.jsp\"\r\n");
      out.write("				class=\"nav-link text-white\" aria-current=\"page\"> <i\r\n");
      out.write("					class=\"fa-solid fa-house\"> </i> Trang chủ\r\n");
      out.write("			</a></li>\r\n");
      out.write("			<li><a id=\"userLink\" href=\"quanlyTaiKhoan.jsp\"\r\n");
      out.write("				class=\"nav-link text-white\"> <i class=\"fa-solid fa-users\"></i>\r\n");
      out.write("					Quản lý người dùng\r\n");
      out.write("			</a></li>\r\n");
      out.write("			<li><a id=\"productLink\" href=\"quanlySanPham.jsp\"\r\n");
      out.write("				class=\"nav-link text-white\"> <i\r\n");
      out.write("					class=\"fa-brands fa-product-hunt\"></i> Quản lý sản phẩm\r\n");
      out.write("			</a></li>\r\n");
      out.write("			<li><a id=\"categoryLink\" href=\"quanlyDanhMuc.jsp\"\r\n");
      out.write("				class=\"nav-link text-white\"> <i class=\"fa-solid fa-bars\"></i>\r\n");
      out.write("					Quản lý danh mục\r\n");
      out.write("			</a></li>\r\n");
      out.write("			<li><a id=\"newsLink\" href=\"quanlyTinTuc.jsp\"\r\n");
      out.write("				class=\"nav-link text-white\"> <i class=\"fa-solid fa-newspaper\"></i>\r\n");
      out.write("					Quản lý tin tức\r\n");
      out.write("			</a></li>\r\n");
      out.write("			<li><a id=\"cartLink\" href=\"quanlyGioHang.jsp\"\r\n");
      out.write("				class=\"nav-link text-white\"> <i\r\n");
      out.write("					class=\"fa-solid fa-cart-shopping\"></i> Quản lý giỏ hàng\r\n");
      out.write("			</a></li>\r\n");
      out.write("			<li><a id=\"statsLink\" href=\"quanlyThongKe.jsp\"\r\n");
      out.write("				class=\"nav-link text-white\"> <i class=\"fa-solid fa-chart-simple\"></i>\r\n");
      out.write("					Quản lý thống kê\r\n");
      out.write("			</a></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("		\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("	<main class=\"col-md-9 ms-sm-auto col-lg-10 px-md-4\">\r\n");
      out.write("		<h4>Chinh sửa thông tin sản phẩm</h4>\r\n");
      out.write("		<div class=\"pt-1\" style=\"border: 1px gray solid; border-radius: 5px;\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			");

			int id = Integer.parseInt(request.getParameter("id"));
			SanPhamDaoImpl dao = new SanPhamDaoImpl(DBConnect.getConnect());
			SanPham sp = dao.getSanPhamById(id);
			
      out.write("\r\n");
      out.write("			<form action=\"../Edtsanpham\" method=\"post\"\r\n");
      out.write("				enctype=\"multipart/form-data\">\r\n");
      out.write("				<div class=\"row d-flex px-2\">\r\n");
      out.write("					<div class=\"col-md-6 \">\r\n");
      out.write("						<input type=\"hidden\" name=\"id\" value=\"");
      out.print(sp.getId());
      out.write("\">\r\n");
      out.write("						<div class=\"mb-3\">\r\n");
      out.write("							<label class=\"form-label\">ID danh mục </label> <input type=\"text\"\r\n");
      out.write("								class=\"form-control\" name=\"idDM\" id=\"exampleInputName\"\r\n");
      out.write("								value=\"");
      out.print(sp.getIddanhmuc());
      out.write("\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"mb-3\">\r\n");
      out.write("							<label class=\"form-label\">Tên sản phẩm</label> <input type=\"text\"\r\n");
      out.write("								class=\"form-control\" name=\"names\" id=\"exampleInputPassword1\"\r\n");
      out.write("								value=\"");
      out.print(sp.getTensanpham());
      out.write("\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"mb-3\">\r\n");
      out.write("							<label class=\"form-label\">Giá cũ</label> <input type=\"number\"\r\n");
      out.write("								class=\"form-control\" name=\"giacu\" id=\"exampleInputPassword1\"\r\n");
      out.write("								value=\"");
      out.print(sp.getGiacu());
      out.write("\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"mb-3\">\r\n");
      out.write("							<label class=\"form-label\">Giá mới</label> <input type=\"number\"\r\n");
      out.write("								class=\"form-control\" name=\"giamoi\" id=\"exampleInputPassword1\"\r\n");
      out.write("								value=\"");
      out.print(sp.getGiamoi());
      out.write("\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"mb-3\">\r\n");
      out.write("							<label class=\"form-label\">Mô tả</label> <input type=\"text\"\r\n");
      out.write("								class=\"form-control\" name=\"mota\" id=\"exampleInputPassword1\"\r\n");
      out.write("								value=\"");
      out.print(sp.getMota());
      out.write("\">\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-md-6\">\r\n");
      out.write("\r\n");
      out.write("						<div class=\"mb-3\">\r\n");
      out.write("							<label class=\"form-label\">Ngày tạo</label> <input type=\"text\"\r\n");
      out.write("								class=\"form-control\" name=\"ngaytao\" id=\"exampleInputPassword1\"\r\n");
      out.write("								value=\"");
      out.print(sp.getNgaytao());
      out.write("\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"mb-3\">\r\n");
      out.write("							<label class=\"form-label\">Ngày sửa</label> <input type=\"text\"\r\n");
      out.write("								class=\"form-control\" name=\"ngaysua\" id=\"exampleInputPassword1\"\r\n");
      out.write("								value=\"");
      out.print(sp.getNgaysua());
      out.write("\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"mb-3\">\r\n");
      out.write("							<label class=\"form-label\">Hình ảnh</label> <input type=\"file\"\r\n");
      out.write("								class=\"form-control\" name=\"anh\" id=\"exampleInputPassword1\"\r\n");
      out.write("								value=\"");
      out.print(sp.getHinhanh());
      out.write("\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"d-flex justify-content-end\">\r\n");
      out.write("							<a href=\"quanlySanPham.jsp\" class=\"btn btn-secondary p-2 m-2 \">Quay\r\n");
      out.write("								lại</a>\r\n");
      out.write("							<button type=\"submit\" class=\"btn btn-danger p-2 m-2\">Lưu</button>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</main>\r\n");
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
