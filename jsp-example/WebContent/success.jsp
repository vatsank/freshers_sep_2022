<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sucess</title>
</head>
<body>
<%@ include file="header.html" %>

<c:if test="${isLogged eq 'yes' }">
<h2>Login Success</h2>
<p>UserName:${userName}</p>

<%
out.println(session.getAttribute("userName"));
out.println(application.getAttribute("designer"));
%>
<a href="first.jsp">Next</a>
</c:if>
<c:if test="${!(isLogged eq 'yes' )}">
<jsp:forward page="login.jsp">
<jsp:param value="Should login" name="message"/>
</jsp:forward>
</c:if>
</body>
</html>

