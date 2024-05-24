<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="/all/css.jsp"%>
<title>Mật khẩu mới</title>
<style type="text/css">
.input-group {
	position: relative;
	width: 100%;
	
}

input[type="text"], input[type="password"] {
	width: 100% !important;
	border-radius: 2px;
	box-sizing: border-box;
	font-size: 1rem;
	height: auto;
	padding: 0.5rem;
}

.toggle {
	background: none;
	border: none;
	font-weight: 600;
	position: absolute;
	z-index: 9;
	right: .75rem;
	top: 2rem;
}
</style>
</head>
<body>
	<section>
		<div class="container mt-5 pt-5">
			<div class="row ">
				<div class="col-12 col-sm-8 col-md-5 m-auto">
					<div class="card mx-5">
						<div class="card-body bg-body-tertiary">
							<h2 class="text-center">Đặt mật khẩu mới</h2>
							<br>
							<c:if test="${not empty fail}">
								<p class="text-center text-danger">${fail}</p>
								<c:remove var="fail" scope="session" />
							</c:if>
							<form action="new_password" method="post">
								<div class="input-group">
									<label for="txtpassword">Nhập mật khẩu mới</label> 
									<input type="password" name="txtpasss" id="txtpasss" class="form-control ">
									<button type="button" id="btnHide" class="toggle" onclick="myfunction()">
										<i id="eyeShow" class="fa-solid fa-eye" ></i>
									</button>
								</div>
								<div class="input-group">
									<label for="txtpassword">Nhập lại mật khẩu mới</label>
									<input type="password" name="comfirm_pass" id="comfirm_pass" class="form-control ">
									<button type="button" id="btnHides" class="toggle" onclick="myfunctions()">
										<i id="eyeShow" class="fa-solid fa-eye" ></i>
									</button>
								</div>
								<div class="text-center mt-3 d-flex justify-content-end">
									<a href="login.jsp" class="btn btn-secondary">Hủy</a>		
									<button class="btn btn-primary mx-3">Đặt mật khẩu</button>
								</div>
							</form>

						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<script type="text/javascript">
		var x = true;
		function myfunction() {
			if(x){
				document.getElementById('txtpasss').type = "text";
				x = false;
			}else{
				document.getElementById('txtpasss').type = "password";
				x = true;
			}
			
		}
		
		var y = true;
		function myfunctions() {
			if(y){
				document.getElementById('comfirm_pass').type = "text";
				y = false;
			}else{
				document.getElementById('comfirm_pass').type = "password";
				y = true;
			}
			
		}
	</script>
</body>
</html>