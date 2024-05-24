<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.ctr-cl {
	background-color: #76ccf5;
}

.nv-cl {
	background-color: #f7723e;
}

.tl {
	color: white;
}

.sea:hover {
	background-color: #f7723e;
}

.active {
	background-color: #f7723e;
}
</style>
</head>
<body>
	<section class="header">
		<div class="container">
			<div class="row px-5">
				<div class="col-md-2" id="logo">
					<a href="index.jsp"> <img src="img/Logo1.png"
						style="width: 120px; height: 90px">
					</a>
				</div>
				<div class="col-md-7">
					<div class="row py-3">
						<div class="col-md-4">
							<div class="row text-danger">
								<div class="col-2 fs-3 p-1">
									<i class="fa-solid fa-truck"></i>
								</div>
								<div class="col-10">
									SHIP CODE
									<p class="text-dark">Phạm vị toàn quốc</p>
								</div>
							</div>
						</div>
						<div class="col-md-5">
							<div class="row text-danger">
								<div class="col-2 fs-3 p-1">
									<i class="fa-solid fa-phone-volume"></i>
								</div>
								<div class="col-10">
									HOTLINE: 0123456789
									<p class="text-dark">Tư vẫn miễn phí 24/24</p>
								</div>
							</div>
						</div>
						<div class="col-md-3">
							<div class="row text-danger">
								<div class="col-2 fs-3 p-1">
									<i class="fa-solid fa-hand-holding-dollar"></i>
								</div>
								<div class="col-10">
									THANH TOÁN
									<p class="text-dark">Khi nhận hàng</p>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="row py-3">
						<div class="col-md-8">
							<div class="my-2">
								<%
								String loggedInUser = (String) session.getAttribute("emls");
								%>
								<%
								if (loggedInUser == null) {
								%>
								<a href="login.jsp">
									<button class="btn btn-primary">Đăng nhập/đăng ký</button>
								</a>
								<%
								} else {
								%>
								<p>
								<form action="LogoutServlet" method="post">
									<button type="submit" class="btn btn-primary text-white ms-4">Đăng
										xuất</button>
								</form>
								Hi,
								<%=session.getAttribute("emls")%>								
								<%
								}
								%>
							</div>
						</div>
						<div class="col-md-2">
							<div class="row">
								<div class="fs-3 p-1">
									<a href="giohang"> <i
										class="fa-solid fa-cart-shopping text-dark"></i>
									</a>
								</div>
							</div>
						</div>
						<div class="col-md-2">
							<div class="row">
								<div class="fs-3 p-1">
									<a href="#"> <i class="fa-solid fa-bell text-dark"></i>
									</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="container-fluid ctr-cl">
			<div class="container ctr-cl">
				<div class="row px-5 fs-5">
					<div class="col-md-3">
						<nav class="navbar navbar-expand-sm nv-cl">
							<ul class="navbar-nav ">
								<li class="nav-item dropdown px-1"><a
									class="nav-link dropdown-toggle tl"
									data-bs-auto-close="outside" href="#" id="navbarDropdown"
									data-bs-toggle="dropdown" aria-expanded="false"> <i
										class="fa-solid fa-bars"></i> DANH MỤC SẢN PHẨM
								</a>
									<ul class="dropdown-menu mt-3 fs-5">
										<li class="dropend">
											<!-- 										<a --> <!-- 											class="dropdown-item dropdown-toggle" -->
											<!-- 											data-bs-toggle="dropdown" href="#">Laptop</a> 											<ul class="dropdown-menu  mt-4 fs-5"> -->
											<!-- 												<li><a class="dropdown-item " href="lapacer.jsp">Thương -->
											<!-- 														hiệu Acer</a></li> --> <!-- 												<li><a class="dropdown-item " href="lapdell.jsp">Thương -->
											<!-- 														hiệu Dell</a></li> --> <!-- 												<li><a class="dropdown-item " href="laplenovo.jsp">Thương -->
											<!-- 														hiệu Lenovo</a></li> --> <!-- 												<li><a class="dropdown-item " href="lapasus.jsp">Thương -->
											<!-- 														hiệu Asus</a></li> --> <!-- 												<li><a class="dropdown-item " href="lapapple.jsp">Thương -->
											<!-- 														hiệu Apple</a></li> --> <!-- 												<li><a class="dropdown-item " href="laphp.jsp">Thương -->
											<!-- 														hiệu Hp</a></li> --> <!-- 											</ul>-->
										</li>
										<li><a class="dropdown-item " href="lapAcer.jsp">Laptop
												Acer</a></li>
										<li><a class="dropdown-item " href="lapDell.jsp">Laptop
												Dell</a></li>
										<li><a class="dropdown-item " href="lapLenovo.jsp">Laptop
												Lenovo</a></li>
										<li><a class="dropdown-item " href="lapAsus.jsp">Laptop
												Asus</a></li>
										<li><a class="dropdown-item " href="lapHP.jsp">Laptop
												HP</a></li>
										<li><a class="dropdown-item " href="macBook.jsp">MacBook
										</a></li>
										<li><a class="dropdown-item " href="sanphamkhac.jsp">Các
												thiết bị sản phẩm khác</a></li>
									</ul></li>
							</ul>
						</nav>
					</div>
					<div class="col-md-6 ">
						<nav class="navbar navbar-expand-sm">
							<ul class="navbar-nav mx-2 ">
								<li class="nav-item mx-2 "><a class="nav-link tl"
									href="index.jsp">Trang chủ</a></li>
								<li class="nav-item mx-2"><a class="nav-link tl"
									href="trangGioiThieu.jsp">Giới thiệu</a></li>
								<li class="nav-item mx-2"><a class="nav-link tl"
									href="trangTinTuc.jsp">Tin tức</a></li>
								<li class="nav-item mx-2"><a class="nav-link tl"
									href="trangKhuyenMai.jsp">Khuyến mãi</a></li>
								<li class="nav-item mx-2"><a class="nav-link tl"
									href="trangLienHe.jsp">Liên hệ</a></li>
							</ul>
						</nav>
					</div>
					<div class="col-md-3 pt-1">
						<nav class="navbar navbar-expand-sm justify-content-end"
							role="navigation">
							<form action="search_results.html" method="get" class="d-flex">
								<input value="" type="text" name="txt" class="form-control me-2"
									placeholder="Search..." aria-label="Search">
								<button class="btn btn-light sea" type="submit"
									aria-label="Submit search">
									<i class="fa-solid fa-magnifying-glass"></i>
								</button>
							</form>
						</nav>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>