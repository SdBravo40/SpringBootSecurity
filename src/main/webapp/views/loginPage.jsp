<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>

     <link href="webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel="stylesheet">
     <script src="webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
     <script src="webjars/jquery/3.7.1/jquery.min.js"></script>
     
     <%--  <script src="<c:url value="/js/register.js"/>" >  </script> --%>
      <script src="<c:url value="/js/sweetalert.min.js"/>" >  </script> 

</head>
<body>
   <div class="container pt-2 text-center"> 
       <h5>Welcome to Login Page! </h5>
       
   </div>
   
   <div class="container pt-2 text-center"> 
       <a href="/signup" class="btn btn-primary">Signup</a>
   </div>
</body>
</html>