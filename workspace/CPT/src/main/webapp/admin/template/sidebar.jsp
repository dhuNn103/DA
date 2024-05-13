<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="/all/css.jsp"%>
<title>Insert title here</title>
<style type="text/css">
</style>
</head>
<body>

	<!-- 	<nav id="sidebarMenu" -->
	<!-- 		class="col-md-3 col-lg-2 d-md-block sidebar collapse"> -->
	<!-- 		<div class="fixed-top pt-5 "> -->
	<!-- 			<ul class="nav flex-column px-2"> -->
	<!-- 				<li class="nav-item fs-5"> -->
	<!-- 					<a class="nav-link active" aria-current="page" href="homeAdmin.jsp"> -->
	<!-- 					<i class="fa-solid fa-house"></i> Trang chủ </a> -->
	<!-- 				</li> -->
	<!-- 				<li class="nav-item fs-5"> -->
	<!-- 					<a class="nav-link active" aria-current="page" href="quanlyTaiKhoan.jsp"> -->
	<!-- 					<i class="fa-solid fa-users"></i> Quản lý tài khoản </a> -->
	<!-- 				</li> -->
	<!-- 				<li class="nav-item fs-5"> -->
	<!-- 					<a class="nav-link" href="quanlySanPham.jsp"> -->
	<!-- 					<i class="fa-brands fa-product-hunt"></i> Quản lý sản phẩm </a> -->
	<!-- 				</li> -->
	<!-- 				<li class="nav-item fs-5"> -->
	<!-- 					<a class="nav-link" href="quanlyTinTuc.jsp">  -->
	<!-- 					<i class="fa-solid fa-newspaper"></i> Quản lý tin tức</a> -->
	<!-- 				</li> -->
	<!-- 				<li class="nav-item fs-5"> -->
	<!-- 					<a class="nav-link" href="quanlyDanhMuc.jsp">  -->
	<!-- 					<i class="fa-solid fa-bars"></i> Quản lý danh mục </a> -->
	<!-- 				</li> -->
	<!-- 				<li class="nav-item fs-5"> -->
	<!-- 					<a class="nav-link" href="quanlyGioHang.jsp">  -->
	<!-- 					<i class="fa-solid fa-cart-shopping"></i> Quản lý giỏ hàng</a> -->
	<!-- 				</li> -->
	<!-- 				<li class="nav-item fs-5"> -->
	<!-- 					<a class="nav-link" href="quanlyThongKe.jsp"> -->
	<!-- 					<i class="fa-solid fa-chart-simple"></i> Quản lý thống kê </a> -->
	<!-- 				</li> -->
	<!-- 			</ul> -->
	<!-- 		</div> -->
	<!-- 	</nav> -->

	 
	<div class=" flex-column flex-shrink-0 p-3 text-white bg-success"
		style="position: fixed; top: 0; left: 0; height: 100vh; width:auto">
		<a href="/"
			class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-white text-decoration-none">
			<svg class="bi me-2" width="40" height="32">
						<use xlink:href="#bootstrap"></use></svg> <span class="fs-4">Sidebar</span>
		</a>
		<hr>
		<ul class="nav nav-pills flex-column mb-auto">
			<li class="nav-item"><a href="homeAdmin.jsp" class="nav-link active"
				aria-current="page"><i class="fa-solid fa-house"> </i> Trang chủ
			</a></li>
			<li><a href="quanlyTaiKhoan.jsp" class="nav-link text-white"><i class="fa-solid fa-users"></i>  Quản lý người dùng
			</a></li>
			<li><a href="quanlySanPham.jsp" class="nav-link text-white"><i class="fa-brands fa-product-hunt"></i>  Quản lý sản phẩm
			</a></li>
			<li><a href="quanlyDanhMuc.jsp" class="nav-link text-white"> <i class="fa-solid fa-bars"></i> Quản lý danh mục
			</a></li>
			<li><a href="quanlyTinTuc.jsp" class="nav-link text-white"> <i class="fa-solid fa-newspaper"></i> Quản lý tin tức
			</a></li>
			<li><a href="quanlyGioHang.jsp" class="nav-link text-white"> <i class="fa-solid fa-cart-shopping"></i>  Quản lý giỏ hàng
			</a></li>
			<li><a href="quanlyThongKe.jsp" class="nav-link text-white"> <i class="fa-solid fa-chart-simple"></i> Quản lý thống kê
			</a></li>
		</ul>
	</div>
</body>
</html>