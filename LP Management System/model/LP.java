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

    public LP(long barcode, String title, String artist, String publicationDate)
    {
        this.barcode = barcode;
        this.title = title;
        this.artist = artist;
        this.publicationDate = publicationDate;
        copies = new ArrayList<>();
    }

    public Copy getCopy(int serialNo){    
        for(Copy c : copies)
        {
            if(c.getSerialNo() == serialNo) {
                return c;
            }
        }
        
        return null;
    }
           
    //Getters 
    // Optional getter methods, in case you need them in the future
    public long getBarcode (){
        return barcode;
    }
    
    public String getTitle (){
        return title;
    }
    
    public String getArtist(){
        return artist;
    }
    
    public String getPublicationDate(){
        return publicationDate;
    }
}
