package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {


    @Test
    @DisplayName("Password should not store in plain text")
    public void testPasswordIsNotStoreInPlainText() {
        User user = new User("user01", "plain-p@ssw0rd");
        String actual = user.getPassword();
        String unexpected = "plain-p@ssw0rd";
        assertNotEquals(unexpected, actual);
    }

    @Test
    @DisplayName("Password should be verified by plain text")
    public void testPasswordShouldBeVerified() {
        User user = new User("user01", "plain-p@ssw0rd");
        boolean actual = user.validatePassword("plain-p@ssw0rd");
        assertTrue(actual);
    }

    @Test
    @DisplayName("Username the stored are the same as in the file")
    public void TestIsUsername() {
        User user = new User("user01", "plain-p@ssw0rd");
        assertEquals("user01", user.getUsername());
    }

    @Test
    @DisplayName("Is password is work")
    public void TestValidatePassword() {
        User user = new User("user01", "plain-p@ssw0rd");
        assertTrue(user.validatePassword("plain-p@ssw0rd"));
    }

    @Test
    @DisplayName("Test setpassword")
    public void TestSetPassword() {
        User user = new User("user01", "plain-p@ssw0rd");
        user.setPassword("plain-p@ssw0rd1");
        assertTrue(user.validatePassword("plain-p@ssw0rd1"));
    }

}