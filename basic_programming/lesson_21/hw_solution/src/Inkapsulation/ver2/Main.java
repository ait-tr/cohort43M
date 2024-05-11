package Inkapsulation.ver2;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bulka", "5932005Amoc", "konsantin@gmail.com");
        System.out.println(user);
        user.changePassword("123456789", "5932005Amoc");
        System.out.println(user);





    }
}
