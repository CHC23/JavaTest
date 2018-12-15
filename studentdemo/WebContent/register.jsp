<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/registerServlet" method="POST">
		学号：<input type="text" name="number"><br><br>
		密码：<input type="text" name="password"><br><br>
		姓名：<input type="text" name="name"><br><br>
		年龄：<input type="text" name="age"><br><br>
		成绩：<input type="text" name="score"><br><br>
		性别：<input type="text" name="sex"><br><br>
		<input type="submit" value="提交注册">
	</form>
</body>
</html>