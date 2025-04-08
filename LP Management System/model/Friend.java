package model;

public class Friend
{
    
    // Instance varible describers for Friend
    private String name;
    private String phoneNo;
    private String address;
    private int postalCode;
    private String city;
    
    //Constructor to initialize instance variables.
    public Friend(String name, String phoneNo){
        this.name = name;
        this.phoneNo = phoneNo;
    }
    
    //get methods for instance variables.
    public String getName(){
    return name;
        
    }
    
    public String getPhoneNo(){
        return phoneNo;
    }
    
    public String getAddress(){
        return address;
    }
    
    public int getPostalCode(){
        return postalCode;
    }
    
    public String getCity(){
        return city;
    }
}

