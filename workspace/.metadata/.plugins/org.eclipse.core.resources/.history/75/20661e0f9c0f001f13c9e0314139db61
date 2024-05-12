<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="/all/css.jsp"%>
<title>Login - form</title>
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
							<h2 class="text-center">Đăng Nhập</h2>

							<c:if test="${not empty fMsg }">
								<h5 class="text-center text-danger">${fMsg}</h5>
								<c:remove var="fMsg" scope="session" />
							</c:if>

							<form action="login" method="post" class="pt-5">
								<div class="input-group">
									<label for="txtname">Tên đăng nhập</label> <input type="text"
										name="txtemail" id="txtemail" class="form-control">
								</div>
								<div class="input-group">
									<label for="txtpassword">Mật khẩu</label> <input
										type="password" name="txtpassword" id="txtpassword"
										class="form-control ">
									<button type="button" id="btnHide" class="toggle" onclick="myfunction()">
										<i id="eyeShow" class="fa-solid fa-eye" ></i>
									</button>

								</div>
								<div class="text-center mt-3">
									<button class="btn btn-primary">Đăng nhập</button>
								</div>
								<div class="pt-3 text-center text-primary">
									<a href="register.jsp" class="nav-link">Bạn chưa có tài
										khoản?</a> 
										<a href="#" class="nav-link">Quên mật khẩu</a> <a
										href="index.jsp" class="nav-link d-flex justify-content-end">Hủy</a>
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
				document.getElementById('txtpassword').type = "text";
				x = false;
			}else{
				document.getElementById('txtpassword').type = "password";
				x = true;
			}
			
		}
	</script>
</body>

</html>