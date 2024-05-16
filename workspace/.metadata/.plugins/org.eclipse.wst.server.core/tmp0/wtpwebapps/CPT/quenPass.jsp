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
							<h2 class="text-center">Quên Mật Khẩu</h2>
							<br>
							<c:if test="${not empty faileMsg}">
								<p class="text-center text-danger">${faileMsg}</p>
								<c:remove var="faileMsg" scope="session" />
							</c:if>
							<form action="reset_password" method="post" id="resetForm">
								<div class="form-group">
									<label for="fullname">Vui lòng nhập email 
									</label> <input type="text" name="txtemail" id="txtemail"
										class="form-control">
								</div>
								<div class="text-center mt-3 d-flex justify-content-end">
									<button class="btn btn-secondary">
										<a href="login.jsp" class="nav-link">Hủy</a>
									</button>
									<button class="btn btn-primary mx-3">
										Lấy lại mật khẩu
									</button>
								</div>
							</form>
							
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	
	<script type="text/javascript">
 
    $(document).ready(function() {
        $("#resetForm").validate({
            rules: {
                email: {
                    required: true,
                    email: true
                }      
            },
             
            messages: {
                email: {
                    required: "Please enter email",
                    email: "Please enter a valid email address"
                }
            }
        });
 
    });
</script>
</body>
</html>