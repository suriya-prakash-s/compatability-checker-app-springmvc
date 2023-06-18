<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compatability Checker</title>
</head>
<body>
	<h1 align="center">Compatability Checker</h1>
	<hr />
	<form:form action="process-form" method="get" modelAttribute="userInfo">
		<div align="center">
			<div>
				<label>Your Name:</label>
				<form:input placeholder="your name" id="your_name" path="yourName" />
				<form:errors path="yourName" />
			</div>
			<br />
			<div>
				<label>Crush Name:</label>
				<form:input placeholder="crush name" id="crush_name"
					path="crushName" />
			</div>
			<br />
			<div>
				<form:checkbox path="isAgreed"/>
				<label>I agree to terms and conditions</label>
				<form:errors path="isAgreed" />
			</div>

			<input type="submit" value="calculate" />
		</div>
	</form:form>
	<script type="text/javascript">
		function validateUserName() {
			let userName = document.getElementById("your_name").value;
			if (userName.length < 2) {
				alert("Please enter valid name");
				return false;
			} else {
				return true;
			}
		}
	</script>

</body>
</html>