<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="update">
<pre>
<input type="hidden" name="accountno" value="${c.accountno}">
NAME:<input type="text" name="name" value="${c.name}">
ADDRESS:<input type="text" name="address" value="${c.address}">
MOBNO:<input type="text" name="mobno" value="${c.mobno}">
DOB:<input type="date" name="dob" value="${c.dob}">
EMAIL:<input type="text" name="email" value="${c.email}">
ADHAR-NO:<input type="text" name="adharno" value="${c.adharno}">
<input type="hidden" name="ammount" value="${c.ammount}">
<button type="submit">UPDATE</button>












</pre>
</form>



</body>
</html>