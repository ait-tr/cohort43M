package homework.encapsulation.task2;

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

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void setPassword(String oldPassword, String newPassword){
        if (checkPassword(oldPassword) && isPasswordSecure(newPassword)){
            this.password = newPassword;
            System.out.println("Пароль успешно изменен");
        }
        else if (!oldPassword.equals(password)) {
            System.out.println("Не удалось изменить пароль. Неправильный старый пароль.");

            }else {
            System.out.println("Ошибка изменения пароля");
        }
    }

    private boolean checkPassword(String oldPassword) {
        return oldPassword.equals(password);

        }

    private boolean isPasswordSecure(String password){
        return password.length() >= 8 && password.matches(".*\\d.*") && password.matches(".*[a-zA-Z].*");
    }
}
