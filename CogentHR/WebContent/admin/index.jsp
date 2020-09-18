<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<h1>Employee Registration</h1>

	<form action ="../test" method = "post">
	EMP ID: <input type="text" name="id" value=${employee.id}><br/>
	EMP NAME: <input type="text" name="name" value=${employee.name}><br/>
	EMP SALARY: <input type="text" name="salary" value=${employee.salary}><br/>
	DEPT ID: <input type="text" name="did" value=${employee.dept}><br/>
	<input type="submit" name="action" value="Insert"/>
  	<input type="submit" name="action" value="Update"/>
  	<input type="submit" name="action" value="Delete"/>
  	<input type="submit" name="action" value="Find"/>
	</form>

	
</body>
</html>


