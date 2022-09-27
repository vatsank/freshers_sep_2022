<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Second JSP</title>
</head>
<body>
<p>UserName :${userName}</p>


<%
out.println(session.getAttribute("userName"));
out.println(application.getAttribute("designer"));
%>
<hr/>
<p>Designed By</p>${designer}

</body>
</html>