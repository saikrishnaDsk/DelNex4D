<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Student Reg Form</h1>
	<form action="saveStudent">
Rollno: <input type="text" name="rno"><br>
Sem: <input type="text" name="sem"><br>
Marks: <input type="text" name="marks"><br>
Ccode: <input type="text" name="ccode"><br>
State :<input type="text" name="address.state"> <br>
City : <input type="text" name="address.city"> <br>
dob :  <input type="date" name="dob"> <br>
	   <input type="submit"	value="Submit">

	</form>

</body>
</html>
