import java.util.*;
import java.io.*;
import ou.*;
/**
 * Class WCCR - simulates a list of Entrants in the Walton Classic
 * Car Rally, whose entry details can be acquired from a CSV file. 
 * This list can be sorted and manipulated with results being 
 * displayed by car category.
 * 
 * @author Wayne Sandford
 * @version 24-03-19
 */
public class WCCR
{
   // instance variables
   List<Entrant> entrants; // Reference a list of Entrant objects
   SortedMap<String, Double> e1Results; // Category E1 cars
   SortedMap<String, Double> e2Results; // Category E2 cars
   SortedMap<String, Double> e3Results; // Category E3 cars
   /**
    * Constructor for objects of class WCCR
    */
   public WCCR()
   {
      super();
      entrants = new ArrayList<>();
      e1Results = new TreeMap<>();
      e2Results = new TreeMap<>();
      e3Results = new TreeMap<>();
   }

   /**
    * Prompts the user for a pathname and then attempts to open a
    * stream of the specified entrants file which must be in 
    * CSV format. Each line of data from the file creates a new
    * Entrant object which is then stored in the entrants list.
    * It is assumed all file data is valid.
    */
   public void readInEntrants()
   {
      String pathname = OUFileChooser.getFilename();
      File entrantsFile = new File(pathname);
      Scanner bufferedScanner = null;
      Entrant entrant;
      
      try
      {
         Scanner lineScanner;
         String currentLine;
         bufferedScanner = new Scanner(new BufferedReader
                                      (new FileReader(entrantsFile)));
         
         while(bufferedScanner.hasNextLine()) // While not end of file.
         {
            currentLine = bufferedScanner.nextLine();
            lineScanner = new Scanner(currentLine);
            lineScanner.useDelimiter(",");
            entrant = new Entrant();
            entrant.setName(lineScanner.next());
            entrant.setCategory(lineScanner.next());
            entrants.add(entrant); 
         }
      }
      catch(Exception anException)
      {
         System.out.println("Error: " + anException);
      }
      finally
      {
         try
         {
            bufferedScanner.close();
         }
         catch(Exception anException)
         {
            System.out.println("Error: " + anException);
         }
      }
   }
   
   /**
    * Calculates a random double value between 30.00 (inclusive)
    * and 60.00 (exclusive).
    * @return a double between 30.00 (inclusive)
    *         and 60.00 (exclusive). 
    */
   private double generateTime()
   {
      Random randomNumber = new Random();
      return 30.00 + (60.00 - 30.00) * randomNumber.nextDouble();
   }
   
   /**
    *  Iterates over the list of entrants, and for each entrant generates
    *  a random number between 30.00 (inclusive) and 60.00 (exclusive) 
    *  which is used to set the time (in minutes) for that entrant.
    */
   public void runRally()
   {
      for(Entrant eachEntrant : entrants)
      {
         eachEntrant.setTime(generateTime());
      }
   }
   
   /**
    * Sorts the entrants list by the time each entrant has taken to
    * complete the rally. 
    */
   public void sortEntrantList()
   {
      Collections.sort(entrants);
   }
   
   /**
    * Iterates over entrants list, populating the maps e1Results,
    * e2Results and e3Results, with the correct names and
    * times of entrants.
    */
   public void categorise()
   {
      for(Entrant eachEntrant : entrants)
      {
         if(eachEntrant.getCategory().equals("E1"))
         {
            e1Results.put(eachEntrant.getName(), eachEntrant.getTime());
         }
         else if(eachEntrant.getCategory().equals("E2"))
         {
            e2Results.put(eachEntrant.getName(), eachEntrant.getTime());
         }
         else // "E3"
         {
            e3Results.put(eachEntrant.getName(), eachEntrant.getTime());
         }
      }
   }
}
