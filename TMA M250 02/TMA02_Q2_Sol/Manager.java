
/**
 * Class Manager is a component class. It has attributes
 * of name, yearOfBirth and yearBecameManager.
 * TMA02 Q2
 * 
 * @author Wayne Sandford 
 * @version 12-01-2019
 */
public class Manager
{
   // instance variable
   private String name;
   private String yearOfBirth;
   private String yearBecameManager;

   /**
    * Constructor for objects of class Manager when all attributes are known.
    */
   public Manager(String aName, String aYearOfBirth, String aYearBecameManager)
   {
      this.name = aName;
      this.yearOfBirth = aYearOfBirth;
      this.yearBecameManager = aYearBecameManager;
   }

   /**
    * Zero-argument constructor for object of class Manager.
    */
   public Manager()
   {
      this.name = null; // Indicates name is unknown
      this.yearOfBirth = null; // Indicates yearOfBirth is unknown
      this.yearBecameManager = null; // Indicates yearBecameManager is unknown
   }
   
   /**
    * Setter for manager's name.
    */
   public void setName(String aName)
   {
      this.name = aName;
   }
   
   /**
    * Setter for manager's yearOfBirth.
    */
   public void setYearOfBirth(String aYearOfBirth)
   {
      this.yearOfBirth = aYearOfBirth;
   }
   
   /**
    * Setter for manager's yearBecameManager.
    */
   public void setYearBecameManager(String aYearBecameManager)
   {
      this.yearBecameManager = aYearBecameManager;
   }
   
   /**
    * Getter for manager's name. Returns "Unknown" if
    * name has not been set.
    */
   public String getName()
   {
      if(this.name == null)
      {
         return "Unknown";
      }
      return this.name;
   }
   
   /**
    * Getter for manager's yearOfBirth. Returns "Unknown" if
    * yearOfBirth has not been set.
    */
   public String getYearOfBirth()
   {
      if(this.yearOfBirth == null)
      {
         return "Unknown";
      }
      return this.yearOfBirth;
   }
   
   /**
    * Getter for manager's yearBecameManager. Returns "Unknown" if
    * yearBecameManager has not been set.
    */
   public String getYearBecameManager()
   {
      if(this.yearBecameManager == null)
      {
         return "Unknown";
      }
      return this.yearBecameManager;
   }
  
   /**
    * Returns a string describing the Manager object.
    */
   @Override
   public String toString()
   {
      return "Manager: " + this.getName() + "(Born:" + this.getYearOfBirth() +
             ") Year became manager: " + this.getYearBecameManager();
   }
}
