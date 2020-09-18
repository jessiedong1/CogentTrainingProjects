<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<h1 align="center">Employee Registration</h1>

	<form action ="test" method = "post" align="center">
	EMP ID: <input type="text" name="id" required><br/><br/>
	EMP NAME: <input type="text" name="name" ><br/><br/>
	EMP SALARY: <input type="text" name="salary" ><br/><br/>
	DEPTARTMENT: <input type="text" name="did"><br/><br/>
<!-- 	PASSWORD: <input type="password" name="pass"/> <br/> -->
	<input type="submit" name="action" value="Create Account"/>
  	<input type="submit" name="action" value="Update Account"/>
  	<input type="submit" name="action" value="Delete Account"/>
  	<input type="submit" name="action" value="Find Account"/>
  	<input type="submit" name="action" value="Admin"/>
  	
	</form>

	
</body>
</html>


