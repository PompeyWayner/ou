import ou.*;
/**
 * partial class Snake - TMA02 Q1.
 * 
 * @author (M250 module team) and Wayne Sandford
 * @version 12-01-2019
 */
public class Snake
{
   private Circle head; // provided
   private Circle body; // Circles body
   private Circle tail; // Circles tail

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
      
      body = aBody; 
      body.setXPos(startX); 
      body.setYPos(startY); 
      body.setDiameter(8); 
      
      tail = aTail; 
      tail.setXPos(startX); 
      tail.setYPos(startY); 
      tail.setDiameter(6); 

      this.setColour(OUColour.RED);
   }

   /**
    * sets the colour of head, body and tail all to the argument colour.
    */
   private void setColour(OUColour colour)
   {
      head.setColour(colour); // provided
      body.setColour(colour); 
      tail.setColour(colour);
   }

   /**
    * helper method to return x position of head
    */
   private int getHeadXPos() // provided
   {
      return head.getXPos();
   }

   /**
    * helper method to return y position of head
    */
   private int getHeadYPos()
   {
      return head.getYPos();
   }

   /**
    * helper method to return x position of body
    */
   private int getBodyXPos() 
   {
      return body.getXPos();
   }

   /**
    * helper method to return y position of body
    */
   private int getBodyYPos()
   {
      return body.getYPos();
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
    * return true if the argument represents a valid y-position for a head
    */
   private boolean checkY(int anYPos) 
   {
      return ((anYPos >= 0) && (anYPos <= (350 - head.getDiameter()))); 
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
      int oldHeadX = getHeadXPos(); 
      int oldHeadY = getHeadYPos();
      int oldBodyX = getBodyXPos();
      int oldBodyY = getBodyYPos();
      if (checkX(newHeadX) && checkY(newHeadY))
      {
         head.setXPos(newHeadX);
         head.setYPos(newHeadY);
         delay(100);
         body.setXPos(oldHeadX);
         body.setYPos(oldHeadY);
         delay(100);            
         tail.setXPos(oldBodyX);
         tail.setYPos(oldBodyY);
         delay(100);            
      }
      else
      {
         System.out.println("Snake cannot cross boundary!");
      }      
   }

   /**
    * calculate new position of the head, one head diameter to the
    * right of current position and move if it is possible
    */
   public void right()
   {
      this.moveTo(this.getHeadXPos() + head.getDiameter(), this.getHeadYPos());
   }

   /**
    * calculate new position of the head, one head diameter to the 
    * left of current position and move if it is possible
    */
   public void left()
   {
      this.moveTo(this.getHeadXPos() - head.getDiameter(), this.getHeadYPos());
   }

   /**
    * calculate new position of the head, one head diameter up
    * of current position and move if it is possible
    */
   public void up()
   {
      this.moveTo(this.getHeadXPos(), this.getHeadYPos() - head.getDiameter());
   }
   
   /**
    * calculate new position of the head, one head diameter down
    * of current position and if it is possible
    */
   public void down()
   {
      this.moveTo(this.getHeadXPos(), this.getHeadYPos() + head.getDiameter());
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

   /**
    * makes the snake move 100 random steps, each of
    * which is randomly up, down, left or right
    */
   public void randomWalk()
   { 
      int number; // Stores current generated random number
      for(int step = 0; step < 100; step++)
      {
         number = randomInteger();
         if(number == 1)
         {
            this.right();
         }
         else if(number == 2)
         {
            this.left();
         }
         else if(number == 3)
         {
            this.up();
         }
         else // number is 4
         {
            this.down();
         }
      }
   }
      
   /**
    * moves the snake horizontally one step at a time until the x position
    * of the head is within one head diameter of 125, and then vertically 
    * one step at a time until the y position of the head is within 
    * one head diameter of 175.
    */
   public void home()
   { 
      // head x position left of home position
      while(head.getXPos() < 125 - head.getDiameter())
         {
            this.right();
         }
      // head x position right of home position
      while(head.getXPos() > 125) 
         {
            this.left();
         }
      // head y position above home position
      while(head.getYPos() < 175 - head.getDiameter())
         {
            this.down();
         }
      // head y position below home position
      while(head.getYPos() > 175) 
         {
            this.up();
         }
   }
         
}
