package controller;
import model.*;

/**
* Class that handles friends and friend container.
*/
public class FriendController
{
    private FriendContainer friendContainer;
    
    /**
     * Initialize FriendController.
     */
    public FriendController()
    {
        friendContainer = FriendContainer.getInstance();
    }
    
    /**
     * Get friend by comparing phone number.
     * @phoneNo The phone number to compare.
     */
    public Friend findFriendByPhone(String phoneNo)
    {
        return friendContainer.getFriendByPhone(phoneNo);
    }
    
    /**
     * Get friend by comparing name.
     * @name The name to compare.
     */
    public Friend findFriendByName(String name)
    {
        return friendContainer.getFriendByName(name);
    }
    
    /**
     * Make new friend and add it to container.
     * @name The name of the friend.
     * @phoneNo The phone number of the friend.
     * @address The address of the friend.
     * @postalCode The postal code of the friend.
     * @city The city of the friend.
     */
    public Friend makeFriend(String name, String phoneNo, String address, int postalCode, String city)
    {        
        Friend friend = new Friend(name, phoneNo, address, postalCode, city);
        friendContainer.addFriend(friend);
        return friend;
    }
    
    /**
     * Print a list of all friends.
     */
    public void printAllFriends()
    {
        friendContainer.printAllFriends();
    }
}
