package ir.ac.kntu.logic;

public class Admin {

    private String username;
    private String password;

    public  Admin(){

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean verifyAdmin(String username, String password) {
        return username.equals(this.username) && password.equals(this.password);
    }
}
