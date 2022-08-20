<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.flyaway.Admin" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Password Change</title>
</head>
<body>
<div class="container">
        <h1>Password Change</h1>
            <%
            if (Admin.isLoggedIn) {
            %>
                <form action="PasswordChange" method="post">
                    <div>
                        <label >Email address : Riya1012@gmail.com</label>
                    </div>
                    <div >
                        <label for="inputPassword" >New Password</label>
                        <input type="password" name="passwordEntered"  placeholder="Enter a new password">
                        
                    </div>
                    <button type="submit">Change Password</button>
                </form>
            <%
            }
            else {
                out.print("You must Login first");
            }
            %>
    </div>


</body>
</html>