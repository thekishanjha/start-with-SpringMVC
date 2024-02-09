<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
	<h1>This is home page</h1>
	<h1>Called by home controller</h1>
	<h1> /home</h1>
	
	<% String name = (String) request.getAttribute("name"); %>
	
	<h3> Name is <%= name %> </h3>
	
	<% List<String> frnd = (List<String>) request.getAttribute("f"); %>
	
	<%
		for(String s: frnd){
	%>
		<h2><%= s %></h2>
	<%
		}
	%>

</body>
</html>