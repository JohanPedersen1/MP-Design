package model;
import java.util.ArrayList;

/**
* Class that represents a vinyl record (LP).
*
* Contains basic information such as barcode, title, artist, and release date.
* Allows you to create an LP instance and obtain a copy using a serial number.
*/
public class LP
{
    private long barcode;
    private String title;
    private String artist;
    private String publicationDate;
    private ArrayList<Copy> copies;

    /**
     * Initialize LP.
     */
    public LP(long barcode, String title, String artist, String publicationDate)
    {
        this.barcode = barcode;
        this.title = title;
        this.artist = artist;
        this.publicationDate = publicationDate;
        copies = new ArrayList<>();
    }

    /**
     * Loop through copies and compare serialNo.
     * @param serialNo The serial number to compare.
     * @return The copy that matches or null.
     */
    public Copy getCopy(int serialNo)
    {    
        for(Copy c : copies)
        {
            if(c.getSerialNo() == serialNo) 
            {
                return c;
            }
        }
        
        return null;
    }
    
    /**
     * Add a copy to copies.
     * @param copy The copy to add..
     */
    public void addCopy(Copy copy)
    {
        copies.add(copy);
    }
    
    /**
     * @return The barcode.
     */
    public long getBarcode ()
    {
        return barcode;
    }
    
    /**
     * @return The title.
     */
    public String getTitle ()
    {
        return title;
    }
    
    /**
     * @return The artist.
     */
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * @return The publication date.
     */
    public String getPublicationDate()
    {
        return publicationDate;
    }
}
