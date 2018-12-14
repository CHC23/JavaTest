<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生登录</title>
</head>
<body>
	${message} <br>
	<form action="${pageContext.request.contextPath}/loginServlet" method="POST">
		学号：<input type="text" name="number"/><br><br>
		密码：<input type="password" name="password"/><br><br>
		<input type="submit" value="登录">
	</form>
	<a href="${pageContext.request.contextPath }/toRegisterServlet">注册</a>
</body>
</html>