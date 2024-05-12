package homework_user_parol;

public class User {
    private String login;
    private String password;
    private String email;

    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean changePassword(String oldPassword, String newPassword){
        if (password != oldPassword){
            System.out.println("Password is incorrect");
            return false;
        }
        if (!isValidPassword(newPassword)){
            System.out.println("New Password is not comply with the rules");
            return false;
        }
        this.password = newPassword;
        System.out.println("Password changed");
        return true;
    }
    private boolean isValidPassword( String password){
        return password.length() >= 6 &&
        password.matches(".*[A-Z].*");


    }
}
