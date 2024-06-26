<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="/all/css.jsp"%>
<title>Quản lý giỏ hàng</title>
</head>
<body>
	<%@include file="/admin/template/header.jsp"%>
	<%@include file="/admin/template/sidebar.jsp"%>
	<main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
		<h4 class="pt-3">Giỏ hàng</h4>
		<div class="mx-5 d-flex">
			<a href="add_sp.jsp" class="btn btn-primary">Thêm mới</a>
			<form class="d-flex mx-5" action="SearchSanPham.jsp" method="post">
				<input class="form-control me-2 mx-5" type="search" name="names"
					placeholder="Search..." aria-label="Search">
				<button class="btn btn-light sea" type="submit">
					<i class="fa-solid fa-magnifying-glass"></i>
				</button>
			</form>
		</div>
		<table class="table table-bordered mt-3">
			<thead>
				<tr>
					<th scope="col">Tên sản phẩm</th>
					<th scope="col">Giá bán</th>
					<th scope="col">Hệ điều hành</th>
					<th scope="col">Tình trạng</th>
					<th scope="col">Hình ảnh</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th>a</th>
					<td>Mark</td>
					<td>Otto</td>
					<td>@mdo</td>
					<td>@mdo</td>
					<td><a href="#" class="btn btn-danger">Delete</a> <a
						href="edit_sp.jsp" class="btn btn-primary">Edit</a> <a
						href="chi_tiet_sp.jsp" class="btn btn-success">detail</a></td>
				</tr>
				<tr>
					<th>b</th>
					<td>Jacob</td>
					<td>Thornton</td>
					<td>@fat</td>
					<td>@mdo</td>
					<td><a href="#" class="btn btn-danger">Delete</a> <a
						href="edit_sp.jsp" class="btn btn-primary">Edit</a> <a
						href="chi_tiet_sp.jsp" class="btn btn-success">detail</a></td>
				</tr>
				<tr>
					<th>c</th>
					<td>Larry the Bird</td>
					<td>@twitter</td>
					<td>@twitter</td>
					<td>@mdo</td>
					<td><a href="#" class="btn btn-danger">Delete</a> <a
						href="edit_sp.jsp" class="btn btn-primary">Edit</a> <a
						href="chi_tiet_sp.jsp" class="btn btn-success">detail</a></td>
				</tr>
			</tbody>
		</table>

	</main>
</body>
</html>