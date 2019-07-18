
/**
 * 
 * Objects of the Painting class model real-world paintings that have attributes
 * representing title, year painted, insured value and whether or not an alarm 
 * is required.
 * 
 * Painting is an example of a composite class.
 * 
 * An object of the Painting class has-an object of the Artist class,
 * which represents the artist who painted that painting.
 *
 * The value of alarmRequired is computed and true is returned 
 * if insuredValue is equal to or greater than 1000. This is an example 
 * of state-dependent behaviour.
 * alarmRequired is not represented by an instance variable.
 * 
 * @author M250 Module Team   
 * @version 2.1 April 2016
 */
public class Painting
{
   
   //instance variables
   private String title; // a painting has-a title, e.g. "Girl with a Pearl Earring"
   private String yearPainted; // a painting has-a year painted, e.g. "1909"
   private int insuredValue; // the insured value, e.g. 1000
   private Artist artist; // a painting has-an artist of type Artist
   
   /**
    * Constructor for objects of class Painting
    * allowing specification of all the required attributes.
    * (We don't check that all the data has been specified 
    * correctly however. E.g. theArtist could be null.)
    */
   public Painting(String aTitle, String aYear, int aValue, Artist theArtist)
   {
      this.title = aTitle;     
      this.yearPainted = aYear;
      this.insuredValue = aValue;
      this.artist = theArtist;    
   }

   /**
    * Constructor for objects of class Painting,
    * where we only know the painting title.
    * (We might not know the other attribute values.)
    * This is the minimum information required to construct
    * a Painting object. In this case we chose to make
    * the Artist object 'empty'. 
    */
   public Painting(String aTitle)
   { 
      this.title = aTitle;    
      this.yearPainted = null; //null indicates an unknown year
      this.insuredValue = 0; //defaults to 0 value
      this.artist = new Artist();
   }
   
   //Setter methods are provided for all the instance variable
   //so that these data can be altered in future if necessary,
   //e.g. if the attribution of the artist changes.

   /**
    * Setter for a painting's artist's name.
    * The name is an attribute of the component Artist object, 
    * not the Painting per se. So we have to forward the message
    * to the component object.
    */
    public void setArtistName(String aName)
    {
       this.artist.setName(aName);       
    }
    
     
//Here is an alternative example of a setter method for artist name
//that is more robust. This method first checks to see if there
//is an artist component that can be sent a message. If there isn't
//one, it creates one.
   
//    public void setArtistName(String aName)
//    {
//       //this message needs to be forwarded to the component Artist object
//       //but the artist object might not exist yet, so we could check      
//       if(this.artist == null) //Has the artist component been created?
//       {
//          //No, so we need to create a new Artist object and make 
            //the instance variable of the composite object to reference it
//          this.artist = new Artist(aName);
//       }
//       else
//       {
//          //We already have an artist object, so we just need to set
//          //its name by 'forwarding' the message to the artist component         
//          this.artist.setName(aName);
//       }
//    }
    
   
   /**
    * Composition Supplement Exercise 3(b) 
    * Add getter and setter methods for the artist's yearOfBirth, 
    * following the pattern set by setArtistName() above.
    */

   /**
    * Setter for a painting's insured value.
    */
   public void setInsuredValue(int aValue)
   {
      this.insuredValue = aValue;
   }

   /**
    * Setter for a painting's year painted.
    */
   public void setYearPainted(String aYear)
   {
      this.yearPainted = aYear;
   }

   /**
    * Getter for a painting's title.
    */
   public String getTitle()
   {
      return this.title;
   }

   /**
    * Getter for a painting's insured value.
    */
   public int getInsuredValue()
   {
      return this.insuredValue;
   }

   /**
    * Getter for a painting's alarm requirement.
    * This method displays state-dependent behaviour:
    * The value returned depends on part of the state of the receiver.
    * If the receiver's insuredValue is greater than or equal to 1000 true is returned.
    * Otherwise false is returned
    */
   public boolean isAlarmRequired()
   {
      return this.getInsuredValue() >= 1000;
   }

   /**
    * Getter for a painting's year painted.
    * This method returns "Unknown" if the year
    * is not known (i.e. it has not been set).
    */
   public String getYearPainted()
   {
      if (this.yearPainted == null)
      {
         return "Unknown";
      }

      return this.yearPainted;
   }

   /**
    * Getter for a painting's artist's name.
    * This method returns "Unattributed" if the artist's name 
    * is not known (i.e. it has not been set) and otherwise
    * returns the artist's name. Similar code could have
    * been provided in the Artist class itself.
    */
   public String getArtistName()
   {
      //The artist's name is part of the component Artist object. 
      //Does the component object exist?
      if (this.artist == null || this.artist.getName() == null) 
      {
        //no artist or no artist name was set up
         return " Unattributed"; 
      }

      //The artist component has been set up, 
      //so we can forward this message to the component object 
      return this.artist.getName();
   }
   
   /**
    * This method returns true if the artist was born in or before
    * 1780, and otherwise returns false.
    */public boolean isOldMasterWork()
   {
      return(Integer.parseInt(this.artist.getYearOfBirth()) < 1780);
   }
   
   /**
    * Returns a string describing this object.
    */
   public String toString()
   {
      return "Title: " + this.title + "(" + this.yearPainted + ")" 
               + "Artist " + this.getArtistName() + ". Alarm required: " + this.isAlarmRequired();                
   }  

}
