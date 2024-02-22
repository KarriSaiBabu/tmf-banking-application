package bank;

public class Login {
    private String u_name;
    private String password;
    private String phone_no;
    private String email;
    private String address;

    public Login(String u_name, String password, String email, String phone_no, String address) {
        this.u_name = u_name;
        this.password = password;
        this.phone_no = phone_no;
        this.email = email;
        this.address = address;
    }

    public String getU_name() {
        return u_name;
    }

    public String getPassword() {
        return password;
    }
    public String getPhone_num() {
        return phone_no;
    }

    public String getMail_id() {
        return email;
    }

    

    public String getAddress() {
        return address;
    }
}
