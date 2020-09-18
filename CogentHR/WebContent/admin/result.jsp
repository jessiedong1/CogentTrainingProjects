<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
	<h1>Cogent University</h1>
	
	${employee.name}, your information 
	<p> Here are your details: </p>
	<table border = "1">
	<th>EMP ID</th> <th>NAME</th> <th>SALARY</th> <th>DEPT ID</th>
	<tr>
	<td>${employee.id}</td> <td>${employee.name} </td> <td>${employee.salary}</td> <td>${employee. deptId}</td>
	</tr>
	</table>
	<a href="index.jsp"> Return to Registration</a>
</body>
</html>