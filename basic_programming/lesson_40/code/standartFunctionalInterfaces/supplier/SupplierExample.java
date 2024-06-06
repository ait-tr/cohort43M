package code.standartFunctionalInterfaces.supplier;

import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        Supplier<User> userFactory = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input user name: ");
            String name = scanner.nextLine();
            return new User(name);
        };

        User user1 = userFactory.get();
        User user2 = userFactory.get();

        System.out.println(user1);
        System.out.println(user2);

    }
}
