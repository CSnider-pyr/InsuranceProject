<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix ="sf" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View My Claim</title>
    
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="main.css">
    
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

 <!-- to be erased once css connection is fixed -->  
<style type="text/css">
body{
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover
}
.frosted {
     background:rgba(255,255,255, 0.75);
    padding: 20;
}
</style>  
 
</head>
<body style = "background-image: url(https://www.verdict.co.uk/wp-content/uploads/2017/08/self-driving-cars-1440x960.jpg);">
<div class = " frosted text-left">
    <div class="container">
    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdyH1-62h85KJb2mQ9ui8lG_4Jn4iw_UaEHSx16P5BaO6D2tU0" class="logo img-circle col-md-4 " alt="hands holding a family">
        <div class="col-sm-12 col-md-4  col-lg-6">
   <h1 >Assure Insurance </h1>
  <p  class = "hidden-lg-down">You're In Good Hands with Assure Insurance</p>
        </div>
    </div>
</div>
    
 <div class="container frosted mainCenter" >
        <div class="row ">
            <sf:form modelAttribute ="claim" method = "post">
            <table class="col-sm-10 col-md-6  col-lg-10 align-items-center text-center">
            <tr><th>Claim ID</th><th>Incident Date:</th><th>Incident Description:</th><th>Status</th></tr>
                <tr><td><sf:input path="id" placeholder = "Policy Number"/></td>
            <td><sf:input type= "date" path="claimDate"/></td><td>
                <sf:textarea path="claimDescription" rows="5" cols="30" /></td>
                <td><sf:input type="text" path="status"/></td></tr>
            
		    </table>
           </sf:form> 
     </div>
    </div>

</body>
</html>