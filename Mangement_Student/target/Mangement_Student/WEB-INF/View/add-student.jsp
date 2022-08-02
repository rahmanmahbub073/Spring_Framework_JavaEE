<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

<link rel="stylesheet" type="text/css" href="/Mangement_Student/URLToReachResourcesFolder/css/add-student.css">

</head>
<body>
	<!-- create a html form where the user can enter data -->
	<div align="center">
		<h1>Add Student Form</h1>

		<%-- if we use get it shows our obj in the url <form:form action="save-student" modelAttribute="student" method="GET"> --%>
		<form:form action="save-student" modelAttribute="student"
			method="POST" >

			<!-- <label>ID :</label> -->
			<form:hidden path="id" />

			<br />

			<label>Name :</label>
			<form:input path="name" />

			<br />

			<label>Mobile :</label>
			<form:input path="mobile" />

			<br>

			<label>Country :</label>
			<form:input path="country" />

			<br>

			<input class= "button" type="submit" value="Submit">

		</form:form>
	</div>
</body>
</html>