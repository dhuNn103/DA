<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update danh mục</title>
</head>
<body>
	<%@include file="/admin/template/header.jsp"%>
	<%@include file="/admin/template/sidebar.jsp"%>
	<main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
		<h4>Edit danh mục</h4>
		<div class="pt-1" style="border: 1px gray solid; border-radius: 5px;">
			<div class="row d-flex px-2">
				<div class="col ">
					<div class="mb-3">
						<label class="form-label">ID danh mục </label> <input type="text"
							class="form-control" name="idDM" id="exampleInputName">
					</div>
					<div class="mb-3">
						<label class="form-label">Tên sản phẩm</label> <input type="text"
							class="form-control" name="names" id="exampleInputPassword1">
					</div>
					<div class="d-flex justify-content-end">
						<a href="quanlyDanhMuc.jsp" class="btn btn-secondary p-2 m-2 ">Quay
							lại</a>
						<button type="submit" class="btn btn-danger p-2 m-2">Lưu</button>
					</div>
				</div>
			</div>
		</div>
	</main>
</body>
</html>