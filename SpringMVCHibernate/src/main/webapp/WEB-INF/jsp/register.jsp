<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="stor" method="post" modelAttribute="bean">
student roll :<br>
<form:input path="roll"/><br>

student Name :<br>
<form:input path="name"/><br>

student course: <br>
<form:input path="course"/><br><br>

<input type="submit" value="Register">
</form:form> 

</body>
</html>