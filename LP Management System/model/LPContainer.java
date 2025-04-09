package model;
import java.util.ArrayList;

/**
 * This class called LP Container shows a singleton 
 */
public class LPContainer
{
    private static LPContainer instance;
    private ArrayList<LP>lps;
    /**
     * Creator has an ArrayList
     */
    private LPContainer()
    {
        lps = new ArrayList<>();
    }
    
    /**
     * Add a getMethod 
     * @return instance
     */
    public static LPContainer getInstance(){
        if (instance == null){
            instance = new LPContainer();
        }
        return instance;
    }
    
    public Copy findCopyInLP(int serialNo){
        for(LP p :lps){
            if(p.getCopy(serialNo) != null){
                return p.getCopy(serialNo);
            }
        }
        return null;
    }
    
    public void addCopy(Copy copy, long barcode, String title, String artist, String publicationDate)
    {
        LP lp = new LP(barcode, title, artist, publicationDate);
        lp.addCopy(copy);
        lps.add(lp);
    }
}
