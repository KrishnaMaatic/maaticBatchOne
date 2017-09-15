<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>WELOCOME TO STUDENT LOGIN PAGE</title>
</head>
<body>
<h1> STUDENT LOGIN PAGE </h1>
<form id="form1">
	<P> Enter the user name: <input name="username" type="text" size=20></P>
	
	</form>
<form id="form2">
	<P> Enter the password: <input name="password" type="text" size=20></P>
</form>

<button onclick="output()" type ="submit">Sign In</button>
<script>
  function output(){
	  var x, y , userName, passWord;
	  x = document.getElementById("form1");
	  userName = x.elements["username"].value;
	  
	  //for getting password
	  y = document.getElementById("form2");
	  passWord = y.elements["password"].value;
	  
	  //printing it out in next page
	  document.write("Username = " +  username);
	  document.write("Password = " +  password);
	  document.write("You have been successfully logged in!");
  }
</script>
</body>
</html>