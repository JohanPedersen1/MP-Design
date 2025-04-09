package controller;
import model.*;
import tui.*;

public class LoanController
{
    CopyController copyController;
    FriendController friendController;
    LoanContainer loanContainer;
    Loan l;
    LoanMenu loanMenu;
    
    public LoanController(LoanMenu loanMenu)
    {
        copyController = new CopyController();
        friendController = new FriendController();
        loanContainer = LoanContainer.getInstance();
        this.loanMenu = loanMenu;
    }
    
    public void createNewLoan(int loanNumber, String borrowDate, String returnDate)
    {
        l = new Loan(loanNumber, borrowDate, returnDate);        
        setCopy(copyController.findCopy(
            loanMenu.enterInt("Skriv lige det der serial number der.")));
        setFriend(friendController.findFriend(
            loanMenu.enterString("Skriv navnet på din ven."), 
            loanMenu.enterString("Skriv telefon nummeret på din ven.")));
        confirmLoan();
    }
    
    public void setCopy(Copy copy)
    {
        l.setCopy(copy);
    }
    
    public void setFriend(Friend friend)
    {
        l.setFriend(friend);
    }
    
    public void confirmLoan()
    {
        
    }
}
