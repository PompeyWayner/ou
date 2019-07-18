import ou.*;
/**
 * TrafficSystem for TMA03Q1.
 * 
 * @author Wayne Sandford 
 * @version 16-04-19
 */
public class TrafficSystem
{
   // Instance variables 
   
   // given instance variables for the four lights
   private TrafficLight north;
   private TrafficLight south;
   private TrafficLight east;
   private TrafficLight west;
   private int state; // Pattern of lights corresponds to value stored.
   private boolean go; // Determines automation of traffic lights.
  
   /**
    * Constructor for objects of class TrafficSystem.
    */
   public TrafficSystem(TrafficLight aNorth, TrafficLight aSouth, 
                        TrafficLight aEast, TrafficLight aWest)
   {
      this.north = aNorth;
      this.south = aSouth;
      this.east = aEast;
      this.west = aWest;
      this.state = 0;
      this.setPositions();   
      this.colourAllLights(); // Initialise colour of lights.
      this.go = false; // System initially not working automatically.
   }

   private void setPositions() 
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
    * Sets the colour of the specified TrafficLight to the specified colour.
    * @param aLight which is a reference to TrafficLight.
    * @param aColour which is an OUColour.
    */
   public void colourLight(TrafficLight aLight, OUColour aColour)
   {
      aLight.setColour(aColour);
   }
   
   /**
    * Cycles to the next state:
    * from 1 to 2, from 2 to 3, from 3 to 4 and back to 1.
    */
   private void cycleState()
   {
      this.state += 1;
      if(this.state > 4)
      {
         this.state = 1;
      }
   }
   
   /**
    * Sets the colours of the four TrafficLight objects based
    * on the current state.
    */
   private void colourAllLights() 
   {
      if(this.state == 0)
      {
         this.colourLight(north, OUColour.RED);
         this.colourLight(south, OUColour.RED);
         this.colourLight(east, OUColour.RED);
         this.colourLight(west, OUColour.RED);
      }
      else if(this.state == 1)
      {
         this.colourLight(north, OUColour.GREEN);
         this.colourLight(south, OUColour.GREEN);
         this.colourLight(east, OUColour.RED);
         this.colourLight(west, OUColour.RED);
      }
      else if(this.state == 2)
      {
         this.colourLight(north, OUColour.ORANGE);
         this.colourLight(south, OUColour.ORANGE);
         this.colourLight(east, OUColour.RED);
         this.colourLight(west, OUColour.RED);
      }
      else if(this.state == 3)
      {
         this.colourLight(north, OUColour.RED);
         this.colourLight(south, OUColour.RED);
         this.colourLight(east, OUColour.GREEN);
         this.colourLight(west, OUColour.GREEN);
      }
      else // State 4
      {
         this.colourLight(north, OUColour.RED);
         this.colourLight(south, OUColour.RED);
         this.colourLight(east, OUColour.ORANGE);
         this.colourLight(west, OUColour.ORANGE);
      }
   }
   
   /**
    * Setter method for instance variable go.
    */
   public void setGo(boolean isGo)
   {
      this.go = isGo;
   }
   
   /**
    * Runs the traffic lights automatically when instance variable go
    * is true. Cycles through each state which change the traffic
    * light colours with a delay between each change.
    */
   public void runLights()
   {
      while(this.go) 
      {
         this.cycleState();
         this.colourAllLights();
         this.delay(2000);
      }
   }
   
   /**
    * Manually override the traffic light system.
    * An integer value between 0 and 4 is to be entered to set 
    * the state of theTrafficLight objects. A integer value 
    * outside this range will cause a out of range message.
    * @throws NumberFormatException if newState value is not 
    * an integer.
    */
   public void manualOverride()
   {
      if (!this.go)
      {
         try
         {
            int newState = Integer.parseInt(OUDialog.request
              ("Please give the state you want to change to - between 0 and 4 inclusive"));
            if(newState >= 0 &&  newState <= 4) 
            {
               this.state = newState;
               this.colourAllLights();
            }
            else
            {
               OUDialog.alert("State value " + newState +
                              " entered not in the 0 to 4 value range");
            }
         }
         catch(NumberFormatException anException)
         {
            OUDialog.alert("State value inappropriate, integer expected");
         }
      }
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
