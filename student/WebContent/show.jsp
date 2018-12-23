<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生信息</title>
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="css/show.css"/>

</head>
<body>
	<div class="container">
		<table class="table table table-condensed">
			<tr>
				<td colspan="9">
					<a href="addStudent.jsp">添加学生</a>
				</td>
			</tr>
			<h2>学生信息表</h2>
			<tr align="center">
				<td>编号</td>
				<td>姓名</td>
				<td>学号</td>
				<td>性别</td>
				<td>电话</td>
				<td>年龄</td>
				<td>班级</td>
				<td>信息</td>
				<td>操作</td>
			</tr>
			
			<c:forEach items="${allStudent }" var="student">
			<tr align="center">
				<td>${ student.id}</td>
				<td>${ student.sname}</td>
				<td>${ student.number}</td>
				<td>${ student.sex}</td>
				<td>${ student.phone}</td>
				<td>${ student.age}</td>
				<td>${ student.sclass}</td>
				<td>${ student.info}</td>
				<td>
	
					<input class="btn btn-success btn-xs" type="button" value="编辑" onclick="window.location.href='/student/EditStudentServlet?id=${student.id }'">
					<input class="btn btn-danger btn-xs" type="button" value="删除" onclick="window.location.href='/student/DeleteStudentServlet?id=${student.id }'">
				</td>
			</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>