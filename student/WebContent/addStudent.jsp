<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="css/add.css"/>
</head>
<body>
	<div class="container">
	<h2>请输入学生信息</h2>
		<form action="AddStudentServlet" method="GET">
			姓名：<input type="text" name="sname"><br><br>
			学号：<input type="text" name="number"><br><br>
			密码：<input type="text" name="password"><br><br>
			性别：<input type="radio" name="sex" value="男">男
				<input type="radio" name="sex" value="女">女<br><br>
			电话：<input type="text" name="phone"><br><br>
			年龄：<input type="text" name="age"><br><br>
			班级：<input type="text" name="sclass"><br><br>
			信息：<textarea rows="6" cols="22" maxlength="500" name="info"></textarea><br><br>
			<button class="btn btn-success" type="submit">添加</button>
		</form>
	</div>
</body>
</html>