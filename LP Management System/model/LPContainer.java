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
    public LPContainer()
    {
        ArrayList<String>list = new ArrayList <>();
    }
    
    /**
     * Add a getMethod 
     * @return instance
     */
    public LPContainer getInstance(){
        if (instance == null){
            instance = new LPContainer();
        }
        return instance;
    }
    
    public LP findCopyInLP(int serialNo){
        for(LP p :lps){
            if(p.getCopy(serialNo).getSerialNo() == serialNo){
                return p;
            }
        }
        return null;
    }
}
