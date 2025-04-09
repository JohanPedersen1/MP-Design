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
}
