package model;
import java.util.ArrayList;

/**
 * Singleton class that stores loans in an arraylist. 
 */
public class LoanContainer
{
    private ArrayList<Loan> loans;
    private static LoanContainer instance;
    
    /**
     * Initialize ArrayList
     */
    private LoanContainer()
    {
        loans = new ArrayList<>();           
    }
    
    /**
     * Make sure singleton is instantiated only once.
     * @return this instance
     */
    public static LoanContainer getInstance()
    {
        if(instance == null)
        {
            instance = new LoanContainer();
        }
        return instance;
    }
    
    /**
     * Loop through loans and compare loan number.
     * @param loanNumber The loan number to compare.
     * @return The loan which matches number.
     */
    public Loan getLoanByNumber(int loanNumber)
    {
        for(Loan l : loans)
        {
            if (l.getLoanNumber() == loanNumber)
            {
                return l;
            }
        }
        return null;
    }
    
    /**
     * Add a loan to loans.
     * @param l The loan to add.
     */
    public void addLoan(Loan l)
    {
        loans.add(l);
    }
    
    /**
     * Remove a loan from loans.
     * @param loanNumber Index of the loan to remove.
     */
    public void remove(int loanNumber)
    {
        for (int i = 0; i < loans.size(); i++)
        {
            if (loans.get(i).getLoanNumber() == loanNumber)
            {
                loans.remove(i);
                break;
            }
        }
    }
    
    /**
     * @return The size of loans.
     */
    public int getSize()
    {
        return loans.size();
    }
    
    /**
     * Print a list of all loan friend names and which LP title they have borrowed.
     */
    public void printAllLoans()
    {
        System.out.println("****** Lån ******");
        
        for(Loan l : loans)
        {
            System.out.print(l.getFriend().getName() + " har lånt ");
            System.out.println(LPContainer.getInstance().findLPBySerial(l.getCopy().getSerialNo()).getTitle());
            System.out.println();
        }
    }
}
