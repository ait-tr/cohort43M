package code.example2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    UserService userService;
    User user1;
    User user2;

    @BeforeEach
    public void setUp(){
        userService = new UserService();
        user1 = new User(1,"Admin","admin@company.com");
        user2 = new User(2,"Manager","manager@company.com");
        userService.addUser(user1);
        userService.addUser(user2);
    }

    @Test
    public void testAddUser(){
        User user3 = new User(3,"Ruslan","ruslan@company.com");
        userService.addUser(user3);
        assertNotNull(userService.findById(3));
    }

    @Test
    public void testRemoveUser(){
        userService.removeUser(1);
        assertNull(userService.findById(1));
    }

    @Test
    public void testRemoveUserBoolean(){
        userService.removeUser(1);

        List<User> allUsers = userService.findAll();

        assertFalse(allUsers.contains(user1));
    }

    @Test
    public void testFindById(){
        assertEquals("Manager",userService.findById(2).getName());
    }

}