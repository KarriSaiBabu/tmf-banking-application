import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AccountServlet")
public class bankhomepage extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acc_num = request.getParameter("acc_num");
        String ifsc = request.getParameter("ifsc");
        String accountType = request.getParameter("accountType");
        String txndate = request.getParameter("txndate");
        double balance = 0.0; // Initial balance

        // You can add validation and error handling here

        // Create an Account object
        bankhomedao account = new bankhomedao();
        account.setAcc_num(acc_num);
        account.setIfsc(ifsc);
        account.setAccountType(accountType);
        // Assuming txndate is a string, convert it to Date or use a suitable date format
        Object date = null;
        account.setLasttxndate(date);
        account.setBalance(balance);

        // Store the account in the database
        // For simplicity, you can use a DAO (Data Access Object) class to handle database operations
        bankhomedao.addAccount(account);

        // Forward to a success page or display a success message
        response.sendRedirect("success.jsp");
    }
}
