package tui;
import java.util.Scanner;
import controller.*;

/**
 * Write a description of class LoanMenu here.
 *
 * @author Mogens Holm Iversen
 * @version 0.1.0 Initial draft version 
 */
public class LoanMenu {
    LoanController loanController;

    /**
     * Constructor for objects of class LoanMenu
     */
    public LoanMenu() 
    {
        loanController = new LoanController(this);
    }

    public void start() {
        loanMenu();
    }

    private void loanMenu() {
        boolean running = true;
        while (running) {
            int choice = writeLoanMenu();
            switch (choice) {
                case 1:
                  
                  break;
                case 0:
                  running = false;
                  break;
                default:
                  System.out.println("En uforklarlig fejl er sket med choice = " + choice);
                  break;
            }
        }
    }
    
    private int writeLoanMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("****** Udlånsmenu ******");
        System.out.println(" (1) Opret lån");
        System.out.println(" (0) Tilbage");
        System.out.print("\n Vælg:");
        int choice = getIntegerFromUser(keyboard);
        return choice;
    }
    
    private int getIntegerFromUser(Scanner keyboard) {
        while (!keyboard.hasNextInt()) {
            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }
        return keyboard.nextInt();
    }
    
    public int enterCopySerialNo()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Skriv lige serial number på pladen.");
        
        while (!keyboard.hasNextInt()) {
            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }
        int choice = keyboard.nextInt();
        return choice;
    }
    
    public String enterFriendName()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Skriv lige navnet på din kammerat.");
        
        String choice = keyboard.next();
        return choice;
    }
    
    public String enterFriendPhoneNo()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Skriv lige telefon nummeret på din kammerat.");
        
        String choice = keyboard.next();
        return choice;
    }
    
    public boolean enterConfirmation()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" (y) Godkend lån.");
        System.out.println(" (n) Afvis lån.");
        
        while (keyboard.hasNext()) {
            if(keyboard.next().equalsIgnoreCase("y") || keyboard.next().equalsIgnoreCase("n"))
            {
                System.out.println("Skriv y eller n, makker");
                break;
            }

            System.out.println(keyboard.next());
        }
        
        String choice = keyboard.next();
        
        if (choice.equalsIgnoreCase("y"))
        {
            return true;
        }
        else
        {
            return false;
        }       
    }
}

