/**
 * Artist represents an artist such as Van Gogh.
 * To keep things simple we just have a name and a year of birth.
 * In the context of the Painting example, this is a component class.
 * @author M250 Module Team   
 * @version 2.1 April 2016
 * 
 */
public class Artist
{
   // instance variables
   private String name; // an artist has-a name, e.g. "Vermeer"
   private String yearOfBirth; // an artist has-a year of birth, e.g. "1903"


   /**
    * zero-argument constructor: if we don’t know the artist’s attributes.    
    */
   public Artist()
   {
      this.name = null; //indicates artist name is unknown
      this.yearOfBirth = null; //indicates year of birth is unknown
   }

   /**
    * A constructor for objects of class Artist if we know their name
    * but not their year of birth.
    */
   public Artist(String aName)
   {
      this.name = aName;
      this.yearOfBirth = null; //indicates year of birth is unknown
   }

   /**
    * A constructor for objects of class Artist
    * if we know their name and their year of birth.
    */
   public Artist(String aName, String aYear)
   {
      this.name = aName;
      this.yearOfBirth = aYear;
   }

   /**
    * Setter for an artist's name.
    */
   public void setName(String aName)
   {
      this.name = aName;
   }

   /**
    * Setter for an artist's year of birth.
    */
   public void setYearOfBirth(String aYear)
   {
      this.yearOfBirth = aYear;
   }

   /**
    * Getter for an artist's name. It could
    * return a string such as "unattributed" 
    * if the artist's name is not known, 
    * but we have chosen to keep it simple here.
    */
   public String getName()
   {
      return this.name;
   }

   /**
    * Getter for an artist's year of birth. 
    * Keeping it simple, as in getName().
    */
   public String getYearOfBirth()
   {
      return this.yearOfBirth;
   }  

   /**
    * Returns a description of this object as a string.
    */
    public String toString()
    {
       return this.name + "(Born " + this.yearOfBirth + ")";
    }
    
    /**
    * Composition Supplement Exercise 3(a) 
    * Modify the toString() method above so that it 
    * returns a useful message even if name and year of birth are null.
    */
}
