package bank;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Declare variables
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            PrintWriter out = response.getWriter();
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "ammu");

            String a = request.getParameter("txtname");
            String b = request.getParameter("txtpassword");

            // Prepare SQL query with placeholders
            ps = con.prepareStatement("SELECT * FROM reg WHERE u_name = ? AND password = ?");
            // Set parameter values
            ps.setString(1, a);
            ps.setString(2, b);
            // Execute query
            rs = ps.executeQuery();

            if (rs.next()) {
                RequestDispatcher rd = request.getRequestDispatcher("bankhomepage.jsp");
                rd.forward(request, response);
            } else {
                out.println("<font color=red size=18>LOGIN FAILED!!<br>");
                out.println("<a href=login.jsp>TRY AGAIN!!</a>");
            }
        } catch (ClassNotFoundException | SQLException e) {
            // Handle exceptions appropriately (log or show a user-friendly message)
            e.printStackTrace();
        } finally {
            // Close resources in a finally block to ensure they are closed even if an exception occurs
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
