package controller;
import model.*;
import tui.*;

/**
* Class that handles loans and loan container.
*/
public class LoanController
{
    private CopyController copyController;
    private FriendController friendController;
    private LoanContainer loanContainer;
    private Loan loan;
    private Menu menu;
    
    /**
     * Initialize LoanController.
     * @param menu The menu object that controls user interface.
     */
    public LoanController(Menu menu)
    {        
        loanContainer = LoanContainer.getInstance();
        this.menu = menu;
    }
    
    /**
     * Make new loan and assign which friend is lending and which copy is lended.
     * @param borrowDate The date which copy is borrowed.
     * @param returnDate The date which copy must be returned.
     */
    public void createNewLoan(String borrowDate, String returnDate)
    {
        loan = new Loan(loanContainer.getSize(), borrowDate, returnDate);               
        setCopy();        
        setFriend();          
        confirmLoan();
    }
    
    /**
     * Set copy of loan, if copy cannot be found in container then user has to supply information.
     */
    public void setCopy()
    {
        copyController = new CopyController();
        Copy copy = copyController.findCopy(menu.enterInt("Skriv serienummer."));

        if (copy == null)
        {            
            System.out.println("Kopi eksisterer ikke, lad os registere den.");
            copy = copyController.makeCopy(
            menu.enterInt("Skriv serienummer: "),
            menu.enterString("Skriv købsdato: "),
            menu.enterDouble("Skriv købspris: "),
            menu.enterLong("Skriv stregkode: "),
            menu.enterString("Skriv titel: "),
            menu.enterString("Skriv artist: "),
            menu.enterString("Skriv udgivelsesdato: "));
        }            
        
        loan.setCopy(copy);
    }
    
    /**
     * Set friend of loan, if friend cannot be found in container then user has to supply information.
     */
    public void setFriend()
    {
        friendController = new FriendController();               
        Friend friend = friendController.findFriendByPhone(menu.enterString("Skriv telefon nummeret på din ven: "));
        
        if (friend == null)
        {            
            System.out.println("Ven eksisterer ikke, lad os registere dem.");
            friend = friendController.makeFriend(
            menu.enterString("Skriv navnet på din ven: "),
            menu.enterString("Skriv telefon nummer: "),
            menu.enterString("Skriv adresse: "),
            menu.enterInt("Skriv post kode: "),
            menu.enterString("Skriv by: "));
        }
        
        loan.setFriend(friend);
    }
    
    /**
     * Prompts the user to confirm loan and if they accept the loan is added to container.
     */
    public void confirmLoan()
    {
        if (menu.enterConfirmation())
        {
            loan.setStatus("Loaned");
            loanContainer.addLoan(loan);
        }
        
        menu.mainMenu();
    }
    
    /**
     * Print a list of all loans.
     */
    public void printAllLoans()
    {
        loanContainer.printAllLoans();
    }
}
