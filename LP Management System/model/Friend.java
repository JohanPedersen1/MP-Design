package model;

public class Friend
{
    private String name;
    private String phoneNo;
    private String address;
    private int postalCode;
    private String city;
    
    public Friend(String name, String phoneNo){
        this.name = name;
        this.phoneNo = phoneNo;
    }
    
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

