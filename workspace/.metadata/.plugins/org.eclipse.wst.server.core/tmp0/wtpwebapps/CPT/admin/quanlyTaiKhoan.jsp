<%@page import="com.CPT.DB.DBConnect"%>
<%@page import="com.CPT.Dao.NguoiDungDao"%>
<%@page import="com.CPT.Entities.NguoiDung"%>
<%@page import="java.util.List"%>
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
<title>Quản lý tài khoản</title>
</head>
<body>
	<%@include file="/admin/template/header.jsp"%>
	<%@include file="/admin/template/sidebar.jsp"%>
	<main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
		<h4 class="pt-3">Danh sách tài khoản</h4>
		<div class="mx-5 d-flex">
			<a href="TaiKhoanAdd.jsp" class="btn btn-primary">Thêm mới tài
				khoản</a>
		</div>
		<c:if test="${not empty status }">
			<h5 class="text-center text-success">${status}</h5>
			<c:remove var="status" scope="session" />
		</c:if>

		<c:if test="${ not empty succMsg }">
			<h5 class="text-success text-center">${succMsg }</h5>
			<c:remove var="succMsg" scope="session" />
		</c:if>

		<c:if test="${ not empty faileMsg }">
			<h5 class="text-success text-danger">${faileMsg }</h5>>
				<c:remove var="faileMsg" scope="session" />
		</c:if>
		<table class="table table-bordered mt-3">
			<thead>
				<tr>
					<th scope="col" style="width: 110px">Họ tên</th>
					<th scope="col" style="width: 30px">Email</th>
					<th scope="col" style="width: 30px">SĐT</th>
					<th scope="col" >Địa chỉ</th>
					<th scope="col" style="width: 150px">Mật khẩu</th>
					<th scope="col" style="width: 20px">Id vai trò</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<%
				NguoiDungDaoImpl dao = new NguoiDungDaoImpl(DBConnect.getConnect());
				List<NguoiDung> ndlist = dao.getNguoiDungAll();
				for (NguoiDung nd : ndlist) {
				%>
				<tr>
					<th><%=nd.getHoten()%></th>
					<td><%=nd.getEmail()%></td>
					<td><%=nd.getSodienthoai()%></td>
					<td><%=nd.getDiachi()%></td>
					<td><%=nd.getMatkhau()%></td>
					<td><%=nd.getVaitroid()%></td>
					<td><a href="TaiKhoanEdit.jsp?id=<%=nd.getId()%>"
						class="btn btn-primary">Edit</a> <a
						href="../delete?id=<%=nd.getId()%>" class="btn btn-danger">Delete</a></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>

	</main>
</body>
</html>