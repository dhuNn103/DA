<%@page import="com.CPT.Entities.SanPham"%>
<%@page import="com.CPT.DB.DBConnect"%>
<%@page import="com.CPT.Dao.SanPhamDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="all/css.jsp"%>
<title>Chi tiết sản phẩm</title>
</head>
<body>
	<jsp:include page="all/homeHeader.jsp"></jsp:include>
	<div class="container px-5 pt-3 py-3">

		<%
		int id = Integer.parseInt(request.getParameter("id"));
		SanPhamDaoImpl dao = new SanPhamDaoImpl(DBConnect.getConnect());
		SanPham sp = dao.getSanPhamById(id);
		%>
		<h3>Chi tiết sản phẩm</h3>
		<div class="row " style="border: 1px gray solid; border-radius: 5px;">
			<div class="col-md-6 py-2">
				<img alt="" src="img/<%=sp.getHinhanh()%>"
					style="height: 400px; width: 500px" class="ps-5">
			</div>
			<div class="col-md-6 pt-4">
				<div class="">
					<h3>
						Name:
						<%=sp.getTensanpham()%></h3>
					<h4 class="text-danger">
						Giá mới:
						<%=sp.getGiamoi()%>.đ
					</h4>
					<p style="text-decoration: line-through;">
						Giá cũ:
						<%=sp.getGiacu()%>.đ
					</p>
					<p style="text-align: justify">
						Mô tả:
						<%=sp.getMota()%></p>
					<hr>
					<div class="row text-center text-danger">
						<div class="col-md-4">
							<i class="fa-solid fa-truck-fast"></i>
							<p>thanh toán khi nhận hàng
							Miễn phí vận chuyển</p>
							
						</div>
						<div class="col-md-4">
							<i class="fa-solid fa-shield-halved"></i>
							<p>Hàng chính hãng 100%</p>
						</div>
						<div class="col-md-4">
							<i class="fa-solid fa-rotate-right"></i>
							<p>Đổi trả trong vòng 5 ngày</p>
						</div>
					</div>
				</div>
				<div class="">
					<%
					if (sp.getTinhtrang().equals("còn hàng")) {
					%>
					<a href="index.jsp" class="btn btn-secondary p-2 m-2">Quay lại</a>
					<a href="#" class="btn btn-danger p-2 m-2"><i
						class="fa-brands fa-opencart"></i> Giỏ hàng</a>
					<%
					} else {
					%>
					<a href="index.jsp" class="btn btn-secondary p-2 m-2">Quay lại</a>
					<%
					}
					%>
				</div>
			</div>
		</div>
	</div>
	<%@include file="all/homeFooter.jsp"%>
</body>
</html>