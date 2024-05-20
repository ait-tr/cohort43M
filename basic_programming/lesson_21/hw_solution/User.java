package Task2;

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

    public void setLogin(String login) {
        this.login = login;
    }
    public void changePassword(String oldPassword, String newPassword) {

        if (!oldPassword.equals(this.password)) {
            System.out.println("Старый пароль введен неверно.");
            return;
        }
        if (newPassword.length() < 8) {
            System.out.println("Новый пароль должен быть не меньше 8 символов");
            return;
        }
        this.password = newPassword;
        System.out.println("Пароль изменен ");
    }

    public static void main(String[] args) {
        User user = new User("user_111", "12345678", "user111@email.com");
        System.out.println("Email : " + user.getEmail());

        user.changePassword("password", "password");
        user.changePassword("12345678", "password");

    }

}

