package homework_user_parol;

public class UserApp {
    public static void main(String[] args) {
        User user = new User("Smith","123ASD0", "smith@gmail.com");

        System.out.println("Login: " + user.getLogin());
        System.out.println("Email : " + user.getEmail());

        user.changePassword("123ASD0", "FRT1");
        user.changePassword("123ASD9", "ERTYUI");
        user.changePassword("123ASD0","12A4567");
    }
}
