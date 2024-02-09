<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>your name is ${users.userName }</h1>
	<h1>your email is ${users.userEmail }</h1>
	<h1>your password is ${users.password } try to keep it secure</h1>

</body>
</html>