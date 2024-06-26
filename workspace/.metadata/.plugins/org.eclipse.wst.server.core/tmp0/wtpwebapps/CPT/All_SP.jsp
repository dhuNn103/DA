<%@page import="com.CPT.Entities.SanPham"%>
<%@page import="java.util.List"%>
<%@page import="com.CPT.DB.DBConnect"%>
<%@page import="com.CPT.Dao.SanPhamDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="/all/css.jsp"%>
<title>Sản phẩm liên quan</title>
<style type="text/css">
.card-ho:hover {
	background-color: #f2f2f2;
}

.zoom:hover {
	transform: scale(1.055);
}
</style>
</head>
<body>
	<jsp:include page="all/homeHeader.jsp"></jsp:include>
	<div class="container-fluid back-image"></div>
	<section>
		<div class="container px-5 pt-3">
			<h3>SẢN PHẨM LIÊN QUAN</h3>
			<div class="row">

				<%
				SanPhamDaoImpl dao = new SanPhamDaoImpl(DBConnect.getConnect());
				List<SanPham> list = dao.getAllSanPham2();
				for (SanPham p : list) {
				%>
				<div class="col-md-3 my-2">
					<div class="card card-ho">
						<div class="card-body text-center">
							<div class="zoom">
								<img alt="" src="img/<%=p.getHinhanh()%>"
									style="width: 250px; height: 250px" class="image-thumblin">
							</div>

							<p class="pt-3"><%=p.getTensanpham()%></p>
							<h5 class="text-danger">
								Giá mới:
								<%=p.getGiamoi()%>.đ
							</h5>
							<p class="" style="text-decoration: line-through;">
								Giá cũ:
								<%=p.getGiacu()%>.đ
							</p>
							<div class="button-container d-flex justify-content-center mx-4">
								<%
								if (p.getTinhtrang().equals("còn hàng")) {
								%>
								<a href="ChitietSanPham.jsp?id=<%=p.getId()%>"
									class="btn btn-success p-2 m-2">Chi tiết</a> <a href="#"
									class="btn btn-danger p-2 m-2"><i
									class="fa-brands fa-opencart"></i> Giỏ hàng</a>
								<%
								} else {
								%>
								<a href="ChitietSanPham.jsp?id=<%=p.getId()%>"
									class="btn btn-success p-2 m-2">Chi tiết</a>
								<%
								}
								%>
							</div>
						</div>
					</div>
				</div>
				<%
				}
				%>
			</div>
		</div>
	</section>
	<%@include file="all/homeFooter.jsp"%>
</body>
</html>