<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RegistrationForm</title>
</head>
<body>
<form action="http://localhost:8081/login-page/RegistrationForm" method="post">

 <div align=center>  
 <h1>REGISTRATION FORM </h1>    
        <table>
            <tr>
                <td><label for="u_name">enter your name :</label></td>
                <td><input name="u_name"type="text"></td>
            </tr>
            <tr>
                <td><label for="password">create your Password:</label></td>
                <td><input name="password" type="password" ></td>
            </tr>
            <tr>
                <td><label for="phone">enter your Phone Number:</label></td>
                <td><input name="phone_no"type="text" ></td>
            </tr>
            <tr>
                <td><label for="mailid">enter your Email:</label></td>
                <td><input name="email"type="email" ></td>
            </tr>
            <tr>
                <td><label for="address">Address:</label></td>
                <td><input  name="address"></input></td>
            </tr>
            <tr>
                <td><input type="submit" value="Register"></td>
            </tr>
        </table>
        </div>
    </form>
</body>
</html>