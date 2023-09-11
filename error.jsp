<%@ page language="java" contentType="text/html; charset=utf-8"  
    pageEncoding="utf-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 




<html lang="en">
<head>
    <meta charset="utf-8">
<title>Error</title>
</head>
<body>
	<h1>Login Error, User Name or Password wrong, please check and login again</h1>
	<center><p>5s back to Login Page...</p></center>  
       <%response.setHeader("refresh","5;url=login.html"); %>  
   
</body>
</html>