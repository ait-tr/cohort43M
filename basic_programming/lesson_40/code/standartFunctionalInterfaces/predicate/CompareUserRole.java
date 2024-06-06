package code.standartFunctionalInterfaces.predicate;

import java.util.function.Predicate;

public class CompareUserRole implements Predicate<UserRole> {
    @Override
    public boolean test(UserRole userRole) {
        // более сложная логика фильтрации
        return userRole.getRole().equals("admin");
    }
}
