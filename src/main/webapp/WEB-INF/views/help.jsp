<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% String name = (String) request.getAttribute("name"); 
	LocalDateTime time = (LocalDateTime) request.getAttribute("time");
%>
<h3> Name is <%= name %> </h3>
<h3> Time is <%= time %> </h3>

</body>
</html>