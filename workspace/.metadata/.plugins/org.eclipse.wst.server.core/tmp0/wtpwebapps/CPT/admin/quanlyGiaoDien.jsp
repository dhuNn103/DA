<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="/all/css.jsp"%>
<title>Quản lý giao diện</title>
</head>
<body>
	<%@include file="/admin/template/header.jsp"%>
	<%@include file="/admin/template/sidebar.jsp"%>
	<main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
		<h4>Quản lý giao diện</h4>
		<div class="row mx-5 pt-5" >
			<div class="col-md-4">
				<div class="card card-ho ">
					<div class="card-body text-center ">
						<a href="quanlyAnhPage.jsp" class="text-decoration-none fs-4">Quản lý
							hình ảnh page</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card card-ho">
					<div class="card-body text-center">
						<a href="quanlyGioiThieu.jsp" class="text-decoration-none fs-4">Quản lý
							trang giới thiệu</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card card-ho">
					<div class="card-body text-center">
						<a href="quanlyGioiThieu.jsp" class="text-decoration-none fs-4">Quản lý
							khuyến mại</a>
					</div>
				</div>
			</div>
		</div>
	</main>

</body>
</html>