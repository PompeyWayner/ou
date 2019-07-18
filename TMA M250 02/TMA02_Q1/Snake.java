import ou.*;
/**
 * partial class Snake - TMA02 Q1.
 * 
 * @author (M250 module team) 
 * @version (1.0)
 */
public class Snake
{
   private Circle head; // provided

   /**
    * Constructor for objects of class Snake
    */
   public Snake(int startX, int startY, Circle aHead, Circle aBody, Circle aTail)
   {
      // initialise instance variables
      head = aHead; // provided
      head.setXPos(startX); // provided
      head.setYPos(startY); // provided
      head.setDiameter(10); // provided

   }

   /**
    * sets the colour of head, body and tail all to the argument colour.
    */
   private void setColour(OUColour colour)
   {
      head.setColour(colour); // provided

   }

   /**
    * helper method to return x position of head
    */
   private int getHeadXPos() // provided
   {
      return head.getXPos();
   }

   /**
    * provided
    * return true if the argument represents a valid x-position for a head
    */
   private boolean checkX(int anXPos) // check room to make move
   {
      if ((anXPos >= 0) && (anXPos <= (250 - head.getDiameter()))) // constants only happen in Unit 7
      {
         return true;
      }
      else
      {
         return false;
      }
      //alternative one-line version
      // return ((anXPos >= 0) && (anXPos <= (250 - head.getDiameter())));
   }

   /**
    * provided, but won't compile til earlier parts are completed.
    * once you have completed the methods you are asked to write in
    * parts c and d you can uncomment the body of the method.
    * 
    * if the new position is valid, move the snake so that its head is in the given position
    * move the body to where the head was, and the tail to where the body was.
    * Delay after each move.
    * otherwise
    * leave position unchanged
    * output appropriate message
    */
   private void moveTo(int newHeadX, int newHeadY) // provided
   {
//       int oldHeadX = getHeadXPos(); 
//       int oldHeadY = getHeadYPos();
//       int oldBodyX = getBodyXPos();
//       int oldBodyY = getBodyYPos();
//       if (checkX(newHeadX) && checkY(newHeadY))
//       {
//          head.setXPos(newHeadX);
//          head.setYPos(newHeadY);
//          delay(100);
//          body.setXPos(oldHeadX);
//          body.setYPos(oldHeadY);
//          delay(100);            
//          tail.setXPos(oldBodyX);
//          tail.setYPos(oldBodyY);
//          delay(100);            
//       }
//       else
//       {
//          System.out.println("Snake cannot cross boundary!");
//       }      
   }


   /**
    * provided
    * Causes execution to pause by time number of milliseconds
    * You can use this method without needing to understand how it works
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

   /**
    * provided
    * return a random integer between 1 and 4 inclusive
    * You can use this method without needing to understand how it works
    */
   public int randomInteger() 
   {
      java.util.Random r = new java.util.Random();
      return r.nextInt(4) + 1;
   }

}
