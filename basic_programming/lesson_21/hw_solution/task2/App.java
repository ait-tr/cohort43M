package homework.encapsulation.task2;

public class App {
    public static void main(String[] args) {

        User user = new User("user1", "oldpassword", "user@gmail.com");
        System.out.println("Пароль: " + user.getPassword());

        user.setPassword("oldpassword", "newpass");
        user.setPassword("oldpassw", "newpass");
        user.setPassword("oldpassword", "newpasswordP123");

        System.out.println("Пароль успешно изменен! \nНовый пароль: " + user.getPassword());

    }
}
