<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="all/css.jsp"%>
<title>Giới thiệu</title>
<style type="text/css">

.ar{
 filter: drop-shadow(0 0 5px gray);
 }
.zoom:hover {
  transform: scale(1.025);
}
</style>
</head>
<body>
	<jsp:include page="all/homeHeader.jsp"></jsp:include>
	<img alt="" src="img/laptop3.png" style="width: 100%">
	<div class="container pt-5 px-5">
		<h2 class="text-center ">I. GIỚI THIỆU</h2>
		<div class="row">
			<div class="col-md-6">
				<div class="fs-5">
					<p class="" style="text-align: justify">Sau hơn 2 năm hoạt
						động, bằng những nỗ lực không mệt mỏi, trung thành với chính sách
						“tận tâm phục vụ khách hàng”, ALAPTER STORE đã trở thành chuỗi bán
						lẻ các thiết bị laptop công nghệ hàng đầu, ALAPTER STORE trở thành
						chuỗi nhà thuốc số 1 về thuốc kê toa tại Việt Nam, ALAPTER STORE
						cũng ghi dấu ấn là nhà bán lẻ các thiết bị điện tử (bàn phím,
						chuột, ram ...) chính hãng hàng đầu với đầy đủ các chuẩn cửa hàng
						từ cấp độ cao cấp nhất. ALAPTER STORE đã, đang và sẽ tiếp tục
						chuyển đổi số một cách mạnh mẽ để nâng cao trải nghiệm khách hàng.</p>
					<br>
				</div>
			</div>
			<div class="col-md-6 zoom">
				<img alt="" src="img/pic.jpeg" style="height: 350px">
			</div>
		</div>
		<h2 class="text-center pt-5">II. ĐỘI NGŨ NHÂN VIÊN</h2>
		<div class="row">
			<div class="col-md-6 zoom">
				<img alt="" src="img/gt.jpg" style="height: 350px">
			</div>
			<div class="col-md-6 ar">
				<div class="fs-5" style="text-align: justify">
					<p>ALAPTER STORE tự hào có đội ngũ nhân viên chăm sóc khách
						hàng trẻ trung, năng động, chuyên nghiệp và có trình độ. Điều dễ
						dàng nhận thấy khi bạn đến ALAPTER STORE hay tiếp xúc qua điện
						thoại, nhân viên tư vấn của chúng tôi sẽ luôn hướng dẫn và cung
						cấp cho khách hàng những thông tin hữu ích với sự nhiệt tình và
						thân thiện nhất. Với phương châm “Mỗi khách hàng là một người
						bạn”, đội ngũ tư vấn viên luôn quan tâm tới nhu cầu của khách hàng
						chu đáo.</p>
				</div>
			</div>
		</div>
		<h2 class="text-center pt-5">III. HOẠT ĐỘNG - VĂN HÓA</h2>
		<div class="row">
			<div class="col-md-3 zoom">
				<div class="card" >
					<img alt="" style="height: 175px" src="img/gt1.jpg">
				</div>
			</div>
			<div class="col-md-3 zoom">
				<div class="card" >
					<img alt="" style="height: 175px" src="img/gt2.jpg">
				</div>
			</div>
			<div class="col-md-3 zoom">
				<div class="card" >
					<img alt=""style="height: 175px" src="img/gt3.jpg">
				</div>
			</div>
			<div class="col-md-3 zoom">
				<div class="card" >
					<img alt="" style="height: 175px" src="img/gt4.jpg">
				</div>
			</div>
		</div>
		<div class="row pt-4">
			<div class="col-md-3 zoom">
				<div class="card" >
					<img alt="" style="height: 175px" src="img/gt5.jpg">
				</div>
			</div>
			<div class="col-md-3 zoom">
				<div class="card" >
					<img alt="" style="height: 175px" src="img/gt6.jpg">
				</div>
			</div>
			<div class="col-md-3 zoom">
				<div class="card" >
					<img alt="" style="height: 175px" src="img/gt7.jpg">
				</div>
			</div>
			<div class="col-md-3 zoom">
				<div class="card" >
					<img alt="" style="height: 175px" src="img/gt8.jpg">
				</div>
			</div>
		</div>
	</div>
	<br>
	<%@include file="all/homeFooter.jsp"%>
</body>
</html>