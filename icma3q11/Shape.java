
/**
 * class Shape
 * iCMA 03 Q11
 * 
 * @author Wayne Sandford
 * @version 16-01-2019
 */
public class Shape
{
   
   private static final double PI = 3.14; // class constant
   private int radius; // instance variable

   /**
    * Constructor for objects of class Shape
    */
   public Shape(int aRadius)
   {
      this.radius = aRadius;
   }

   /**
    * Return volume of a sphere
    */
   public double sphereVolume()
   {
      return ((4d / 3d) * Shape.PI * (this.radius * this.radius * this.radius));
   }
}
