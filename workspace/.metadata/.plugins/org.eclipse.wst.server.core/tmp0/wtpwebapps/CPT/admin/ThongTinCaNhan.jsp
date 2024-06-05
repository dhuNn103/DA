<%@page import="com.CPT.Entities.NguoiDung"%>
<%@page import="com.CPT.DB.DBConnect"%>
<%@page import="com.CPT.Dao.NguoiDungDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="/all/css.jsp"%>
<title>Thông tin cá nhân</title>
</head>
<body>
	<%@include file="/admin/template/header.jsp"%>
	<%@include file="/admin/template/sidebar.jsp"%>
	<main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
		<h4 class="pt-3 text-center">Thông tin cá nhân</h4>
		<div class="pt-1" style="border: 1px gray solid; border-radius: 5px;">
			<form action="" method="post">
				<div class="row d-flex px-2">
					<div class="col-md-6">
						<div class="mb-3">
							<label class="form-label">Họ tên</label> <input type="text"
								name="txtname" id="txtname" class="form-control">
						</div>
						<div class="mb-3">
							<label class="form-label">Email</label> <input type="text"
								name="txtemail" id="txtemail" class="form-control">
						</div>
						<div class="mb-3">
							<label class="form-label">Số điện thoại</label> <input type="text"
								maxlength="10" name="txtphone" id="txtphone"
								class="form-control">
						</div>
					</div>
					<div class="col-md-6">

						<div class="mb-3">
							<label class="form-label">Địa chỉ</label> <input type="text"
								name="txtaddr" id="txtaddr" class="form-control">
						</div>
						<div class="mb-3">
							<label class="form-label">Mật khẩu</label> <input type="password"
								name="txtpassword" id="txtpassword" class="form-control">
						</div>
					</div>
				</div>

				<div class="py-3 text-center">
					<a href="#" class="btn btn-secondary">Hủy</a> <a href="#"
						class="btn btn-danger">Lưu</a>
				</div>
			</form>
		</div>
	</main>
</body>
</html>