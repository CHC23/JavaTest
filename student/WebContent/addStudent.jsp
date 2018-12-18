<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/student/AddStudentServlet" method="GET">
		姓名：<input type="text" name="sname"><br><br>
		性别：<input type="radio" name="sex" value="男">男
			<input type="radio" name="sex" value="女">女<br><br>
		电话：<input type="text" name="phone"><br><br>
		年龄：<input type="text" name="age"><br><br>
		爱好：<textarea rows="6" cols="50" maxlength="100" name="hobby"></textarea><br><br>
		信息：<textarea rows="6" cols="50" maxlength="100" name="info"></textarea><br><br>
		<button type="submit">添加</button>
	</form>
	
</body>
</html>