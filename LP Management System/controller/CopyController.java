package controller;
import model.*;

/**
* Class that handles Copy, LP's and LP container.
*/
public class CopyController
{
    private LPContainer lPContainer;
    
    /**
     * Initialize CopyController.
     */
    public CopyController()
    {
        lPContainer = LPContainer.getInstance();
    }
    
    /**
     * Find copy in LP container by comparing serial number.
     * @param serialNo The serial number to compare.
     */
    public Copy findCopy(int serialNo)
    {
        return lPContainer.findCopyInLP(serialNo);
    }
    
    /**
     * Create and add a copy to an LP which is added to LP's.
     * @param serialNo The serialNumber of the copy.
     * @param purchaseDate The purchase date of the copy.
     * @param purchasePrice The purchase price of the copy.
     * @param barcode The LP barcode.
     * @param title The LP title.
     * @param artist The LP artist.
     * @param publicationDate The LP publication date.
     */
    public Copy makeCopy(int serialNo, String purchaseDate, double purchasePrice, long barcode, String title, String artist, String publicationDate)
    {
        Copy copy = new Copy(serialNo, purchaseDate, purchasePrice);
        lPContainer.addCopy(copy, barcode, title, artist, publicationDate);
        return copy;
    }
    
    /**
     * Print a list of all LP's.
     */
    public void printAllLPs()
    {
        lPContainer.printAllLPs();
    }
}
