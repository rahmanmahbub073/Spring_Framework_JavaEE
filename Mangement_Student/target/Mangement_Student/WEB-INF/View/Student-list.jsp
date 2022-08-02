<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/Mangement_Student/URLToReachResourcesFolder/css/my-style-sheet.css">

</head>
<body class="myFonts">
	<h1 align="center">Student Management Project</h1>
	<div align="center" class="container">
		<form action="showAddStudent" align="left">
			<input class="btn btn-outline-primary" type="submit" value="Add">
			
		</form>
		<br>
		<table border="1" class="table table-hover">
			<thead>
				<tr>
					<td>Id</td>
					<td>Name</td>
					<td>Mobile</td>
					<td>Country</td>
				</tr>
			</thead>

			<c:forEach var="student" items="${students}">
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.mobile}</td>
					<td>${student.country}</td>
					<!-- <td><a href="/Mangement_Student/updateStudent">Update</a></td> -->
					<td><a href="/Mangement_Student/updateStudent?userId=${student.id}">Update</a></td>
					<td><a href="/Mangement_Student/deleteStudent?userId=${student.id}" onclick="if (!(confirm('Are sure you want to delete?'))) return false">Delete</a></td>
				</tr>
			</c:forEach>

		</table>
		
		<!-- <img alt="MySister" src="/Mangement_Student/URLToReachResourcesFolder/images/MySis.jpg"> -->
	</div>
	<!-- <i>Student Data Coming Soon....</i> -->
	<!-- ModelAttribute: students -->
</body>
</html>