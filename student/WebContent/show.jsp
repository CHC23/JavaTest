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
	<table border="1" width="1000">
		<tr>
			<td colspan="8">
				<a href="addStudent.jsp">添加学生</a>
			</td>
		</tr>
	
		<tr align="center">
			<td>编号</td>
			<td>姓名</td>
			<td>性别</td>
			<td>电话</td>
			<td>年龄</td>
			<td>爱好</td>
			<td>信息</td>
			<td>操作</td>
		</tr>
		
		<c:forEach items="${allStudent }" var="student">
		<tr align="center">
			<td>${ student.id}</td>
			<td>${ student.sname}</td>
			<td>${ student.sex}</td>
			<td>${ student.phone}</td>
			<td>${ student.age}</td>
			<td>${ student.hobby}</td>
			<td>${ student.info}</td>
			<td><a href="#">更新</a> <a href="#">删除</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>