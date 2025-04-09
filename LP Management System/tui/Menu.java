package tui;
import java.util.Scanner;
import controller.*;

/**
* Class that handles user interface and menu logic.
*/
public class Menu 
{
    private LoanController loanController;
    private CopyController copyController;
    private FriendController friendController;

    /**
     * Initialize Menu and start mainMenu.
     */
    public Menu() 
    {
        mainMenu();
    }

    /**
     * Display mainMenu options and read input from user.
     */
    public void mainMenu() 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("****** Hovedmenu ******");
        System.out.println(" (1) Lånermenu.");
        System.out.println(" (2) Se alle LP'er.");
        System.out.println(" (3) Se alle venner.");
        System.out.println(" (4) Se alle lån.");
        System.out.println(" (0) Afslut programmet.");          
        
        switch (enterInt("\n Vælg:")) 
        {
            case 1:
                loanMenu();
                break;
            case 2:
                printAllLPs();
                mainMenu();
                break;
            case 3:
                printAllFriends();
                mainMenu();
                break;
            case 4:
                printAllLoans();
                mainMenu();
                break;
            case 0:
                System.out.println("Tak for denne gang.");
                break;
            default:
                System.out.println("Fejl");
                break;
        }
    }
    
    /**
     * Display loanMenu options and read input from user.
     */
    public void loanMenu() 
    {        
            System.out.println("****** Udlånsmenu ******");
            System.out.println(" (1) Opret lån.");
            System.out.println(" (0) Tilbage til hovedmenu.");
            
            switch (enterInt("\n Vælg:")) 
            {
                case 1:
                    loanController = new LoanController(this);
                    loanController.createNewLoan(
                        enterString("Skriv udlånsdato: "),
                        enterString("Skriv returdato: "));
                    break;
                case 0:
                    mainMenu();
                    break;
                default:
                    System.out.println("Fejl");
                    break;
            }
    }
    
    /**
     * Print a list of all LP's.
     */
    public void printAllLPs()
    {
        copyController = new CopyController();
        copyController.printAllLPs();
    }
    
    /**
     * Print a list of all friends.
     */
    public void printAllFriends()
    {
        friendController = new FriendController();
        friendController.printAllFriends();
    }
    
    /**
     * Print a list of all loans.
     */
    public void printAllLoans()
    {
        loanController = new LoanController(this);
        loanController.printAllLoans();
    }
    
    /**
     * Read int input from user.
     */
    public int enterInt(String message)
    {
        System.out.print(message);        
        Scanner keyboard = new Scanner(System.in);
        
        while (!keyboard.hasNextInt()) 
        {
            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }
            
        return keyboard.nextInt();
    }
    
    /**
     * Read long input from user.
     */
    public long enterLong(String message)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print(message);
        
        while (!keyboard.hasNextLong()) {
            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }

        return keyboard.nextLong();
    }
    
    /**
     * Read double input from user.
     */
    public double enterDouble(String message)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print(message);
        
        while (!keyboard.hasNextDouble()) {
            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }
        
        return keyboard.nextDouble();
    }
    
    /**
     * Read string input from user.
     */
    public String enterString(String message)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print(message);
         
        return keyboard.next();
    }
    
    /**
     * Prompts the user for confirmation of a loan and reads the input.
     */
    public boolean enterConfirmation()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" (y) Godkend lån.");
        System.out.println(" (n) Afvis lån.");

        while(true)
        {
            String choice = keyboard.next();
            
            if (choice.equalsIgnoreCase("y"))
            {
                System.out.println("Lån godkendt.");
                return true;
            }
            else if (choice.equalsIgnoreCase("n"))
            {
                System.out.println("Lån annulleret.");
                return false;
            }
            else
            {
                System.out.println("Skriv y eller n.");
            }
        }       
    }
}

