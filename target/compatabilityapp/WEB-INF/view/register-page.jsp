<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up Here</title>
</head>
<body>
	<h2 align="center">Registration Form</h2>
	<hr />
	<form:form action="process-signup" method="post"
		modelAttribute="userReg">
		<label for="user">User:</label>
		<form:input id="user" path="name" placeholder="name" />
		<br />
		<label for="user_name">User name:</label>
		<form:input id="user_name" path="userName" placeholder="username" />
		<br />
		<label for="pswd">password:</label>
		<form:password id="pswd" path="password" placeholder="password" />
		<br />
		<label for="cntry">Country:</label>
		<form:select id="cntry" path="country">
			<form:option value="india">India</form:option>
			<form:option value="china">China</form:option>
			<form:option value="germany">Germany</form:option>
		</form:select>
		<br />
		<label>Hobbies:</label>
		Reading:<form:checkbox path="hobbies" value="reading" />
		Writing:<form:checkbox path="hobbies" value="writing" />
		Talking:<form:checkbox path="hobbies" value="talking" />
		<br />
		<label>Gender:</label>
		Male<form:radiobutton path="gender" value="male" />
		Female<form:radiobutton path="gender" value="female" />
		<br />
		<input type="submit" value="Register">
		<br />
	</form:form>

</body>
</html>