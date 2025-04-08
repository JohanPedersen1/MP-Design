package model;



public class Loan
{
    
    private int loanNumber;
    private String borrowDate;
    private String returnDate;
    private String status;
    
    public Loan()
    {
        
    }
    
    public int getLoanNumber(){
        return loanNumber;
    }
    
    public String getBorrowDate(){
        return borrowDate;
    }
    
    public String getReturnDate(){
        return returnDate;
    }
    
    public String getStatus(){
        return status;
    }
}
