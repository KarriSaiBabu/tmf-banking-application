<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="bank.UserDTO" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home Page</title>
</head>
<body>
    <form action="AccountServlet" method="post">
        <% 
        UserDTO user=(UserDTO)session.getAttribute("user");
        if (user == null) {
            response.sendRedirect("login.jsp");
        } else {
        %>

        <div align="center">  
            <h1>HOME </h1>    
            <P>USER INFO</P>
            <table>
                <tr>
                    <td><label for="u_name">ACCOUNT NUMBER :</label></td>
                    <td><input type="text" name="acc_num"></td>
                </tr>
                <tr>
                    <td><label for="u_name">IFSC CODE :</label></td>
                    <td><input type="text" name="ifsc"></td>
                </tr>
                <tr>
                    <td><label for="accountType">ACCOUNT TYPE:</label></td>
                    <td>
                        <select id="accountType" name="accountType">
                            <option value="Savings">SAVINGS ACCOUNT</option>
                            <option value="Checking">CURRENT ACCOUNT</option>
                            <option value="Credit">SALARY ACCOUNT</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td><label for="phone">LAST TRANSACTION DATE:</label></td>
                    <td><input type="text" name="txndate"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Add Account"></td>
                    <td><input type="submit" value="Add Money" formaction="addMoneyPage.jsp"></td>
                    <td><input type="submit" value="Send Money" formaction="sendMoneyPage.jsp"></td>
                </tr>
            </table>
        </div>

        <% } %>
    </form>
</body>
</html>
