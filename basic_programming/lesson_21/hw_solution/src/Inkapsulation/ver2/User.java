package Inkapsulation.ver2;

public class User {
    private String login;
    private String  password;
    private String email;

    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String  password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password=" + password +
                ", email='" + email + '\'' +
                '}';
    }

    public boolean changePassword(String newPassword, String oldPassword) {
        if (oldPassword.equals(password)){
            if (!newPassword.contains("/")&& !newPassword.contains("$") && newPassword.length() > 8){
                password = newPassword;
                return true;
            }else {
                System.out.println("Ваш пароль не подходит");
                return false;
            }
        } else{
            System.out.println("Пароль не верный");
            return false;
        }
    }
}
