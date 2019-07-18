
/**
 * interface Lovable TMA02 Q3
 * 
 * @author Wayne Sandford
 * @version 12-01-2019
 */
public interface Lovable
{
   /**
    * Performs an arbitrary action in response to message stroke().
    */
   public void stroke();
   
   /**
    * Performs an arbitrary action in response to message canStroke().
    * Returns a boolean value of true or false.
    */
   public boolean canStroke();
   
   /**
    * Performs an arbitrary action in response to message feed().
    */
   public void feed();
}
