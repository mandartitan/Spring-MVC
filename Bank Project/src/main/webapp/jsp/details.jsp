<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>



</head>
<body style="background-color: olive;">





<form action="">
<pre>
<h1>
ACCOUNT NO :${l.accountno}
NAME	   :${l.name}
ADDRESS	   :${l.address}
MOBNO	   :${l.mobno}
EMAIL	   :${l.email}
DOB	   :${l.dob}
ADHAR NO   :${l.adharno}
AMMOUNT    :${l.ammount}
</h1>
</pre>
</form>











<a href="withd?accountno=${l.accountno} & withd?ammount=${l.ammount}">WITHDRAW</a>

<br>
<pre></pre>

<a href="delete?accountno=${l.accountno}">DELETE</a>

<br>
<pre></pre>

<a href="deposite?accountno=${l.accountno} & deposite?ammount=${l.ammount}">DEPOSITE</a>

<br>
<pre></pre>

<a href="edit?accountno=${l.accountno}">EDIT</a> 
<br>
<pre></pre>

 

<br>
<pre></pre>


<a href="display?accountno=${l.accountno}">Display Balance</a>





















</body>
</html>