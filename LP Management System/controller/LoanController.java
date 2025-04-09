package controller;
import model.*;

public class LoanController
{
    CopyController copyController;
    FriendController friendController;
    LoanContainer loanContainer;
    Loan l;
    
    public LoanController()
    {
        copyController = new CopyController();
        friendController = new FriendController();
        loanContainer = LoanContainer.getInstance();
    }
    
    public void createNewLoan(int loanNumber, String borrowDate, String returnDate, String status)
    {
        l = new Loan(loanNumber, borrowDate, returnDate, status);
        
        //l.setCopy(copyController.findCopy())
    }
}
