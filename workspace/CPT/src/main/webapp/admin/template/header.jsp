
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
			class="container-fluid d-flex justify-content-between align-items-center text-white">
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
							<li><a class="dropdown-item" href="ThongTinCaNhan.jsp">Thông
									tin tài khoản</a></li>
							<li><a class="dropdown-item">
									<button type="submit" class="px-5">Đăng xuất</button>
							</a></li>
						</ul>
					</form>
				</div>
			</div>
		</div>
	</header>
</body>
</html>