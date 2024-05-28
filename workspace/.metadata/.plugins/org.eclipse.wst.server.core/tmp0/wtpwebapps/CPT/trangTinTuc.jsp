<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="all/css.jsp"%>
<title>Tin tức</title>
<style type="text/css">
* {
	padding: 0px;
	margin: 0px;
}

#wrap {
	width: 1344px;
	margin: auto;
}

#header {
	width: 100%;
	height: 75px;
	background-color: #192433;
}

input[type="text"] {
	width: 300px;
	box-sizing: border-box;
	border: 1px solid black;
	border-radius: 4px; /* bo góc boder*/
	outline: none;
	padding: 12px 14px;
	transition: 0.6s ease-in-out;
	margin-top: 15px;
	background-color: #151D28;
	color: #EEE;
}

form {
	float: right;
}

input[type="submit"] {
	width: 40px;
	height: 40px;
	margin-top: 15px;
	float: right;
	background-image: url(../ima/tk2.jpg);
	border: 1px solid black;
	border-radius: 4px;
	background-repeat: no-repeat;
}

.img1 {
	width: 75px;
	height: 75px;
	float: left;
}

.h2 {
	float: left;
	margin-left: 20px;
	color: #FFF;
	font-size: 26px;
}

.h22 {
	color: #F00;
	margin-left: 20px;
	float: left;
}

h3 {
	color: #F00;
}

#menu {
	width: 100%;
	height: 52px;
	background-color: #151D28;
	font-size: large;
	border: 0px solid #F00;
}

.dk {
	float: right;
	padding-top: 10px;
	color: #EEE;
	padding-right: 10px;
}

.dk a {
	color: #EEE;
}

ul {
	width: 100%;
	list-style-type: none;
	float: left;
}

.ul {
	float: left;
	margin-left: 65px;
}

li {
	display: inline-block; /* hien thi list hàng ngang */
	width: 115px;
	height: 40px;
	text-align: center;
	padding-top: 10px;
}

#menu a:hover {
	color: #D00;
}

#a1 {
	color: #FFF;
	font-size: 20px;
}

a {
	text-decoration: none; /* link ko có gạch dưới */
}

#leftt {
	width: 1px;
	height: 1000px;
	color: #CCC;
	float: left;
	border: 1px #000;
}

.img5 {
	width: 197px;
	height: 1000px;
}

#contend {
	width: 830px;
	float: left;
	background-color: #FFF;
}

#noidung {
	width: 1170px;
	margin-left: 90px;
}

.img2 {
	width: 580px;
	height: 330px;
}

.img3 {
	width: 350px;
	height: 260px;
}

.img4 {
	width: 800px;
	height: 260px;
}

b {
	text-align: justify;
}

.div121 {
	width: 830px;
	height: 780px;
}

.div1211 {
	width: 600px;
	height: 465px;
	float: left;
	border: 0px solid #010;
}

.div1212 {
	width: 220px;
	height: 400px;
	border: 1px solid #C00;
	float: left;
	margin-left: 5px;
}

hr {
	color: #9F9;
}

#right {
	width: 310px;
	float: right;
	border: 0px solid #000;
	padding-top: 20px;
	padding-left: 18px;
	background-color: #EEE;
}

#r1 {
	width: 290px;
	height: 80px;
	border: 0px solid;
}

#r1 img {
	width: 55px;
	height: 55px;
	float: left;
	padding-right: 5px;
}

.qc1 {
	width: 300px;
	height: 80px;
}

.qc2 {
	width: 300px;
	height: 450px;
}

#footer {
	width: 1344px;
	height: 300px;
	background-color: #192433;
	clear: both;
}

span {
	width: 830px;
	height: 200px;
	border: 0px solid;
	float: left;
	padding-bottom: 17px;
}

span img {
	float: left;
	padding-right: 20px;
}

span p {
	float: right;
	padding-top: 50px;
	font-style: italic;
}

.divtb {
	width: 200px;
	height: 25px;
	background-color: #F66;
	border-bottom-color: #000;
	text-align: center;
	margin-bottom: 5px;
}

.divtb p {
	color: #EEE;
	padding-top: 3px;
}

.docnhieu {
	width: 830px;;
	height: 300px;
	border: 2px solid #010;
	float: left;
	padding-top: 5px;
	background-color: #232C38;
}

.docnhieu div {
	width: 250px;
	height: 250px;
	border: 1px solid #000;
	float: left;
	background-color: #151D28;
	margin-left: 20px;
}

.docnhieu hr {
	float: left;
}

.docnhieu img {
	text-align: center;
	padding-left: 30px;
	padding-top: 5px;
}

.docnhieu a {
	float: left;
	text-align: center;
	color: #DDD;
}

.divft {
	width: 200px;
	height: 220px;
	border: px solid #EEE;
	float: left;
	margin-left: 115px;
	line-height: 30px;
	padding-top: 20px;
}

.divft1 {
	width: 1344px;
	height: 50px;
	border: 0px solid;
	float: left;
	background-color: #151D28;
	padding-left: 15px;
}

.divft2 {
	width: 100%;
	height: 100px;
	text-align: center;
	border: 0px solid;
	float: left;
	background-color: #192433;
}

#aft {
	padding-bottom: 20px;
}

h4 {
	color: #EEE;
}

.divft a {
	color: #AAA;
}

.divft a:hover {
	color: #EEE;
}

.divft1 a {
	color: #3FF;
}
</style>
</head>
<body>
	<jsp:include page="all/homeHeader.jsp"></jsp:include>
	<div id="wrap">
		<div id="header"></div>
		<br>
		<div id="noidung">
			<div id="contend">
				<div class="div121">
					<div class="div1211">
						<h3 class="divtb">
							<p>TIN NỔI BẬT
						</h3>
						</a> <img src="img/win2.jpg" class="img2"> <br> <a
							href="http://genk.vn/samsung-galaxy-s10-vs-xiaomi-mi-9-cung-cau-hinh-manh-3-camera-cam-bien-van-tay-duoi-man-hinh-lieu-s10-co-dang-muc-gia-gap-doi-20190301133736815.chn"
							class="a1">
							<h2>6 Giải pháp đơn giản giúp khắc phục lỗi khởi động chậm
								trên Windows 10</h2>
						</a>
						<!-- <br> Nếu cảm thấy Windows 10 của bạn khởi động quá lâu, hãy xem ngay bài viết này.-->
					</div>
					<br>
					<div class="div1212">
						<b> Tin công nghệ <img src="img/hot.gif" width="30"
							height="30"></b> <br> <br>
						<marquee onmouseover="this.stop()" direction="up"
							onmouseout="this.start()" Scroll scrollamount="5">
							<a href="#">Những chiếc Samsung Galaxy S10 đầu tiên đến tay
								Khách Hàng Việt Nam</a>
							<hr>
							<a href="#">E ngại sức ép từ Mỹ, Huawei cầu cứu các nhà cung
								cấp Nhật Bản</a>
							<hr>
							<a href="#">Các tiện ích Cổng thanh toán PayPal dành cho bạn</a>
							<hr>
							<a href="#">Cách cài WordPress cục bộ trên máy tính với
								ServerPress</a>
							<hr>
							<a href="#">Cách gỡ cài đặt Ubuntu an toàn khỏi PC dual boot
								Windows</a>
							<hr>
							<a href="#">Tính năng nhận dạng chữ viết tay mới của Gboard
								được tích hợp AI, giảm thiểu lỗi tới 40%</a>
							<hr>
							<a href="#">10 phím tắt mà người dùng hay vô tình nhấn phải </a>
							<hr>
							<a href="#">"Thứ giúp Samsung đả bại Apple chính là jack
								3.5mm"</a>
						</marquee>
					</div>
					<br> <br> <a href="http://shopee.vn/cuahangit36"
						class="a1"><img src="img/banner.png" class="img4"></a>
				</div>
				<h3 class="divtb">
					<p>ĐỪNG BỎ LỠ
				</h3>
				</a> <br> <span> <img src="img/anh1.jpg" width="200"
					height="200"> <a href="#">
						<h2>5 công cụ giám sát cơ sở hạ tầng CNTT tốt nhất</h2>
				</a> <br> Các công cụ và phần mềm giám sát cơ sở hạ tầng CNTT rất
					quan trọng trong việc theo dõi những hệ thống mạng phức tạp và đang
					phát triển nhanh chóng như hiện nay. <br>
					<p>6 phút trước</p>
				</span> <br>
				<hr>
				<br> <span> <img src="img/anh2.jpg" width="200"
					height="200"> <a href="#">
						<h2>Lập trình viên sử dụng 12.000 dòng code ‘lột xác’ hoàn
							toàn cho đồ họa trong game Quake 2 từ năm 1997</h2>
				</a> <br> NVIDIA đã bắt tay với các lập trình viên của dự án để có
					thể tạo ra Quake II RTX, một game thuần hiệu ứng dò tia sáng. <br>
					<p>6 phút trước</p>
				</span> <br>
				<hr>
				<br> <span> <img src="img/anh3.jpg" width="200"
					height="200"> <a href="#">
						<h2>Chiêm ngưỡng ứng dụng AI mới của Nvidia: Biến nét vẽ
							nguệch ngoạc theo phong cách MS Paint thành những “kiệt tác” nghệ
							thuật</h2>
				</a> <br> Mới đây, các nhà nghiên cứu trí tuệ nhân tạo Nvidia đã
					phát triển thành công một mô hình học sâu (deep learning) có khả
					năng... <br>
					<p>6 phút trước</p>
				</span> <br>
				<hr>
				<br> <span> <img src="img/anh4.jpg" width="200"
					height="200"> <a href="#">
						<h2>Cách mở 178 định dạng ảnh trên Windows 10</h2>
				</a> <br> Ứng dụng Picture Opener Pro sẽ mở nhiều định dạng ảnh, mà
					không cần phải chuyển đổi định dạng. <br>
					<p>6 phút trước</p>
				</span>
				<hr>
				<div class="docnhieu">
					<hr>
					<center>
						<h3 class="divtb">
							<marquee>
								<p>TIN ĐỌC NHIỀU
							</marquee>
						</h3>
					</center>
					<div>
						<img src="img/a6.jpg" width="200" height="200"> <a
							href="#">Top ứng dụng Android đang miễn phí và giảm giá </a>
					</div>
					<div>
						<img src="img/a7.jpg" width="200" height="200"> <a
							href="#">8 ứng dụng iPhone có thể khóa bằng Touch ID hoặc
							Face ID </a>
					</div>
					<div>
						<img src="img/a8.png" width="200" height="200"> <a
							href="#">Cách hủy kết bạn Facebook ảo hàng loạt </a>
					</div>
				</div>
				<hr>
			</div>
			<div id="right">
				<img
					src="https://cdn.fptshop.com.vn/Uploads/Originals/2019/2/28/636869719313136991_H2.png"
					class="qc1"> <br> <br> <img src="img/qc4.jpg"
					class="qc4" width="300" height="250"> <br> <img
					src="img/qc3.png" width="300" height="250"> <br> <br>
				<b>Tin video<b> <video controls height="200" width="300">
							<source src="../videos/1.mp4" type="video/mp4">
						</video> <br> <br>
						<h3>ICT NEWS</h3> <br>
						<div id="r1">
							<b> <img src="img/r1.jpg" width="80" height="80"> <a
								href="#"> Cách khắc phục lỗi “Tin nhắn không gửi được” trên
									điện thoại Android</a>
						</div>
						<hr>
						<div id="r1">
							<img src="img/r2.png" width="80" height="80"> <a
								href="#"> Cách sửa lỗi website hiện tiếng Pháp trên Chrome,
								Firefox </a>
						</div>
						<hr>
						<div id="r1">
							<img src="img/r3.jpg" width="80" height="80"> <a
								href="#"> Mẹo khởi động thiết bị Android khi bị hỏng nút
								nguồn</a>
						</div>
						<hr>
						<div id="r1">
							<img src="img/r4.jpg" width="80" height="80"> <a
								href="#"> Chiêm ngưỡng 19 bức ảnh tuy thật mà còn vi diệu
								hơn cả Photoshop</a>
						</div>
						<hr>
						<div id="r1">
							<img src="img/r5.jpg" width="80" height="80"> <a
								href="#"> Chiêm ngưỡng 19 bức ảnh tuy thật mà còn vi diệu
								hơn cả Photoshop</a>
						</div>

						<hr> <br> <img src="img/vivo.jpg" width="300"
						height="400"> <img src="ima/qc5.jpg" class="qc4"
						width="300" height="300"> <br>
			</div>
		</div>
		<br> <img src="img/bnp.png" width="100%" height="75">
		<%@include file="all/homeFooter.jsp"%>
</body>
</html>