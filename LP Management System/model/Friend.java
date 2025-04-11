package model;

/**
* Class that represents a friend.
*/
public class Friend
{   
    private String name;
    private String phoneNo;
    private String address;
    private int postalCode;
    private String city;
    
    /**
     * Initialize Friend.
     */
    public Friend(String name, String phoneNo, String address, int postalCode, String city)
    {
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
    }
    
    /**
     * @return The name.
     */
    public String getName()
    {
        return name;       
    }
    
    /**
     * @return The phone number.
     */
    public String getPhoneNo()
    {
        return phoneNo;
    }
    
    /**
     * @return The address.
     */
    public String getAddress()
    {
        return address;
    }
    
    /**
     * @return The postal code.
     */
    public int getPostalCode()
    {
        return postalCode;
    }
    
    /**
     * @return The city.
     */
    public String getCity()
    {
        return city;
    }
}

