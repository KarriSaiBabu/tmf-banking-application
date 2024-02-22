package bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class bankdao {

	public boolean insertUserDTO(UserDTO user) throws SQLException  {
		try (Connection connection = DBConnection.getConnection()){
			String sql = "INSERT INTO reg (u_name, password, phone_no, email,address) VALUES (?, ?, ?, ?, ?)";
		try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, user.getU_name() );
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3,user.getPhone_no());
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setString(5, user.getAddress());

            int rowsAffected=preparedStatement.executeUpdate();
            return rowsAffected>0;
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
public UserDTO getUserDetails(String username) {
		
		try (Connection connection = DBConnection.getConnection()) {
            String query = "select *from user_info where username=?";
            
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, username);
     //           preparedStatement.setString(2, password);
                
                ResultSet rs=preparedStatement.executeQuery();
                if(rs.next()) {
                	UserDTO resUser= new UserDTO();
                	resUser.setu_name(rs.getString("u_name"));
                	resUser.setPassword(rs.getString("password"));
                	resUser.setPhone_no(rs.getString("phone_no"));
                	resUser.setEmail(rs.getString("email"));
                	resUser.setAddress(rs.getString("address"));
                	return resUser;
                }
            }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}

