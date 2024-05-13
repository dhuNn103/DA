<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	HttpSession session = req.getSession();
	session.removeAttribute("emls");
	session.removeAttribute("loggedInUser");
	resp.sendRedirect("login.jsp");
</body>
</html>