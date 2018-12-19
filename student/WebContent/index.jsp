<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生登录</title>

<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="css/login.css" /> 
</head>
<body>
	<div class="container">
		<h3>请登录</h3>
		<form action="${pageContext.request.contextPath}/StudentLoginServlet" method="GET" class="form-horizontal">			
					<input type="text" name="number" placeholder="请输入学号" class="form-control" id="input">
					<input type="password" name=password placeholder="请输入密码" class="form-control">
			     <button type="submit" class="btn btn-success btn-block" id="submit">登录</button>
		</form>
	</div>
</body>
</html>