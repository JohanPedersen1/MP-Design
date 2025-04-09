package model;
import java.util.ArrayList;

/**
 * Singleton class that stores loans in an arraylist. 
 */
public class FriendContainer
{
    private ArrayList<Friend> friends;
    private static FriendContainer instance; 
    
    /**
     * Initialize ArrayList
     */
    private FriendContainer()
    {
        friends = new ArrayList<>();
    }
    
    /**
     * Make sure singleton is instantiated only once.
     * @return this instance
     */
    public static FriendContainer getInstance()
    {
        if (instance == null){
            instance = new FriendContainer();
        }
        return instance;
    }
    
    /**
     * Add friend to friends.
     * @param friend The friend to add.
     */
    public void addFriend(Friend friend)
    {
        friends.add(friend);
    }
    
    /**
     * Get friend by comparing phone number.
     * @phoneNo The phone number to compare.
     */
    public Friend getFriendByPhone(String phoneNo)
    {                
        if (phoneNo != null)
        {
            for(Friend f : friends)
            {
                if (f.getPhoneNo().equals(phoneNo))
                {
                    return f;
                }
            }
        }
        
        return null;
    }
    
    /**
     * Get friend by comparing name.
     * @name The name to compare.
     */
    public Friend getFriendByName(String name)
    {                
        if (name != null)
        {
            for(Friend f : friends)
            {
                if (f.getName().equals(name))
                {
                    return f;
                }
            }
        }
        
        return null;
    }
    
    /**
     * Print a list of all friends.
     */
    public void printAllFriends()
    {
        System.out.println("****** Venner ******");
        
        for(Friend f : friends)
        {
            System.out.println(f.getName());
        }
        
        System.out.println();
    }
}