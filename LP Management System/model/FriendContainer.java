package model;
import java.util.ArrayList;



public class FriendContainer
{
    private ArrayList<Friend> friends;
    private static FriendContainer instance; 
    
    private FriendContainer()
    {
        
        
    }
    
    public static FriendContainer getInstance(){
        if (instance == null){
            instance = new FriendContainer();
        }
        return instance;
    }
    public Friend getFriend(String name, String phoneNo)
    {
        if (name != null && !name.isEmpty()){
            for(Friend f : friends){
                if (f.getName() == name)
                {
                    return f; 
                }
            }
        }
        else package model;
import java.util.ArrayList;



public class FriendContainer
{
    private ArrayList<Friend> friends;
    private static FriendContainer instance; 
    
    private FriendContainer()
    {
        
        
    }
    
    public static FriendContainer getInstance(){
        if (instance == null){
            instance = new FriendContainer();
        }
        return instance;
    }
    public Friend getFriend(String name, String phoneNo)
    {
        if (name != null && !name.isEmpty()){
            for(Friend f : friends){
                if (f.getName() == name)
                {
                    return f;
                }
            }
        }
        else if (phoneNo != null && !phoneNo.isEmpty()){
            for(Friend f : friends){
                if (f.getPhoneNo() == phoneNo)
                {
                    return f;
                }
            }
        }
        
        return null;
    }
}

    }
}
