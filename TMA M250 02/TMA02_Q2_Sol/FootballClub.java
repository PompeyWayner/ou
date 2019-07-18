
/**
 * Class FootballClub is a composite class representing a real-world club.
 * It has attributes of name, the yearFounded and manager. The manager
 * attribute is an object of the Manager class.
 * TMA02 Q2
 * 
 * @author Wayne Sandford
 * @version 12-01-2019
 */
public class FootballClub
{
   // instance variables
   private String name; 
   private String yearFounded; 
   private Manager manager; // Provides has-a relationship - A FootballClub has-a Manager

   /**
    * Constructor for objects of class FootballClub
    * when all attributes are known.
    */
   public FootballClub(String aName, String aYearFounded, Manager aManager)
   {
      this.name = aName;
      this.yearFounded = aYearFounded;
      this.manager = aManager;
   }
   
   /**
    * Constructor for objects of class FootballClub where name attribute
    * is only known. Minimum attribute needed to construct object.
    */
   public FootballClub(String aName)
   {
      this.name = aName;
      this.yearFounded = null; // Indicates yearFounded is unknown
      this.manager = new Manager(); // Empty Manager object
   }
   
   /**
    * Setter for football club's name.
    */
   public void setName(String aName)
   {
      this.name = aName;
   }
   
    /**
    * Setter for football club's yearFounded.
    */
   public void setYearFounded(String aYearFounded)
   {
      this.yearFounded = aYearFounded;
   }
   
    /**
    * Setter for football club's managerName. managerName is attribute of 
    * Manager object, so is forwarded to component class.
    */
   public void setManagerName(String aManagerName)
   {
      this.manager.setName(aManagerName);
   }
   
    /**
    * Setter for football club's manager yearOfBirth. Manager yearOfBirth is
    * attribute of Manager object, so is forwarded to component class.
    */
   public void setManagerYearOfBirth(String aManagerYearOfBirth)
   {
      this.manager.setYearOfBirth(aManagerYearOfBirth);
   }
   
    /**
    * Setter for football club's manager yearBecameManager. Manager 
    * yearBecameManager is attribute of Manager object, 
    * so is forwarded to component class.
    */
   public void setManagerYearBecameManager(String aManagerYearBecameManager)
   {
      this.manager.setYearBecameManager(aManagerYearBecameManager);
   }
   
   /**
    * Getter for football club's name.
    */
   public String getName()
   {
      return this.name;
   }
   
   /**
    * Getter for football club's yearFounded. Returns
    * "Unknown" if yearFounded has not been set.
    */
   public String getYearFounded()
   {
      if(this.yearFounded == null)
      {
         return "Unknown";
      }
      return this.yearFounded;
   }  
   
   /**
    * Getter for football club's manager name
    */
   public String getManagerName()
   {
      return this.manager.getName();
   }
   
   /**
    * Getter for football club's manager yearOfBirth.
    */
   public String getManagerYearOfBirth()
   {
      return this.manager.getYearOfBirth();
   }
   
   /**
    * Getter for football club's manager yearBecameManager.
    */
   public String getManagerYearBecameManager()
   {
      return this.manager.getYearBecameManager();
   }
   
   /**
    * Computes the amount of whole years the manager has managed 
    * at the football club. It uses the yearBecameManager attribute
    * from the Manager object in its calculation. 
    */
   public void yearsManaged()
   {  
      if(getManagerYearBecameManager() != "Unknown") // Valid value
      {
         System.out.println(this.getManagerName() + " has been manager for "
                           + (2019 - (Integer.parseInt(this.manager.getYearBecameManager())))
                           + " whole years.");
      }
      else 
      {
         System.out.println("Years managed is unknown.");
      }
   }
   
   /**
    * Return true if the football club is one hundred or
    * more years old. Returns false if yearFounded is not set.
    */
   public boolean isOverHundred()
   {
      int year;
      if(this.getYearFounded() == "Unknown")
      {
         return false;
      }  
      year = (Integer.parseInt(this.getYearFounded()));
      return (year + 100) <= 2019;
   }
   
   /**
    * Returns a string describing the football club object.
    */
   @Override
   public String toString()
   {
      return "Name: " + this.name + "(Founded:" + this.getYearFounded() + ") "
             + "Manager: " + this.getManagerName() + "(Born:"  
             + this.manager.getYearOfBirth() + ") Club hundred or more years old: "
             + this.isOverHundred();
   } 
}
