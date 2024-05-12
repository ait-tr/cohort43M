package hwlesson21.Incapsulation.task2;

import java.util.Scanner;

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

    private String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }


    private void setPassword(String password) {
        this.password = password;
    }

    public String changePassword(String currentPassword){
        if (currentPassword.equals(getPassword())){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter new password: ");
            setPassword(scanner.nextLine());
            return "Your password was successfully changed";
        }
        else {
            return "Wrong password";
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "Login='" + login + '\'' +
                ",Password='" + password + '\'' +
                ",Email='" + email + '\'' +
                '}';
    }
}
