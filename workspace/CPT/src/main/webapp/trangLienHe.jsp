<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="all/css.jsp"%>
<title>Liên hệ</title>
</head>
<body>

	<jsp:include page="all/homeHeader.jsp"></jsp:include>
	<div class="container">
		<div id="wrap">

			<div id="contend33">
				<H3>Liên hệ</H3>
				<HR>
				<br>
				<form method="post" id="gopy" name="gopy" onSubmit="return kt">
					<table width="600" border="0" cellpadding="3" cellspacing="10">
						<tr>
							<th>Chủ đề :</th>
							<td><select>
									<option>Diễn đàn</option>
									<option>Mua bán</option>
									<option>Khác</option>
							</select></td>
						</tr>
						<tr>
							<th>Email :</th>

							<td><label for="email"></label> <textarea cols="65" rows="1"
									id="email"> </textarea></td>
						</tr>
						<tr>
							<th>Nội Dung :</th>
							<td><label for="nd"></label> <textarea cols="65" rows="15"
									id="ndd">    </textarea></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td><input type="submit" value="Send to Admin" id="gui"
								onClick="alert'Ban da gui thanh cong '"></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
	<%@include file="all/homeFooter.jsp"%>
</body>
</html>