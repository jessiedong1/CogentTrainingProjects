<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error</title>
</head>
<body>
	<h1>Cogent University</h1>
	<%
	Object e = request.getAttribute("message");
	%>
	<%=e.toString()%>  </br>
	<a href="index.jsp"> Return to Registration</a>
	
</body>
</html>