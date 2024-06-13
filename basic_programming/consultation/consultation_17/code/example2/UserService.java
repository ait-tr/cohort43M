package code.example2;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<User> users = new ArrayList<>();

    public void addUser(User user){
        users.add(user);
    }

    public void removeUser(int userId){
        users.removeIf(user -> user.getId() == userId);
    }

    public User findById(int userId){
        return users.stream()
                .filter(user -> user.getId() == userId)
                .findFirst()
                .orElse(null);
    }

    public List<User> findAll(){
        return users;
    }

}
