package model;


public class Copy
{
    //// Instance varible describers for copy.
    private int serialNo;
    private String purchaseDate;
    private double purchasePrice;
    
    //Constructor to initialize instance variables.
    public Copy(int serialNo, String purchaseDate, double purchasePrice)
    {
        this.serialNo = serialNo;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
    }
    
    //get methods for instance variables.
    public int getSerialNo(){
        return serialNo;
    }

    public String getPurchaseDate(){
        return purchaseDate;

    }

    public double getPurchasePrice(){
        return purchasePrice;

    }
}
