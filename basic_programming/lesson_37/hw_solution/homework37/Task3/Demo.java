package code.homework37.Task3;

public class Demo {
    public static void main(String[] args) {
        UserRepository users = new UserRepository<>();
        users.addNewUser(new User("01-00-00", "Name1", "FName1"));
        users.addNewUser(new User("02-00-00", "Name2", "FName2"));
        users.addNewUser(new User("03-00-00", "Name3", "FName3"));

        users.print();
        System.out.println(users.findById("02-00-00"));
        System.out.println(users.findById("02-02-00"));
    }
}
