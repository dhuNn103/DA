<%@page import="com.CPT.Entities.NguoiDung"%>
<%@page import="com.CPT.DB.DBConnect"%>
<%@page import="com.CPT.Dao.NguoiDungDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="/admin/template/header.jsp"%>
	<%@include file="/admin/template/sidebar.jsp"%>
	<main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
		<h4>Chỉnh sửa thông tin tài khoản</h4>
		<div class="pt-1" style="border: 1px gray solid; border-radius: 5px;">
			
			<%
			int id  = Integer.parseInt(request.getParameter("id"));
			NguoiDungDaoImpl dao = new NguoiDungDaoImpl(DBConnect.getConnect());
			NguoiDung nd = dao.getNguoiDungById(id);
			%>
			<form action="../editTaikhoan" method="post"
				enctype="multipart/form-data">
				<div class="row d-flex px-2">
					<div class="col-md-6 ">
					<input type="hidden" name="id" value="<%= nd.getId() %>">
						<div class="mb-3">
							<label class="form-label">Họ tên </label> <input type="text"
								class="form-control" name="names" value="<%=nd.getHoten()%>">
						</div>
						<div class="mb-3">
							<label class="form-label">Email</label> <input type="text"
								class="form-control" name="emails" value="<%=nd.getEmail()%>">
						</div>
						<div class="mb-3">
							<label class="form-label">Số điện thoại</label> <input
								type="number" class="form-control" name="phones"
								value="<%=nd.getSodienthoai()%>">
						</div>
					</div>
					<div class="col-md-6">
						<div class="mb-3">
							<label class="form-label">Địa chỉ</label> <input type="text"
								class="form-control" name="diachi" value="<%=nd.getDiachi()%>">
						</div>
						<div class="mb-3">
							<label class="form-label">Mật khẩu</label> <input type="password"
								class="form-control" name="pass" value="<%=nd.getMatkhau()%>">
						</div>
						<div class="mb-3">
							<label class="form-label">Vai trò</label> <input type="text"
								class="form-control" name="vaitro" value="<%=nd.getVaitroid()%>">
						</div>
					</div>
					<div class="d-flex justify-content-end">
						<a href="quanlyTaiKhoan.jsp" class="btn btn-secondary p-2 m-2 ">Quay
							lại</a>
						<button type="submit" class="btn btn-danger p-2 m-2">Lưu</button>
					</div>

				</div>
			</form>
		</div>
	</main>
</body>
</html>