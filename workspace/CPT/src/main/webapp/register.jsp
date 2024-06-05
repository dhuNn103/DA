<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="/all/css.jsp"%>
<title>Đăng ký</title>
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
	<input type="hidden" id="status"
		value="<%=request.getAttribute("status")%>">
	<div class="container mt-4 pt-5">
		<div class="row ">
			<div class="col-12 col-sm-8 col-md-5 m-auto">
				<div class="card mx-5">
					<div class="card-body bg-body-tertiary">
						<h2 class="text-center">Đăng Ký Tài Khoản</h2>

						<c:if test="${not empty faileMsg}">
							<p class="text-center text-danger">${faileMsg}</p>
							<c:remove var="faileMsg" scope="session" />
						</c:if>

						<form action="register" method="post">
							<div class="input-group">
								<label for="txtname">Họ tên</label> <input type="text"
									name="txtname" id="txtname" class="form-control ">
							</div>
							<div class="input-group">
								<label for="txtemail">Email</label> <input type="text"
									name="txtemail" id="txtemail" class="form-control ">
							</div>
							<div class="input-group">
								<label for="txtphone">Số điện thoại</label> <input type="text"
									maxlength="10" name="txtphone" id="txtphone"
									class="form-control ">
							</div>
							<div class="input-group">
								<label for="txtaddr">Địa chỉ</label> <input type="text"
									name="txtaddr" id="txtaddr" class="form-control ">
							</div>
							<div class="input-group">
								<label for="txtpassword">Mật khẩu</label> <input type="password"
									name="txtpassword" id="txtpassword" class="form-control" placeholder="Mật khẩu ít nhất là 8 kí tự">
								<button type="button" id="btnHide" class="toggle"
									onclick="myfunction()">
									<i id="eyeShow" class="fa-solid fa-eye"></i>
								</button>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="checkbox" value=""
									name="check" id="flexCheckIndeterminate"> <label
									class="form-check-label" for="flexCheckIndeterminate">
									Đồng ý với điều khoản! </label>
							</div>
							<div class="text-center mt-3">
								<button class="btn btn-primary" id="btndangky">Đăng Ký</button>
							</div>
							<div class="pt-3 text-center text-primary">
								<a href="login.jsp" class="nav-link">Bạn đã có tài khoản?</a> <a
									href="quenPass.jsp" class="nav-link pt-1">Quên mật khẩu</a> <a
									href="index.jsp" class="nav-link d-flex justify-content-end">Hủy</a>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<script type="text/javascript">
		var x = true;
		function myfunction() {
			if (x) {
				document.getElementById('txtpassword').type = "text";
				x = false;
			} else {
				document.getElementById('txtpassword').type = "password";
				x = true;
			}
		}
		document.addEventListener("DOMContentLoaded", function() {
            var password = document.getElementById("txtpassword");
            var btn = document.getElementById("btndangky");

            btn.disabled = true;
 
            password.addEventListener("input", function() {
                if (password.value.length >= 8) {
                    btndangky.disabled = false;
                } else {
                	btndangky.disabled = true;
                }
            });
        });
	</script>
</body>
</html>