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
        
        Copy copy = copyController.findCopy(loanMenu.enterInt("Skriv serienummer."));

        if (copy == null)
        {            
            System.out.println("Kopi eksisterer ikke lad os registere den.");
            copy = copyController.makeCopy(
            loanMenu.enterInt("Skriv serienummer."),
            loanMenu.enterString("Skriv købsdato."),
            loanMenu.enterDouble("Skriv købspris."),
            loanMenu.enterLong("Skriv stregkode."),
            loanMenu.enterString("Skriv titel."),
            loanMenu.enterString("Skriv artist."),
            loanMenu.enterString("Skriv udgivelsesdato."));
        }
            
        setCopy(copy);
        
        Friend friend = friendController.findFriend(
            loanMenu.enterString("Skriv navnet på din ven."), 
            loanMenu.enterString("Skriv telefon nummeret på din ven."));
            
        if (friend == null)
        {            
            System.out.println("Ven eksisterer ikke lad os registere dem.");
            friend = friendController.makeFriend(loanMenu.enterString("Skriv navnet på din ven."),
            loanMenu.enterString("Skriv telefon nummer."),
            loanMenu.enterString("Skriv adresse."),
            loanMenu.enterInt("Skriv post kode."),
            loanMenu.enterString("Skriv by."));
        }
        
        setFriend(friend);
            
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
        loanMenu.enterConfirmation();
    }
}
