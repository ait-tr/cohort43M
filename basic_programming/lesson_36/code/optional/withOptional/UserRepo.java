package code.optional.withOptional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserRepo {

    private Map<Integer, User> database;
    private Integer idCounter;

    public UserRepo() {
        this.database = new HashMap<>();
        this.idCounter = 0;
    }

    public Integer addUser(User user){
        idCounter++;
        database.put(idCounter, user);
        return idCounter;
    }

    public Optional<User> findUserById(Integer id){
        return Optional.ofNullable(database.get(id));
    }

    public User updateUser(Integer id, String newUserName){
        Optional<User> userOpt = findUserById(id);

        if (userOpt.isPresent()){
            return userOpt.get();
        } else {
            return new User("");
        }

    }



}
