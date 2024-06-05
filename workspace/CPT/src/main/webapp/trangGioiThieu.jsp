<%@page import="com.CPT.Entities.GioiThieu"%>
<%@page import="com.CPT.Dao.GioiThieuDaoImpl"%>
<%@page import="com.CPT.Entities.HinhAnhPage"%>
<%@page import="java.util.List"%>
<%@page import="com.CPT.DB.DBConnect"%>
<%@page import="com.CPT.Dao.HinhAnhPageDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="all/css.jsp"%>
<title>Giới thiệu</title>
<style type="text/css">
.back-image {
	height: 50vh;
	width: 100%;
	position: relative;
	overflow: hidden;
}

.back-image img {
	width: 100%;
	height: auto;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
}

.ar {
	filter: drop-shadow(0 0 5px gray);
}

.zoom:hover {
	transform: scale(1.025);
}
</style>
</head>
<body>

	<jsp:include page="all/homeHeader.jsp"></jsp:include>
	<%
	HinhAnhPageDaoImpl daos = new HinhAnhPageDaoImpl(DBConnect.getConnect());
	List<HinhAnhPage> lists = daos.getAllHinhAnhPages();
	for (HinhAnhPage a : lists) {
	%>
	<div class="container-fluid back-image">
		<img src="img/<%=a.getHinhanh()%>" alt="Laptop Image">
	</div>
	<%
	}
	%>

	<div class="container pt-5 px-5">
		<%
		GioiThieuDaoImpl dao = new GioiThieuDaoImpl(DBConnect.getConnect());
		List<GioiThieu> gtlist = dao.getTieuDe1();
		for (GioiThieu gt : gtlist) {
		%>
		<h2 class="text-center text-uppercase"><%=gt.getTenTieude()%></h2>
		<div class="row">
			<div class="col-md-6">
				<div class="fs-5">
					<p class="" style="text-align: justify"><%=gt.getNoidung()%></p>
					<br>
				</div>
			</div>
			<div class="col-md-6 zoom">
				<img alt="" src="img/<%=gt.getHinhanh()%>" style="height: 350px">
			</div>
		</div>
		<%
		}
		%>
		<br>


		<%
		GioiThieuDaoImpl dao2 = new GioiThieuDaoImpl(DBConnect.getConnect());
		List<GioiThieu> gtlist2 = dao2.getTieuDe2();
		for (GioiThieu gt : gtlist2) {
		%>
		<h2 class="text-center text-uppercase"><%=gt.getTenTieude()%></h2>
		<div class="row">
			<div class="col-md-6 zoom">
				<img alt="" src="img/<%=gt.getHinhanh()%>" style="height: 350px">
			</div>
			<div class="col-md-6">
				<div class="fs-5">
					<p class="" style="text-align: justify"><%=gt.getNoidung()%></p>
					<br>
				</div>
			</div>

		</div>
		<%
		}
		%>
		<br>


		<%
		GioiThieuDaoImpl dao3 = new GioiThieuDaoImpl(DBConnect.getConnect());
		List<GioiThieu> gtlist3 = dao3.getTieuDe3();
		int count = 0; // Biến đếm số lượng ảnh đã hiển thị
		%>
		<div class="row">
			<h2 class="text-center"><%=gtlist3.get(0).getTenTieude()%></h2>
			<!-- Chỉ lấy tên tiêu đề một lần -->
		</div>
		<div class="row pt-3">
			<%
			for (GioiThieu gt : gtlist3) {
			%>
			<div
				class="col-md-3 d-flex align-items-center justify-content-center zoom pt-3">
				<div class="card">
					<img alt="" src="img/<%=gt.getHinhanh()%>" class="img-fluid"
						style="height: 175px; width: 300px">
				</div>
			</div>
			<%
			count++;
			// Nếu đã hiển thị đủ 8 ảnh, thì break ra khỏi vòng lặp
			if (count >= 8) {
				break;
			}
			}
			%>
		</div>
		<div class="row pt-3">
			<%
			for (GioiThieu gt : gtlist3.subList(count, gtlist3.size())) {
			%>
			<div
				class="col-md-3 d-flex align-items-center justify-content-center zoom">
				<div class="card">
					<img alt="" src="img/<%=gt.getHinhanh()%>" class="img-fluid"
						style="max-height: 175px;">
				</div>
			</div>
			<%
			}
			%>
		</div>
	</div>
	<br>
	<%@include file="all/homeFooter.jsp"%>
</body>
</html>