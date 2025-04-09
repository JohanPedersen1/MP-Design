package model;
import java.util.ArrayList;
import java.util.Iterator;
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
}
