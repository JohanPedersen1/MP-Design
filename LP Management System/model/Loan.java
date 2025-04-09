package model;

public class Loan
{
    // Instance varible describers for loan
    private int loanNumber;
    private String borrowDate;
    private String returnDate;
    private String status;
    private Friend friend;
    private Copy copy;
    
    //Constructor to initialize instance variables.
    public Loan(int loanNumber, String borrowDate, String returnDate, String status)
    {
        this.loanNumber = loanNumber;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.status = status;
    }
    
    //get methods for Instance variables
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
    
    public void setFriend(Friend friend)
    {
        this.friend = friend;
    }
    
    public void setCopy(Copy copy)
    {
        this.copy = copy;
    }
}
