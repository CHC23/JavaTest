<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<link  rel="stylesheet" href="css/show.css" />
</head>
<body>
	<div class="container">
		<table class="table table-bordered table-striped">
			<tr>
				<td colspan="9">
					<a href="addStudent.jsp">添加学生</a>
				</td>
			</tr>
		
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
					<button class="btn btn-success">编辑</a></button>
					<button class="btn btn-danger">删除</a></button>
				</td>
			</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>