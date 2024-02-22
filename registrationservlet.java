import java.io.IOException;
import java.sql.SQLException;

import bank.UserDTO;
import bank.bankdao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationForm")
public class RegistrationForm extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String u_name = request.getParameter("u_name");
        String password = request.getParameter("password");
        String phone_no = request.getParameter("phone_no");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
       UserDTO user = new  UserDTO(u_name,password,phone_no,email,address);
        bankdao userDAO= new bankdao();
        try {
			if(userDAO.insertUserDTO(user)) {
				response.sendRedirect("login.jsp");
				
			}else {
				response.sendRedirect("registration.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         }
}
