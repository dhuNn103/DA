<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="../all/css.jsp"%>
<title>Thêm người dùng</title>
</head>
<body>
	<%@include file="/admin/template/header.jsp"%>
	<%@include file="/admin/template/sidebar.jsp"%>
	<main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
		<h4>Thêm mới tài khoản</h4>

		<c:if test="${not empty status }">
			<h5 class="text-center text-danger">${status}</h5>
			<c:remove var="status" scope="session" />
		</c:if>

		<div class="pt-1" style="border: 1px gray solid; border-radius: 5px;">
			<form action="../addNguoiDung" method="post">
				<div class="row d-flex px-2">
					<div class="col-md-6 ">
						<div class="mb-3">
							<label class="form-label">Họ tên </label> <input type="text"
								class="form-control" name="ten" id="ten">
						</div>
						<div class="mb-3">
							<label class="form-label">Email</label> <input type="text"
								class="form-control" name="emails" id="emails">
						</div>
						<div class="mb-3">
							<label class="form-label">Số điện thoại</label> <input
								type="number" class="form-control" name="phone" id="phone">
						</div>
					</div>
					<div class="col-md-6">

						<div class="mb-3">
							<label class="form-label">Địa chỉ</label> <input type="text"
								class="form-control" name="diachi" id="diachi">
						</div>
						<div class="mb-3">
							<label class="form-label">Mật khẩu</label> <input type="text"
								class="form-control" name="passworod" id="passworod">
						</div>
						<div class="mb-3">
							<label class="form-label">ID vai trò</label> <input type="text"
								class="form-control" name="idvt" id="idvt">
						</div>
						<div class="d-flex justify-content-end">
							<a href="quanlyTaiKhoan.jsp" class="btn btn-secondary p-2 m-2 ">Quay
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