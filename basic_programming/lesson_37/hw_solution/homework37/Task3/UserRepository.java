package code.homework37.Task3;


import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class UserRepository<T> {
    Set<User> users;

    public UserRepository() {
        this.users = new HashSet<>();
    }
    public Optional<User> findById(String id){
        User foundedUser = null;
        for (User user: users){
            if (user.getId().equals(id)){
                foundedUser = user;
            }
        }
        return Optional.ofNullable(foundedUser);
    }

    public Optional<User> addNewUser(User user){
        users.add(user);
        return Optional.ofNullable(user);
    }

    public void print(){
        for (User user: users){
            System.out.println(user);
        }
    }
}
