<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Display all Records...</h1>
	<hr>
	<table width="100%" border="3">
		<tr>
			<th>Roll num</th>
			<th>Student Name</th>
			<th>course</th>
			<th>update</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="tab" items="${data }">
			<tr>
				<td>
					<form action="update" method="post" modelAttribute="bean"><input type="text" value=${tab.roll } name="roll" >
				</td>
				<!-- roll will be disable becouse we can't change -->
				<td><input type="text" value=${tab.name } name="name"></td>
				<td><input type="text" value=${tab.course } name="course"></td>
				<td><input type="submit" value="Update">
				</form></td>
				<td>
					<form action="delete" method="post" modelAttribute="bean">
						<input type="hidden" value=${tab.roll } name="roll"> 
						<input type="submit" value="Delete">
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>