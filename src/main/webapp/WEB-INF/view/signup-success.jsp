<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup Success</title>
</head>
<body>
	<p>
		Name: <span>${userReg.name}</span>
	</p>
	<p>
		Username: <span>${userReg.userName}</span>
	</p>
	<p>
		Country <span>${userReg.country}</span>
	</p>
	<c:forEach var="hobby" items="${userReg.hobbies}">
		<p>${hobby}</p>
	</c:forEach>
	<p>
		Gender: <span>${userReg.gender}</span>
	</p>
	<p>
		Age: <span>${userReg.age}</span>
	</p>
	<p>
		Email: <span>${userReg.comsDto.email}</span>
	</p>
	<p>
		Phone: <span>${userReg.comsDto.phone}</span>
	</p>
</body>
</html>