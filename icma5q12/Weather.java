import java.util.*;
import java.io.*;
import ou.*;
/**
 * Write a description of class Weather here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weather
{
   // instance variables 
   String pathname;
   /**
    * Constructor for objects of class Weather
    */
   public Weather()
   {
      super();
      pathname = null;
   }


   /**
    *This method takes a filename as an argument.
    *The file contains records consisting of:-
    *  location - String
    *  temperature - double
    *  rainfall - int
    *  visibility - String
    *  windspeed - double
    *  
    *  It reads those and writes location and temperature into
    *  a sortedMap which it returns.  The remianing data is discarded.
    */
   public SortedMap<String, Double> readTemperature(String filename)
   {
      File aFile = new File(filename);
      Scanner bufferedScanner = null;
      SortedMap<String, Double> temps = new TreeMap<>();
      SortedMap<String, Double> emptyMap = new TreeMap<>();
      
      try
      {
         String location;
         double temperature;
         int rainfall;
         String visibility;
         double windspeed;
         Scanner lineScanner;
         String currentLine;
         bufferedScanner = new Scanner(new BufferedReader(new FileReader(aFile)));
         
         while(bufferedScanner.hasNextLine())
         {
            currentLine = bufferedScanner.nextLine();
            lineScanner = new Scanner(currentLine);
            lineScanner.useDelimiter(",");
            location = lineScanner.next();
            temperature = lineScanner.nextDouble();
            rainfall = lineScanner.nextInt();
            visibility = lineScanner.next();
            windspeed = lineScanner.nextDouble();
            temps.put(location, temperature);
         }
      }
      catch(Exception anException)
      {
         return emptyMap;
      }
      finally
      {
         try
         {
            bufferedScanner.close();
         }
         catch(Exception anException)
         {
            return emptyMap;
         }
      }
      return temps;
   }
   
   /**
    * Get file
    */
   public void getFile()
   {
      pathname = OUFileChooser.getFilename();
   }
      
}