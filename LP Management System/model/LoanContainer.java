package model;
import java.util.ArrayList;

/**
 * The class LoanContainer is coded with a singleton.
 */
public class LoanContainer
{
    // An ArrayList for storing the loans from the Loan class
    private ArrayList<Loan> loans;
    // In a singleton, the instance variable is made static, which means that it belongs
    // to the class.
    private static LoanContainer instance;
    
    /**
     * A constructor for the class that initializes the instance variables
     */
    private LoanContainer()
    {
        // The contructor creates a new ArrayList with objects from the Loan class
        loans = new ArrayList<>();           
    }
    
    /**
     * A get method, that gets an instance from other classes.
     */
    public static LoanContainer getInstance(){
        if(instance == null){
            instance = new LoanContainer();
        }
        return instance;
    }
    
    public Loan getLoanByNumber(int loanNumber){
        for(Loan l : loans){
            if (l.getLoanNumber() == loanNumber)
            {
                return l;
            }
        }
        return null;
    }
    
    public void addLoan(Loan l){
        loans.add(l);
    }
    
    public void remove(int loanNumber){
        for (int i = 0; i < loans.size(); i++)
        {
            if (loans.get(i).getLoanNumber() == loanNumber)
            {
                loans.remove(i);
            }
        }
    }
}
