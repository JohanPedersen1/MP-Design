package model;

/**
* Class that represents a copy of an LP.
*/
public class Copy
{
    private int serialNo;
    private String purchaseDate;
    private double purchasePrice;
    
    /**
     * Initialize Copy.
     */
    public Copy(int serialNo, String purchaseDate, double purchasePrice)
    {
        this.serialNo = serialNo;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
    }
    
    /**
     * @return The serial number.
     */
    public int getSerialNo()
    {
        return serialNo;
    }

    /**
     * @return The purchase date.
     */
    public String getPurchaseDate()
    {
        return purchaseDate;
    }

    /**
     * @return The purchase price.
     */
    public double getPurchasePrice()
    {
        return purchasePrice;
    }
}
