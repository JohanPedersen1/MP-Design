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
}
