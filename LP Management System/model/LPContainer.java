package model;
import java.util.ArrayList;

/**
 * Singleton class that stores LP's in an arraylist. 
 */
public class LPContainer
{
    private static LPContainer instance;
    private ArrayList<LP>lps;
    
    /**
     * Initialize ArrayList
     */
    private LPContainer()
    {
        lps = new ArrayList<>();
    }
    
    /**
     * Make sure singleton is instantiated only once. 
     * @return this instance
     */
    public static LPContainer getInstance()
    {
        if (instance == null)
        {
            instance = new LPContainer();
        }
        
        return instance;
    }
    
    /**
     * Loop through copies in LP's and compare serialNo.
     * @param serialNo The serial number to compare.
     * @return The copy that matches or null.
     */
    public Copy findCopyInLP(int serialNo)
    {
        for(LP lp :lps)
        {
            if(lp.getCopy(serialNo) != null)
            {
                return lp.getCopy(serialNo);
            }
        }
        
        return null;
    }
    
    /**
     * Loop through copies in LP's and compare serialNo.
     * @param serialNo The serial number to compare.
     * @return The LP that matches or null.
     */
    public LP findLPBySerial(int serialNo)
    {
        for(LP lp :lps)
        {
            if(lp.getCopy(serialNo) != null)
            {
                return lp;
            }
        }
        
        return null;
    }
    
    /**
     * Add a copy to an LP which is added to LP's
     * @param copy The copy to store in LP.
     * @param barcode The LP barcode.
     * @param title The LP title.
     * @param artist The LP artist.
     * @param publicationDate The LP publication date.
     */
    public void addCopy(Copy copy, long barcode, String title, String artist, String publicationDate)
    {
        LP lp = new LP(barcode, title, artist, publicationDate);
        lp.addCopy(copy);
        lps.add(lp);
    }
    
    /**
     * Print a list of all LP artist and titles
     */
    public void printAllLPs()
    {
        System.out.println("****** LP'er ******");
        
        for(LP lp : lps)
        {
            System.out.println(lp.getArtist() + " - " + lp.getTitle());
        }
        
        System.out.println();
    }
}
