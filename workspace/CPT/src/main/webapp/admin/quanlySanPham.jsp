<%@page import="com.CPT.Entities.SanPham"%>
<%@page import="java.util.List"%>
<%@page import="com.CPT.DB.DBConnect"%>
<%@page import="com.CPT.Dao.SanPhamDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="/all/css.jsp"%>
<title>Quản lý sản phẩm</title>
</head>
<body>
		<%@include file="/admin/template/header.jsp"%>
		<%@include file="/admin/template/sidebar.jsp"%>
		<main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
			<h4 class="pt-3">Danh sách sản phẩm</h4>
			<div class="mx-5 d-flex">
				<a href="SanPhamAdd.jsp" class="btn btn-primary">Thêm mới sản
					phẩm</a>
				<form class="d-flex mx-5" action="searchSP.jsp" method="post">
					<input class="form-control me-2 mx-5" type="search" name="names"
						placeholder="Search..." aria-label="Search">
					<button class="btn btn-light sea" type="submit">
						<i class="fa-solid fa-magnifying-glass"></i>
				</button>
			</form>
		</div>
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
					<th scope="col">DM</th>
					<th scope="col">Name</th>
					<th scope="col">Giá cũ</th>
					<th scope="col">Giá mới</th>
					<th scope="col" style="width: 250px">Mô tả</th>
					<th scope="col">Ngày tạo</th>
					<th scope="col">Ngày sửa</th>
					<th scope="col">Ảnh</th>
					<th scope="col">Loai</th>
					<th scope="col">Tình trạng</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<%
				SanPhamDaoImpl dao = new SanPhamDaoImpl(DBConnect.getConnect());
				List<SanPham> splist = dao.getSanPhamAll();
				for (SanPham sp : splist) {
				%>
				<tr>
					<td><%=sp.getIddanhmuc()%></td>
					<td><%=sp.getTensanpham()%></td>
					<td><%=sp.getGiacu()%></td>
					<td><%=sp.getGiamoi()%></td>
					<td><%=sp.getMota()%></td>
					<td><%=sp.getNgaytao()%></td>
					<td><%=sp.getNgaysua()%></td>
					<td><img src="../img/<%=sp.getHinhanh()%>"
						style='height: 60px; width: 60px;'></td>
					<td><%=sp.getLoaisanpham()%></td>
					<td><%=sp.getTinhtrang()%></td>
					<td><a href="SanPhamEdit.jsp?id=<%=sp.getId()%>"
						class="btn btn-primary">Edit</a> <a
						href="../Delete?id=<%=sp.getId()%>" class="btn btn-danger">Delete</a></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>

	</main>			

</body>
</html>