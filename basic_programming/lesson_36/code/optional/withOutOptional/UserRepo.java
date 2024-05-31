package code.optional.withOutOptional;

import java.util.HashMap;
import java.util.Map;

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

    public User updateUser(Integer id, String newUserName){
        User user = database.get(id);

        user.setName(newUserName);

        return user;
    }



}
