<%@page import="com.CPT.Entities.DanhMuc"%>
<%@page import="java.util.List"%>
<%@page import="com.CPT.DB.DBConnect"%>
<%@page import="com.CPT.Dao.DanhMucDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="/all/css.jsp"%>
<title>Quản lý danh mục</title>
</head>
<body>
	<%@include file="/admin/template/header.jsp"%>
	<%@include file="/admin/template/sidebar.jsp"%>
	<main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
		<h4 class="pt-3">Danh mục</h4>
		<div class="mx-5">
			<a href="DanhMucAdd.jsp" class="btn btn-primary">Thêm mới danh
				mục</a>
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
				DanhMucDaoImpl dao = new DanhMucDaoImpl(DBConnect.getConnect());
				List<DanhMuc> dmlist = dao.getDanhMucAll();
				for (DanhMuc dm : dmlist) {
				%>
				<tr>
					<td><%=dm.getId() %></td>
					<td><%=dm.getTendanhmuc()%></td>
					<td><a href="DanhMucEdit.jsp" class="btn btn-primary">Edit</a> <a href="#"
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