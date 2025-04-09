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
    
    public void createNewLoan(int loanNumber, String borrowDate, String returnDate, String status)
    {
        l = new Loan(loanNumber, borrowDate, returnDate, status);        
        setCopy(copyController.findCopy(loanMenu.enterCopySerialNo()));
        setFriend(friendController.findFriend(loanMenu.enterFriendName(), loanMenu.enterFriendPhoneNo()));
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
