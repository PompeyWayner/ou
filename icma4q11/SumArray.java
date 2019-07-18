
/**
 * Write a description of class SumArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SumArray
{
   // instance variables - replace the example below with your own
   private int x;

   /**
    * Constructor for objects of class SumArray
    */
   public SumArray()
   {
     
   }

   public int sumArrayRange(int[]dataArray, int start, int end)
   {
      int sum = 0;
      for(int i = start - 1; i <= end - 1; i ++)
      {
         sum += dataArray[i];
      }
      return sum;
   }
}
