import java.util.*;
/**
 * Write a description of class Animals here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animals
{
   // instance variables - replace the example below with your own
  private List<String> inList;

   /**
    * Constructor for objects of class Animals
    */
   public Animals()
   {
      super();
      inList = new ArrayList<>();
   }

   /**
    * populate
    */
   public void populate()
   {
      inList.add("adder");
      inList.add("dog");
      inList.add("fish");
      inList.add("cat");
      inList.add("zebra");
      inList.add("caterpillar");
      inList.add("camel");
      inList.add("elephant");
      inList.add("crab");
      inList.add("capybara");
   }
   
   /**
    * 
    */
   public Set<String> trimList(char[] letters)
   {
      SortedSet<String> animalNames = new TreeSet<>();
      
      for(String eachAnimal : inList)
      {
         for(int i = 0; i < letters.length; i++)
         {
            if(eachAnimal.charAt(0) == (letters[i]))
            {
               animalNames.add(eachAnimal);
            }
         }
      }
      return animalNames;
   }
   
}
