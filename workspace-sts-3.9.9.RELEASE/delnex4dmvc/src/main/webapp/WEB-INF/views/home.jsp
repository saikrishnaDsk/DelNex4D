<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
</head>
<body>
<h1>
Hello world!  
</h1>


<form action="hello">
Username: <input type="text" name="uname">
Password: <input type="password" name="pass">
Address:  <input type="text" name="addr"> 
<input type="submit" value="hello">
</form>


<P>  WELCOME TO MVC ${myvar}  </P>
</body>
</html>