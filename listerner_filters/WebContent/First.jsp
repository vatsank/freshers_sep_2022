<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First</title>
</head>
<body>
<c:out value="${sessionScope.details}"/>
<p>View Count</p><c:out value="${count}"/>

</body>
</html>