import ou.*;
/**
 * TrafficSystem for TMA03Q1.
 * 
 * @author (M250 module team) 
 * @version (1.0)
 */
public class TrafficSystem
{
   // given instance variables for the four lights
   private TrafficLight north;
   private TrafficLight south;
   private TrafficLight east;
   private TrafficLight west;

   private void setPositions() // provided method
   {
      north.setXPos(100);
      north.setYPos(0);
      south.setXPos(100);
      south.setYPos(200);      
      west.setXPos(0);
      west.setYPos(100);      
      east.setXPos(200);
      east.setYPos(100);
   }

   /**
    * Provided method without try catch or the checking for 0-4 state.
    * Extra functionality is to be added to deal with non-integer 
    * or out of range inputs
    */
   public void manualOverride()
   {
      //      if (!go)
      //      {
      int newState = Integer.parseInt(OUDialog.request("Please give the state you want to change to - between 0 and 4 inclusive"));
      // state = newState;
      // colourAllLights();
      //      }
   }

   /**
    * causes execution to pause by time number of milliseconds
    */
   public void delay(int time)
   {
      try
      {
         Thread.sleep(time); 
      }
      catch (Exception e)
      {
         System.out.println(e);
      } 
   }

}
