<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Filters and Listeners</title>
</head>
<body>
<h1>Using Filters and Listeners</h1>
<c:out value="${sessionScope.details}"></c:out>

<c:remove var="details" scope="session"/>

<p>View Count</p><c:out value="${count}"/>

<a href="First.jsp">Next</a>
</body>
</html>