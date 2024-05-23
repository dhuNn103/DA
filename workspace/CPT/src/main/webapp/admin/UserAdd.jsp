<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="/all/css.jsp"%>
<title>Insert title here</title>
<style type="text/css">
.input-group {
	position: relative;
	width: 100%;
}

input[type="text"], input[type="password"] {
	width: 100% !important;
	border-radius: 2px;
	box-sizing: border-box;
	font-size: 1rem;
	height: auto;
	padding: 0.5rem;
}

.toggle {
	background: none;
	border: none;
	font-weight: 600;
	position: absolute;
	z-index: 9;
	right: .75rem;
	top: 2rem;
}
</style>
</head>
<body>
	<%@include file="/admin/template/header.jsp"%>
	<%@include file="/admin/template/sidebar.jsp"%>
	<main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
		<h4>Thêm mới tài khoản</h4>
		<div class="pt-1" style="border: 1px gray solid; border-radius: 5px;">

			<c:if test="${ not empty succ }">
				<h5 class="text-success text-center">${succ }</h5>>
				<c:remove var="succ" scope="session" />
			</c:if>

			<c:if test="${ not empty fail }">
				<h5 class="text-success text-danger">${fail }</h5>>
				<c:remove var="fail" scope="session" />
			</c:if>
			<form action="addtaikhoan" method="post"
				enctype="multipart/form-data">
				<div class="row d-flex px-2">
					<div class="col-md-6 ">
						<div class="mb-3">
							<label class="form-label">Họ tên </label> <input type="text"
								class="form-control" name="names" id="exampleInputName">
						</div>
						<div class="mb-3">
							<label class="form-label">Email</label> <input type="text"
								class="form-control" name="emails">
						</div>
						<div class="mb-3">
							<label class="form-label">Số điện thoại</label> <input
								type="number" class="form-control" name="phones"
								id="exampleInputPassword1">
						</div>
					</div>
					<div class="col-md-6">
						<div class="mb-3">
							<label class="form-label">Địa chỉ</label> <input type="text"
								class="form-control" name="diachi">
						</div>
						<div class="input-group">
							<label for="txtpassword">Mật khẩu</label> <input type="password"
								name="txtpassword" id="txtpassword" class="form-control"
								placeholder="Mật khẩu ít nhất là 8 kí tự">
							<button type="button" id="btnHide" class="toggle"
								onclick="myfunction()">
								<i id="eyeShow" class="fa-solid fa-eye"></i>
							</button>
						</div>
						<div class="mb-3">
							<label class="form-label">Vai trò</label> <input type="text"
								class="form-control" name="vaitro">
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
	<script type="text/javascript">
		var x = true;
		function myfunction() {
			if (x) {
				document.getElementById('txtpassword').type = "text";
				x = false;
			} else {
				document.getElementById('txtpassword').type = "password";
				x = true;
			}
		}
	</script>
</body>
</html>