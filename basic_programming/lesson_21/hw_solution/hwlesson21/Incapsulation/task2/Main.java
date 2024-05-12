package hwlesson21.Incapsulation.task2;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alisa", "password123", "alise@gmail.com");
        System.out.println(user1.getLogin());
        System.out.println(user1.changePassword("password123"));
        System.out.println(user1.changePassword("password123"));

    }
}
