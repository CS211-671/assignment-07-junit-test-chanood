package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {
    UserList users;
    @BeforeEach
    void init() {
        users = new UserList();
        users.addUser("Toon1", "Tr");
        users.addUser("Toon2", "Tr");
        users.addUser("Toon3", "Tr");
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        // TODO: find one of them
        User user = users.findUserByUsername("Toon1");
        // TODO: assert that UserList found User
         String expected = "Toon1";
         String actual = user.getUsername();
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        // TODO: change password of one user
        users.changePassword("Toon1","Tr","Tr1");
        String expected = "Tr1";
        User actual = users.findUserByUsername("Toon1");
        // TODO: assert that user can change password
         assertTrue(actual.validatePassword("Tr1"));
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        // TODO: call login() with correct username and password
        String actual = users.login("Toon1", "Tr").getUsername();
        String expected = users.findUserByUsername("Toon1").getUsername();
        // TODO: assert that User object is found
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        // TODO: call login() with incorrect username or incorrect password
        User actual = users.login("Toon1", "Tr2");
        // TODO: assert that the method return null
         assertNull(actual);
    }

}