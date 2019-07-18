
/**
 * Class Entrant - Simulates an entrant in Walton Classic Car Race.
 * 
 * @author M250 Course Team. Updated by Wayne Sandford
 * @version 23-03-19
 */
public class Entrant implements Comparable<Entrant>
{

   /* instance variables */

   private int number;       // entrant's number
   private String name;      // entrant's name
   private String category;  // "E1", "E2" or "E3"
   private double time;      // entrant's marathon time in seconds
   private static int nextNumber = 1; // Next entrant number to be allocated

   /**
    * Constructor for objects of class Entrant.
    */
   public Entrant()
   {
      super();
      name = "";
      category = "";
      time = 0.0;
      number = nextNumber++;
   }

   //Only those getter and setter methods that you will need have been included

   /**
    * getter for number
    */
   public int getNumber()
   {
      return number;
   }

   /**
    * getter for name
    */
   public String getName()
   {
      return name;
   }

   /**
    * setter for name
    */
   public void setName(String aName)
   {
      name = aName;
   }

   /**
    * getter for category
    */
   public String getCategory()
   {
      return category;
   }

   /**
    * setter for category
    */
   public void setCategory(String carType)
   {
      category = carType;
   }

   /**
    * getter for time
    */
   public double getTime()
   {
      return time;
   }  

   /**
    * setter for time
    */
   public void setTime(double aTime)
   {
      time = aTime;
   }

   /**
    * Compares the time of receiver against the time of the
    * Entrant object from the method argument.
    * @return an integer value of 0 if the arguments are numerically equal,
    *         a negative value if the first argument is less than the second,
    *         and a positive value if the first argument is greater than the
    *         second.
    */
   public int compareTo(Entrant anotherEntrant)
   {
      return Double.compare(this.getTime(), anotherEntrant.getTime());
   }

}
