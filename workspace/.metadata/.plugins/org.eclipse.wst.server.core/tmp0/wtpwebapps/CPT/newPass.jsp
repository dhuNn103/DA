<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="/all/css.jsp"%>
<title>Insert title here</title>
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
							<form action="new_password" method="post">
								<div class="form-group">
									<label for="fullname">Vui lòng nhập mật khẩu mới </label> <input
										type="text" name="txtpasss" id="txtpasss" class="form-control">
								</div>
								<div class="form-group">
									<label for="fullname">Vui lòng nhập lại mật khẩu mới </label> <input
										type="text" name="comfirm_pass" id="comfirm_pass"
										class="form-control">
								</div>
								<div class="text-center mt-3 d-flex justify-content-end">
									<button class="btn btn-secondary">
										<a href="login.jsp" class="nav-link">Hủy</a>
									</button>
									<button class="btn btn-primary mx-3">Đặt mật khẩu</button>
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