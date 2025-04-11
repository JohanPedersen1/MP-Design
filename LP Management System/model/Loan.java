package model;

/**
* Class that represents a loan.
*/
public class Loan
{
    private int loanNumber;
    private String borrowDate;
    private String returnDate;
    private String status;
    private Friend friend;
    private Copy copy;
    
    /**
     * Initialize Loan.
     */
    public Loan(int loanNumber, String borrowDate, String returnDate)
    {
        this.loanNumber = loanNumber;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }
    
    /**
     * @return The loan number.
     */
    public int getLoanNumber()
    {
        return loanNumber;
    }
    
    /**
     * @return The borrow date.
     */
    public String getBorrowDate()
    {
        return borrowDate;
    }
    
    /**
     * @return The return date.
     */
    public String getReturnDate()
    {
        return returnDate;
    }
    
    /**
     * @return The status.
     */
    public String getStatus()
    {
        return status;
    }
    
    /**
     * Set the status attribute.
     * @param status The status to set.
     */
    public void setStatus(String status)
    {
        this.status = status;
    }
    
    /**
     * @return The friend.
     */
    public Friend getFriend()
    {
        return friend;
    }
    
    /**
     * @return The copy.
     */
    public Copy getCopy()
    {
        return copy;
    }
    
    /**
     * Set which friend is lending.
     * @param friend The friend to set.
     */
    public void setFriend(Friend friend)
    {
        this.friend = friend;
    }
    
    /**
     * Set which copy is lended.
     * @param copy The copy to set.
     */
    public void setCopy(Copy copy)
    {
        this.copy = copy;
    }
}
