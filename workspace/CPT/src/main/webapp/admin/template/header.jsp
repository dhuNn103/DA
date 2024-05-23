
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="/all/css.jsp"%>
</head>
<body>
	<header class="py-3 mb-3 border-bottom sticky-top px-5 bg-success">
		<div
			class="container-fluid d-grid gap-3 align-items-center text-white"
			style="grid-template-columns: 1fr 2fr;">
			<h5 class="ps-5 pt-1">Trang quản trị</h5>
			<div class="d-flex align-items justify-content-end">
				<%
				String loggedInUser = (String) session.getAttribute("emls");
				%>
				Hi,
				<%=session.getAttribute("emls")%> 
				<div class="flex-shrink-0 dropdown">
					<a href="#"
						class="d-block link-dark text-decoration-none dropdown-toggle text-white"
						id="dropdownUser2" data-bs-toggle="dropdown" aria-expanded="false">
						<i class="fa-solid fa-user ps-3"></i>
					</a>
					<form action="../LogoutServlet" method="post">
						<ul class="dropdown-menu text-small shadow"
							aria-labelledby="dropdownUser2">
							<li><a class="dropdown-item" href="ThongTinCaNhan.jsp">Thông tin tài
									khoản</a></li>
							<li><a class="dropdown-item">
									<button type="submit" class="px-5">Đăng xuất</button>
							</a></li>
						</ul>
					</form>
				</div>
			</div>
		</div>
	</header>

	<!-- 	<nav class="navbar navbar-expand-lg navbar-dark bg-dark sticky-top"> -->
	<!--         <div class="container"> -->
	<!--             <a class="navbar-brand" href="#">Trang quản trị</a> -->
	<!--             <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation"> -->
	<!--                 <span class="navbar-toggler-icon"></span> -->
	<!--             </button> -->
	<!--             <div class="collapse navbar-collapse justify-content-end" id="navbarNavDropdown"> -->
	<!--                 <ul class="navbar-nav"> -->
	<!--                     <li class="nav-item dropdown"> -->
	<!--                         <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false"> -->
	<!--                             Thông tin tài khoản -->
	<!--                         </a> -->
	<!--                         <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink"> -->
	<!--                             <li><a class="dropdown-item" href="#">Tùy chọn 1</a></li> -->
	<!--                             <li><a class="dropdown-item" href="#">Tùy chọn 2</a></li> -->
	<!--                             <li><hr class="dropdown-divider"></li> -->
	<!--                             <li><a class="dropdown-item" href="#">Đổi mật khẩu</a></li> -->
	<!--                         </ul> -->
	<!--                     </li> -->
	<!--                     <li class="nav-item"> -->
	<!--                         <a class="nav-link" href="#">Đăng xuất</a> -->
	<!--                     </li> -->
	<!--                 </ul> -->
	<!--             </div> -->
	<!--         </div> -->
	<!--     </nav> -->
</body>
</html>