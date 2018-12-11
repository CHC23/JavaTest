<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>http请求</title>
</head>
<body>
	<form action="/ServletStudy/ServletTest1" method="post">
	用户名：<input name="user" type="text" ><br>
	密      码 ：<input name="pwd" type="password"><br>
	<input type="submit" value="查询提交" >
	</form>
</body>
</html>