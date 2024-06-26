<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="/all/css.jsp"%>
<title>Quên mật khẩu</title>
</head>
<body>
	<section>
		<div class="container mt-5 pt-5">
			<div class="row ">
				<div class="col-12 col-sm-8 col-md-5 m-auto">
					<div class="card mx-5">
						<div class="card-body bg-body-tertiary">
							<h2 class="text-center">Nhập mã bảo mật</h2>
							<br>
							<c:if test="${not empty failMsg}">
								<p class="text-center text-danger">${failMsg}</p>
								<c:remove var="failMsg" scope="session" />
							</c:if>
							<c:if test="${not empty message}">
								<p class="text-center text-success">${message}</p>
								<c:remove var="message" scope="session" />
							</c:if>
							<form action="validateOTP" method="post">
								<div class="form-group">
									<label for="fullname">Vui lòng kiểm tra trong email. Mã
										gồm 6 số </label> <input type="number" name="otp" id="otp"
										class="form-control">
								</div>
								<div class="row">
									<div class="text-primary p-2 col-5">
										<a class="nav-link" href="quenPass.jsp">Bạn chưa có mã?</a>
									</div>
									<div class="mt-2 col-7 d-flex">
										<a href="login.jsp" class="btn btn-secondary m-1">Hủy</a>
										<button class="btn btn-primary m-1">Tiếp tục</button>
									</div>
								</div>

							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>