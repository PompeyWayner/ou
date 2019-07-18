
/**
 * class Dog - is a subclass of Pet
 * TMA02 Q3
 * 
 * @author Wayne Sandford 
 * @version 12/01/2019
 */
public class Dog extends Pet implements Lovable
{
   // instance variables 
   private int happiness;
   private int timesFedToday;
   
   /**
    * Constructor for objects of class Dog
    */
   public Dog(String aName, String aDescription)
   {
     super(aName, aDescription);
     this.happiness = 2;
   }
   
   // instance methods
   /**
    * Returns the happiness of the receiver.
    */
   public int getHappiness()
   {
      return this.happiness;
   }
   
   /**
    * Returns the timesFedToday of the receiver.
    */
   public int getTimesFedToday()
   {
      return this.timesFedToday;
   }
   
   /**
    * Helper method that decrements happiness by one down
    * to a minimum of zero.
    */
   public void decrementHappiness()
   {
      if(this.getHappiness() > 0)
      {
         this.happiness--;
      }
   }
   
   /**
    * Helper method that decrements timesFedToday by one down
    * to a minimum of zero.
    */
   public void decrementTimesFedToday()
   {
      if(this.getTimesFedToday() > 0)
      {
         this.timesFedToday--;
      }
   }
   
   /**
    * Helper method that increments happiness by one.
    */
   public void incrementHappiness()
   {
      this.happiness++;
   }
   
    /**
    * Helper method that increments timesFedToday by one.
    */
   public void incrementTimesFedToday()
   {
      this.timesFedToday++;
   }
  
   /**
    * Repeatedly will :
    * - display walking message and add one to happiness.
    * - display hungry message and subtract one from timesFedToday.
    * While timesFedToday is greater than zero.
    */
   public void walkies()
   {
      while(this.getTimesFedToday() > 0)
      {
         System.out.println("I'm going for a walk!");
         this.incrementHappiness();
         System.out.println("I'm getting hungry");
         this.decrementTimesFedToday();
      }
   }
   
   /**
    * Returns true if happiness and timesFedToday are above zero,
    * otherwise returns false. Displays appropriate can't sleep
    * message for either or both happiness and timesFedToday when
    * zero.
    */
   public boolean sleep()
   {
     if(this.getHappiness() == 0)
     {
        System.out.println("Not happy, can't sleep");
     }
     if(this.getTimesFedToday() == 0)
     {
        System.out.println("Hungry, can't sleep");
     }
     return ((this.getHappiness() > 0) && (this.getTimesFedToday() > 0));
   }
   
   /**
    * Displays no walkies message and decrements happiness.
    */
   public void noWalkies()
   {
      System.out.println("No walkies :-(");
      this.decrementHappiness();
   }
}
