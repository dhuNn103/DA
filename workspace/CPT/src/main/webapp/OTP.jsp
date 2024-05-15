<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
							<%
							if (request.getAttribute("message") != null) {
								out.print("<p class='text-danger ml-1'>" + request.getAttribute("message") + "</p>");

							}
							%>
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
									<div class="text-center mt-2 col-7">
										<button class="btn btn-secondary">
											<a href="login.jsp" class="nav-link">Hủy</a>
										</button>
										<button class="btn btn-primary">Tiếp tục</button>
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