<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>




</head>
<body>

<h1 align="center">YES BANK</h1>

<table border="1">


<tr>

<th>ACCOUNT NO</th>
<th>NAME</th>
<th>ADDRESS</th>
<th>MOBNO</th>
<th>EMAIL</th>
<th>DOB</th>
<th>ADHAR NO</th>
<th>AMMOUNT</th>
<!-- <th>USERNAME</th>
<th>PASSWORD</th> -->

</tr>

<tr>

<td>${l.accountno}</td> 
<td>${l.name}</td>
<td>${l.address}</td>
<td>${l.mobno}</td>
<td>${l.email}</td>
<td>${l.dob}</td>
<td>${l.adharno}</td>
<td>${l.ammount}</td>



















</tr>




































</table>

</body>
</html>