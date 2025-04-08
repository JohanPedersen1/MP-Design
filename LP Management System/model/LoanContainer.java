package model;
import java.util.ArrayList;
import java.util.Iterator;

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
        loan = new ArrayList<>();           
    }
    
    /**
     * A get method, that gets an instance from other classes.
     */
    public static LoanContainer getInstance(){
        instance = instance;
        if(instance == null){
            instance = new LoanContainer();
        }
        return instance;
    }
    
    public ArrayList<Loan> getLoanByNumber(){
        for(Loan loan : loans){
            return new ArrayList<>(loans);
        }   
    }
    
    public boolean addLoan(Loan l){
        return loans.add(loan);
    }
    
    public boolean addLoan(Loan l){
        Loan conflict = findLoanByNumber(loan.getLoanNumber());
        boolean res = false;
        if(conflict == null){
            loans.add(loan);
            res = true;
            
            loan.setNo(nextNo);
            nextNo++;
        }
        return res;
    }
    
    public Loan findLoanByNumber(int loanNumber){
        Loan res = null;
        Iterator<Loan> lit = loans.iterator();
        while(lit.hasNext() && res == null){
            Loan currLoan = lit.next();
            if(currLoan.getLoanNumber()= loanNumber){
                res = currLoan;
            }
        }
        return res;
    }
    
    public Boolean remove(Loan loan){
        return loans.remove(loan);
    }
}
