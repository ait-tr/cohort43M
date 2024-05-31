package code.optional36.withOptional;

import java.util.Optional;

public class UserDemo {
    public static void main(String[] args) {
        UserRepo repo = new UserRepo();

        Integer johnId = repo.addUser(new User("John"));

        System.out.println(johnId);

        User user = repo.updateUser(1,"Bill");

        System.out.println(user);

        User user2 = repo.updateUser(2,"Robert");

        if (!user2.getName().isBlank()) {
            System.out.println(user2);
        } else {
            System.out.println("такого user не найдено");
        }


    }
}
