package model;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class FriendTest.
 */
public class FriendTest
{
    private Friend friend;
    
    /**
     * Default constructor for test class FriendTest
     */
    public FriendTest()
    {
        
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        friend = new Friend("Bob", "12345678", "Sofiendalvej", 9000, "Aalborg");
    }

    /**
     * Test the getName method.
     */
    @Test
    public void getNameTest()
    {
        String name = friend.getName();
        
        assertEquals("Bob", name);
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
