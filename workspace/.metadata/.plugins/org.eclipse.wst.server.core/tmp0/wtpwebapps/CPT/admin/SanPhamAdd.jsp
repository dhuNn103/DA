<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="/all/css.jsp"%>
<title>Thêm sản phẩm</title>
</head>
<body>
	<%@include file="/admin/template/header.jsp"%>
	<%@include file="/admin/template/sidebar.jsp"%>
	<main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
		<h4>Thêm mới sản phẩm</h4>
		<div class="pt-1" style="border: 1px gray solid; border-radius: 5px;">

			<c:if test="${ not empty succMsg }">
				<h5 class="text-success text-center">${succMsg }</h5>>
				<c:remove var="succMsg" scope="session" />
			</c:if>

			<c:if test="${ not empty faileMsg }">
				<h5 class="text-success text-danger">${faileMsg }</h5>>
				<c:remove var="faileMsg" scope="session" />
			</c:if>
			
			<form action="../Addsanpham" method="post"
				enctype="multipart/form-data">
				<div class="row d-flex px-2">
					<div class="col-md-6 ">
						<div class="mb-3">
							<label class="form-label">ID danh mục </label> <input type="text"
								class="form-control" name="idDM" id="exampleInputName">
						</div>
						<div class="mb-3">
							<label class="form-label">Tên sản phẩm</label> <input type="text"
								class="form-control" name="names" id="exampleInputPassword1">
						</div>
						<div class="mb-3">
							<label class="form-label">Giá cũ</label> <input type="number"
								class="form-control" name="giacu" id="exampleInputPassword1">
						</div>
						<div class="mb-3">
							<label class="form-label">Giá mới</label> <input type="number"
								class="form-control" name="giamoi" id="exampleInputPassword1">
						</div>
						<div class="mb-3">
							<label class="form-label">Mô tả</label> <input type="text"
								class="form-control" name="mota" id="exampleInputPassword1">
						</div>
						<div class="mb-3">
							<label class="form-label">Ngày tạo</label> <input type="text"
								class="form-control" name="ngaytao" id="exampleInputPassword1">
						</div>
					</div>
					<div class="col-md-6">	
						<div class="mb-3">
							<label class="form-label">Ngày sửa</label> <input type="text"
								class="form-control" name="ngaysua" id="exampleInputPassword1">
						</div>
						
						<div class="mb-3">
							<label class="form-label">Hình ảnh</label> <input type="file"
								class="form-control" name="anh" id="exampleInputPassword1">
						</div>
						<div class="mb-3">
							<label class="form-label">Loại</label> <input type="text"
								class="form-control" name="loai" id="exampleInputPassword1">
						</div>
						<div class="mb-3">
							<label class="form-label">Tình trạng</label> <input type="text"
								class="form-control" name="tinhtrang" id="exampleInputPassword1">
						</div>
						<div class="d-flex justify-content-end">
							<a href="quanlySanPham.jsp" class="btn btn-secondary p-2 m-2 ">Quay
								lại</a>
							<button type="submit" class="btn btn-danger p-2 m-2">Lưu</button>
						</div>
					</div>
				</div>
			</form>
		</div>
	</main>
</body>
</html>