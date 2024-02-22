import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class bankhomedao {
    private static final String URL = "jdbc:mysql://your_database_url";
    private static final String USER = "your_database_user";
    private static final String PASSWORD = "your_database_password";

    private String acc_num;
    private String ifsc;
    private String accountType;
    private double balance;
    private Object lasttxndate;

    public static void addAccount(bankhomedao accounts) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "INSERT INTO accounts (acc_num, ifsc, account_type, balance, txndate) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, accounts.getAcc_num());
                preparedStatement.setString(2, accounts.getIfsc());
                preparedStatement.setString(3, accounts.getAccountType());
                preparedStatement.setDouble(4, accounts.getBalance());
                preparedStatement.setObject(5, accounts.getLasttxndate());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Implement getters and setters for the fields (acc_num, ifsc, accountType, balance, lasttxndate)

    private double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	private String getAccountType() {
		// TODO Auto-generated method stub
		return null;
	}

	// Example:
    public String getAcc_num() {
        return acc_num;
    }

    public void setAcc_num(String acc_num) {
        this.acc_num = acc_num;
    }

    public String getIfsc() {
        return ifsc;
    }

   
    // Implement similar methods for other fields...

    // Getter and Setter for lasttxndate
    public Object getLasttxndate() {
        return lasttxndate;
    }

    public void setLasttxndate(Object lasttxndate) {
        this.lasttxndate = lasttxndate;
    }

	public void setAccountType(String accountType2) {
		// TODO Auto-generated method stub
		
	}

	public void setBalance(double balance2) {
		// TODO Auto-generated method stub
		
	}

	public void setIfsc(String ifsc2) {
		// TODO Auto-generated method stub
		
	}
}
