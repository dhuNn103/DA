<%@page import="com.CPT.Entities.NguoiDung"%>
<%@page import="java.util.List"%>
<%@page import="com.CPT.DB.DBConnect"%>
<%@page import="com.CPT.Dao.NguoiDungDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="/all/css.jsp" %>
<title>Insert title here</title>
</head>
<body>
<%@include file="/admin/template/header.jsp"%>
	<%@include file="/admin/template/sidebar.jsp"%>
	<main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
		<h4 class="pt-3">Danh sách tài khoản</h4>
		<div class="mx-5 d-flex">
			<a href="TaiKhoanAdd.jsp" class="btn btn-primary">Thêm mới tài
				khoản</a>
			<form class="d-flex mx-5" action="searchTaiKhoan.jsp" method="post">
				<input class="form-control me-2 mx-5" type="search" name="txtsearch"
					placeholder="Search..." aria-label="Search">
				<button class="btn btn-light sea" type="submit">
					<i class="fa-solid fa-magnifying-glass"></i>
				</button>
			</form>
		</div>
		<table class="table table-bordered mt-3">
			<thead>
				<tr>
					<th scope="col">Họ tên</th>
					<th scope="col">Email</th>
					<th scope="col">SĐT</th>
					<th scope="col">Địa chỉ</th>
					<th scope="col">Mật khẩu</th>
					<th scope="col">Id vai trò</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<%
				String timkiem = request.getParameter("txtsearch");
				NguoiDungDaoImpl dao = new NguoiDungDaoImpl(DBConnect.getConnect());
				List<NguoiDung> ndlist = dao.getNguoiDungSearch(timkiem);
				for (NguoiDung nd: ndlist){
					
				%>
				<tr>
					<th><%=nd.getHoten() %></th>
					<td><%=nd.getEmail() %></td>
					<td><%=nd.getSodienthoai() %></td>
					<td><%=nd.getDiachi() %></td>
					<td><%=nd.getMatkhau() %></td>
					<td><%=nd.getVaitroid() %></td>
					<td><a href="TaiKhoanEdit.jsp?id=<%=nd.getId() %>"
						class="btn btn-primary">Edit</a> <a
						href="../delete?id=<%=nd.getId() %>" class="btn btn-danger">Delete</a></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>

	</main>
</body>
</html>