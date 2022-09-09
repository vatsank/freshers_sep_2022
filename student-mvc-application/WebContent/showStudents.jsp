<%@ page language="java" import="java.util.*,com.training.model.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student List</title>
</head>
<body>
<h1>Student List</h1>

<%
   List<Student> list = 
          ( List<Student>)request.getAttribute("list");

  for(Student eachStudent:list){
	  out.println(eachStudent.getRollNumber());
	  out.println(eachStudent.getFirstName());
	  out.println(eachStudent.getMarkScored());
	  out.println(eachStudent.getDateOfBirth());
  }

%>

</body>
</html>