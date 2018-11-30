<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>Hello World</title>
</head>
<body>
Hello World!<br/>
<% 
out.println("Your IP address is " + request.getRemoteAddr()); 
%>
</body>
</html>