<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginForm</title>
</head>
<body>
<div align=center >
<h1>TMF BANK LOGIN PAGE</h1>
<h2>ENTER YOUR ID AND PASSWORD FOR LOGIN YOUR BANK ACCOUNT</h2>
    <form action="http://localhost:8081/login-page/LoginServlet" method="post">
        <table>
               <tr><td>ENTER YOUR LOGIN ID : </td>
                   <td><input type="text" name=txtname></td>
                </tr>
                <tr>
                	<td>ENTER YOUR PASSWORD : </td>
                	<td><input type="password" name=txtpassword></td>
                </tr>
                <tr>
                    <td><input type="submit" value="login"></td>
                    <td><input type="reset"></td>
                </tr>
       </table>
      </form>
</div>
</body>
</html>
