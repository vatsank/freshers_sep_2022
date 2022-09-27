<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<%@ include file="header.html" %>

<c:out value="${param.message}"/>

<form action="login" method="post">

<label for="">User Name</label>
<input type="text" name="userName" required="required" />

<label for="">PassWord</label>
<input type="password" required="required" name="password"/>

<input type="submit"  value="Login"/>

</form>
</body>
</html>