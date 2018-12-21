<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="UpdateStudentServlet" method="GET">
		<input type="hidden" name="id" value="${student.id}">
		姓名：<input type="text" name="sname" value="${student.sname}"><br><br>
		学号：<input type="text" name="number" value="${student.number}"><br><br>
		<!--密码：<input type="text" name="password"  value="${student.sname}"><br><br>-->
		性别：<input type="radio" name="sex" value="男" <c:if test="${student.sex=='男' }">checked</c:if>>男
			<input type="radio" name="sex" value="女" <c:if test="${student.sex=='女' }">checked</c:if>>女<br><br>
		电话：<input type="text" name="phone" value="${student.phone}"><br><br>
		年龄：<input type="text" name="age" value="${student.age}"><br><br>
		班级：<input type="text" name="sclass" value="${student.sclass}"><br><br>
		信息：<textarea rows="6" cols="22" maxlength="500" name="info">${student.info}</textarea><br><br>
		<button type="submit">更新</button>
	</form>
	
</body>
</html>