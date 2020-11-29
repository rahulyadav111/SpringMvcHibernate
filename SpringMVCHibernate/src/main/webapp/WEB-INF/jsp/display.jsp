<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
      <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>welcome to here Display your record...</h1>
<hr>
student roll Num is :${bean.roll }<br>
student name is:     ${bean.name }<br>
student course is     ${bean.course }
<hr>

</body>
</html>