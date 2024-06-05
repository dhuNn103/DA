<%@page import="com.CPT.Entities.DanhMuc"%>
<%@page import="java.util.List"%>
<%@page import="com.CPT.DB.DBConnect"%>
<%@page import="com.CPT.Dao.DanhMucDaoImpl"%>
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
		<h4 class="pt-3">Danh mục</h4>
		<div class="mx-5 d-flex">
			<a href="DanhMucAdd.jsp" class="btn btn-primary">Thêm mới danh
				mục</a>

			<form class="d-flex mx-5" action="searchDanhMuc.jsp" method="post">
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
					<th scope="col">ID</th>
					<th scope="col">Tên danh mục</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<%
				String search = request.getParameter("names");
				DanhMucDaoImpl dao = new DanhMucDaoImpl(DBConnect.getConnect());
				List<DanhMuc> list = dao.getsearch(search);
				for(DanhMuc dms: list )
				{
				%>
				<tr>
					<td><%=dms.getId()%></td>
					<td><%=dms.getTendanhmuc()%></td>
					<td><a href="DanhMucEdit.jsp?id=<%=dms.getId()%>"
						class="btn btn-primary">Edit</a> <a
						href="../Xoa?id=<%=dms.getId()%>" class="btn btn-danger">Delete</a></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>

	</main>
</body>
</html>