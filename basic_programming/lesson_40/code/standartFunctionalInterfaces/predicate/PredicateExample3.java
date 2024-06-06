package code.standartFunctionalInterfaces.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample3 {
    public static void main(String[] args) {

        List<UserRole> users = new ArrayList<>();

        users.add(new UserRole("Alex", "admin"));
        users.add(new UserRole("Alex1", "member"));
        users.add(new UserRole("Alex2", "admin"));
        users.add(new UserRole("Alex3", "admin"));
        users.add(new UserRole("Alex4", "user"));
        users.add(new UserRole("Alex5", "admin"));
        users.add(new UserRole("Alex6", "member"));


        // сделаем выборку user с ролью admin

//        CompareUserRole myPredicate = new CompareUserRole();
//        List<UserRole> admins = process(users, myPredicate);


        List<UserRole> admins = process(users, user -> user.getRole().equals("admin"));
        System.out.println(admins);

        List<UserRole> members = process(users, user -> user.getRole().equals("member"));
        System.out.println(members);



    }

    public static List<UserRole> process(List<UserRole> users, Predicate<UserRole> predicate){
        List<UserRole> filteredResult = new ArrayList<>();

        for (UserRole currentUser : users){
            if (predicate.test(currentUser)) {
                filteredResult.add(currentUser);
            }
        }

        return filteredResult;
    }
}
