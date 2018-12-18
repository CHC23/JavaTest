<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生注册</title>
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="next.css" /> 
</head>
<body>
	<div class="container">
		<form action="${pageContext.request.contextPath }/registerServlet" method="POST">
		<h2>请输入信息</h2>
			<input type="text" name="number" id="input" class="form-control"  placeholder="请输入学号" required>
			<input type="text" name="password" id="input" class="form-control"  placeholder="请输入密码" required>
			<input type="text" name="name" id="input" class="form-control"  placeholder="请输入姓名" required>
			<input type="text" name="age" id="input" class="form-control"  placeholder="请输入年龄" required>
			<input type="text" name="score" id="input" class="form-control"  placeholder="请输入成绩" required>
			<input type="text" name="sex" id="input" class="form-control"  placeholder="请输入性别" required>
			<button class="btn btn-lg btn-success btn-block" type="submit" id="submit">完成注册</button>
		</form>
	</div>
</body>
</html>