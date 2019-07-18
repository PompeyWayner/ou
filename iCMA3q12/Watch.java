
/**
 * Write a description of class Watch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Watch implements TimeKeeper
{
   // instance variables
   private double seconds;
   
   /**
    * Constructor for objects of class Watch
    */
   public Watch(int aSeconds)
   {
      this.seconds = aSeconds;
   }

   /**
    * Getter for seconds
    */
   public double getSeconds()
   {
      return this.seconds;
   }
   
   /**
    * Setter for seconds
    */
   public void setSeconds(double aSeconds)
   {
      this.seconds = aSeconds;
   }
   
   /**
    * Resets second to zero
    */
   public void reset()
   {
      this.setSeconds(0.0);
   }
   
   /**
    * adds 0.01 seconds to seconds. Resets to zero if >= 1 hour
    */
   public void addToSeconds()
   {
      this.setSeconds(getSeconds() + 0.01);
      if(this.getSeconds() >= 3600.0) //reset
      {
         this.reset();
      }
   }
   
   /**
    * returns the formatted time in seconds
    */
   public String displayTime()
   {
      return String.format("The timer says: %.1f seconds", this.getSeconds());
   }
   
   /**
    * increments seconds by delay hundredths of a second
    */
   public void delayTime(int delay)
   {
      this.setSeconds(this.getSeconds() + (delay / 100.0));
   }
}
