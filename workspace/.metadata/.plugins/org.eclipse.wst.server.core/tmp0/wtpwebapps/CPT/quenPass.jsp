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
							<h2 class="text-center">Quên Mật Khẩu</h2>
							<br>
							<div class="form-group">
								<label for="fullname">Vui lòng nhập email hoặc số điện
									thoại</label> <input type="text" name="fullname" id="fullname"
									class="form-control">
							</div>
							<div class="text-center mt-3 d-flex justify-content-end">
								<button class="btn btn-secondary">
									<a href="login.jsp" class="nav-link">Hủy</a>
								</button>
								<button class="btn btn-primary mx-3">
									<a href="layPass.jsp" class="nav-link">Lấy lại mật khẩu</a>
								</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>