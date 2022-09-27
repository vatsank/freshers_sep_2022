<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First JSP</title>
</head>
<body>
 <%@ include file="header.html" %>
 
<p>UserName :${userName}</p>

<a href="second.jsp">Next</a>
<%
session.invalidate();
%>

<hr/>
<p>Designed By</p>${designer}

</body>
</html>