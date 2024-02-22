package bank;
public class UserDTO {
		  
		  
		  private String u_name;
		  private String password;
		  private String phone_no;
		  private String email;
		  private String address;
		
		
		  
		public UserDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		

		public UserDTO( String u_name, String password, String phone_no,
				String email, String address) {
			super();
			
			this.u_name = u_name;
			this.password = password;
			this.phone_no = phone_no;
			this.email = email;
			this.address = address;
		}
		
		public String getPhone_no() {
			return phone_no;
		}



		public void setPhone_no(String phone_no) {
			this.phone_no = phone_no;
		}



		public String getU_name() {
			return u_name;
		}
		public void setUsername(String username, String u_name) {
			this.u_name = u_name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}

		public static String insert(Login login) {
			// TODO Auto-generated method stub
			return null;
		}



		public void setu_name(String string) {
			// TODO Auto-generated method stub
			
		}

	
		  
		  
}