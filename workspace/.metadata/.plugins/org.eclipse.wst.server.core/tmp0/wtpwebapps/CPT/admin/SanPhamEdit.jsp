<%@page import="com.CPT.Entities.SanPham"%>
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
<%@include file="/all/css.jsp" %>
<title>Update sản phẩm</title>
</head>
<body>
	<%@include file="/admin/template/header.jsp"%>
	<%@include file="/admin/template/sidebar.jsp"%>
	<main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
		<h4>Chinh sửa thông tin sản phẩm</h4>
		<div class="pt-1" style="border: 1px gray solid; border-radius: 5px;">

			<%
			int id = Integer.parseInt(request.getParameter("id"));
			SanPhamDaoImpl dao = new SanPhamDaoImpl(DBConnect.getConnect());
			SanPham sp = dao.getSanPhamById(id);
			%>
			<form action="../Edtsanpham" method="post"
				enctype="multipart/form-data">
				<div class="row d-flex px-2">
					<div class="col-md-6 ">
						<input type="hidden" name="id" value="<%=sp.getId()%>">
						<div class="mb-3">
							<label class="form-label">ID danh mục </label> <input type="text"
								class="form-control" name="idDM" id="exampleInputName"
								value="<%=sp.getIddanhmuc()%>">
						</div>
						<div class="mb-3">
							<label class="form-label">Tên sản phẩm</label> <input type="text"
								class="form-control" name="names" id="exampleInputPassword1"
								value="<%=sp.getTensanpham()%>">
						</div>
						<div class="mb-3">
							<label class="form-label">Giá cũ</label> <input type="number"
								class="form-control" name="giacu" id="exampleInputPassword1"
								value="<%=sp.getGiacu()%>">
						</div>
						<div class="mb-3">
							<label class="form-label">Giá mới</label> <input type="number"
								class="form-control" name="giamoi" id="exampleInputPassword1"
								value="<%=sp.getGiamoi()%>">
						</div>
						<div class="mb-3">
							<label class="form-label">Mô tả</label> <input type="text"
								class="form-control" name="mota" id="exampleInputPassword1"
								value="<%=sp.getMota()%>">
						</div>
						<div class="mb-3">
							<label class="form-label">Ngày tạo</label> <input type="text"
								class="form-control" name="ngaytao" id="exampleInputPassword1"
								value="<%=sp.getNgaytao()%>">
						</div>
					</div>
					<div class="col-md-6">

						
						<div class="mb-3">
							<label class="form-label">Ngày sửa</label> <input type="text"
								class="form-control" name="ngaysua" id="exampleInputPassword1"
								value="<%=sp.getNgaysua()%>">
						</div>
						<div class="mb-3">
							<label class="form-label">Hình ảnh</label> 
							<br>
							<img alt="" src="../img/<%=sp.getHinhanh()%>" style='height: 110px; width: 110px;'> <input type="file"
								class="form-control" name="anh" id="exampleInputPassword1"
								value="">
						</div>
						<div class="mb-3">
							<label class="form-label">Loại</label> <input type="text"
								class="form-control" name="loai" id="exampleInputPassword1" value="<%=sp.getLoaisanpham()%>">
						</div>
						<div class="mb-3">
							<label class="form-label">Tình trạng</label> <input type="text"
								class="form-control" name="tinhtrang" id="exampleInputPassword1" value="<%=sp.getTinhtrang()%>">
						</div>
						<div class="d-flex justify-content-end">
							<a href="quanlySanPham.jsp" class="btn btn-secondary p-2 m-2 ">Quay
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