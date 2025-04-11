package tui;
import controller.*;

/**
* Class that creates friend and copy objects and adds them to containers.
*/
public class TryMe
{
    private Menu menu;
    private FriendController friendController;
    private CopyController copyController;
    private LoanController loanController;

    /**
    * Objects are created and added to containers.
    */
    public TryMe()
    {
        friendController = new FriendController();
        friendController.makeFriend("Simon", "30287596", "Ananasvej", 9000, "Aalborg");
        friendController.makeFriend("Karen", "12345678", "Mexico", 9000, "Aalborg");
        
        copyController = new CopyController();
        copyController.makeCopy(1, "01-01-2012", 9.99d, 888666L, "Dark side of the moon", "Pink Floyd", "01-05-1980");
        copyController.makeCopy(2, "28-07-2012", 15.99d, 663366L, "Jylland", "Tobias Rahim", "01-05-1980");
        
        menu = new Menu();
    }
}
