<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Location</h2>
	<form action="saveLoc" method="post">
	Id<input type="text" name="id"/>
	Code<input type="text" name="code"/>
	Name<input type="text" name="name"/>
	Type
	Urban:
	<input type="radio" name="type" value="urban"/>
	Rural:
	<input type="radio" name="type" value="rural"/>
	<input type="Submit" value="Save"/>
	</form>
	
${msg}
</body>
</html>