
/**
 * Write a description of interface TimeKeeper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface TimeKeeper
{
   public void reset();                   //resets seconds to 0
   public void addToSeconds();            //adds 0.01 seconds to seconds. Resets to zero if >= 1 hour.
   public String displayTime();           //returns the formatted time in seconds
   public void delayTime(int delay);      //increments seconds by delay hundredths of a second
}
