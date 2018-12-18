<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生登录</title>
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="next.css" /> 
</head>
<body>
	<div class="container">
		${message} <br>
		<form action="${pageContext.request.contextPath}/loginServlet" method="POST">
			<h2>登录</h2>
			<input type="text" name="number" id="input" class="form-control"  placeholder="用户名" required/>
			<input type="password" name="password" id="input" class="form-control" placeholder="密码" required/>
			<button class="btn btn-lg btn-success btn-block" type="submit" id="submit">登录</button>
		</form>
		<a class="visitor" href="${pageContext.request.contextPath }/toRegisterServlet">注册</a>
	</div>
</body>
</html>