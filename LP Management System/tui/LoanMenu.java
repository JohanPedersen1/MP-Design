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
        boolean running = true;
        while (running) 
        {
            int choice = enterInt("****** Udlånsmenu ******\n (1) Opret lån\n (0) Tilbage\n Vælg:");
            switch (choice) 
            {
                case 1:
                  loanController.createNewLoan(
                      enterInt("Skriv lånenummer"),
                      enterString("Skriv udlånsdato"),
                      enterString("Skriv returdato"));
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
    
    public int enterInt(String message)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print(message);
        
        while (!keyboard.hasNextInt()) {
            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }
        int choice = keyboard.nextInt();
        return choice;
    }
    
    public long enterLong(String message)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print(message);
        
        while (!keyboard.hasNextInt()) {
            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }
        long choice = keyboard.nextInt();
        return choice;
    }
    
    public double enterDouble(String message)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print(message);
        
        while (!keyboard.hasNextDouble()) {
            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }
        double choice = keyboard.nextInt();
        return choice;
    }
    
    public String enterString(String message)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print(message);
        
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

