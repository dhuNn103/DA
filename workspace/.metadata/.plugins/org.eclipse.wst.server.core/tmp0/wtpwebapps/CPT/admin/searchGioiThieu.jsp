<%@page import="com.CPT.Entities.GioiThieu"%>
<%@page import="java.util.List"%>
<%@page import="com.CPT.DB.DBConnect"%>
<%@page import="com.CPT.Dao.GioiThieuDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="/all/css.jsp"%>
<title>Insert title here</title>
</head>
<body>
	<%@include file="/admin/template/header.jsp"%>
	<%@include file="/admin/template/sidebar.jsp"%>
	<main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
		<h4 class="pt-3">Trang giới thiệu</h4>
		<div class="mx-5 d-flex">
			<a href="#" class="btn btn-primary">Thêm mới</a>
			<form class="d-flex mx-5" action="searchGioiThieu.jsp" method="post">
				<input class="form-control me-2 mx-5" type="search" name="name"
					placeholder="Search..." aria-label="Search">
				<button class="btn btn-light sea" type="submit">
					<i class="fa-solid fa-magnifying-glass"></i>
				</button>
			</form>
			<a href="quanlyGiaoDien.jsp" class="text-decoration-none">Quay
				lại</a>
		</div>
		<table class="table table-bordered mt-3">
			<thead>
				<tr>
					<th scope="col" style="width: 200px">Tiêu đề</th>
					<th scope="col" style="width: 600px">Nội dung</th>
					<th scope="col" style="width: 100px">Hình ảnh</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<%
				String search = request.getParameter("name");
				GioiThieuDaoImpl dao = new GioiThieuDaoImpl(DBConnect.getConnect());
				List<GioiThieu> gtlist = dao.getsearch(search);
				for (GioiThieu gt : gtlist) {
				%>
				<tr>
					<td><%=gt.getTenTieude() %></td>
					<td><%=gt.getNoidung()%></td>
					<td><img alt="" src="../img/<%=gt.getHinhanh()%>"
						style="height: 160px; width: 240px"></td>
					<td><a href="#" class="btn btn-primary">Edit</a> <a href="#"
						class="btn btn-danger">Delete</a></td>
				</tr>

				<%
				}
				%>
			</tbody>
		</table>
	</main>
</body>
</html>