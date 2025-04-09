package controller;
import model.*;

public class CopyController
{
    LPContainer lPContainer;
    
    public CopyController()
    {
        lPContainer = LPContainer.getInstance();
    }
    
    public Copy findCopy(int serialNo)
    {
        return lPContainer.findCopyInLP(serialNo);
    }
    
    public Copy makeCopy(int serialNo, String purchaseDate, double purchasePrice, long barcode, String title, String artist, String publicationDate)
    {
        Copy copy = new Copy(serialNo, purchaseDate, purchasePrice);
        lPContainer.addCopy(copy, barcode, title, artist, publicationDate);
        return copy;
    }
}
