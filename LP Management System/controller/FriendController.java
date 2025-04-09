package controller;
import model.*;

public class FriendController
{
    FriendContainer friendContainer;
    
    public FriendController()
    {
        friendContainer = FriendContainer.getInstance();
    }
    
    public Friend findFriend(String name, String phoneNo)
    {
        return friendContainer.getFriend(name, phoneNo);
    }
    
    public Friend makeFriend(String name, String phoneNo, String address, int postalCode, String city)
    {        
        Friend friend = new Friend(name, phoneNo, address, postalCode, city);
        friendContainer.addFriend(friend);
        return friend;
    }
}
