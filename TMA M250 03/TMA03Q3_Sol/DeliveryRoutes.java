.
import java.util.*;
/**
 * This class simulates a number of delivery routes.
 * Each delivery routes data can be manipulated in a
 * variety of ways.
 * 
 * @author Wayne Sandford
 * @version 05-04-19
 */
public class DeliveryRoutes
{
   // instance variable
   private SortedMap<String, Set<String>> routes;

   /**
    * Constructor for objects of class DeliveryRoutes
    */
   public DeliveryRoutes()
   {
      this.routes = new TreeMap<String, Set<String>>();
   }

   /**
    * Populates the map with test data 
    */
   public void populate()
   {
      Set<String> businesses = new HashSet<>();
      businesses.add("Falcon News");
      businesses.add("H R Newsagents");
      businesses.add("WHSmith");
      this.routes.put("Portsmouth", businesses);

      businesses = new HashSet<>();
      businesses.add("The News Box");
      businesses.add("Harbour News");
      businesses.add("WHSmith");
      this.routes.put("Gosport", businesses);

      businesses = new HashSet<>();
      businesses.add("Kiosk News");
      this.routes.put("Havant", businesses);

   }
   
   /**
    * Prints out each delivery route and their associated
    * businesses that are on that route.
    */
   public void printMap()
   {
      for(String eachRoute : routes.keySet())
      {
         System.out.println("Delivery addresses for route: " + eachRoute);
         for(String eachBusiness : routes.get(eachRoute))
         {
            System.out.println(eachBusiness);
         }
         System.out.println();
      }
   }

   /**
    * Prints out the businesses of a route if the method 
    * argument is a valid route otherwise prints out
    * route not found message.
    * @param routeName a String representing the route name.
    */
   public void printMapValue(String routeName)
   {
      if(this.routes.containsKey(routeName)) // Route exists.
      {
         System.out.println("There are currently " 
                            + this.routes.get(routeName).size() 
                            + " businesses :" );
         for(String eachBusiness : this.routes.get(routeName))
         {
            System.out.println(eachBusiness);
         }
      }
      else // Route does not exist.
      {
         System.out.println("The delivery route for " 
                            + routeName +  " has not been found.");
      }
   }
   
   /**
    * Adds a route and its associated businesses to the map, 
    * which are taken from the method argument. If the route name is 
    * already present the existing business values are overwritten.
    * @param routeName a String representing the route name.
    * @param setOfBusinesses a Set of Strings representing businesses.
    */
   public void addMapEntry(String routeName, Set<String> setOfBusinesses)
   {
      this.routes.put(routeName, setOfBusinesses);
   }

   /**
    * Takes an argument representing a route name in the map.
    * If the route name exists, route and associated businesses 
    * are deleted from the map and returns true, otherwise returns false.
    * @param routeName a String representing the route name.
    */
   public boolean deleteEntry(String routeName)
   {
      return (this.routes.remove(routeName) != null);
   }
   
   /**
    * Returns a map of all the businesses in each route that have 
    * the same names as those that are in the method arguments Set
    * of business names.
    * @param aBusinessesNames a Set of Strings representing the 
    *        names of businesses to find in the Map values.
    * @return newMap a Map containing only the businesses that
    *        match ones that appear in aBusinessesNames.
    */
   public SortedMap<String, Set<String>> selectValues(Set<String> aBusinessesNames)
   {
      SortedMap<String, Set<String>> newMap = new TreeMap<>();
      Set<String> eachRouteOfBusinesses;
      Set<String> intersection;
      
      for(String route : this.routes.keySet()) 
      {
         eachRouteOfBusinesses  = this.routes.get(route); 
         intersection = new HashSet<>(aBusinessesNames);
         intersection.retainAll(eachRouteOfBusinesses); 
         newMap.put(route, intersection);
      }
      return newMap;
   } 
   
   /**
    * Adds a new business to the Set of businesses for a
    * particular routeName (key). It assumes that the 
    * routeName exists in the map. 
    * @param routeName a String representing the key.
    * @param aBusiness a String representing the business.
    */
   public void addToValue(String routeName, String aBusiness)
   {
      Set<String> setOfBusinesses = this.routes.get(routeName);
      setOfBusinesses.add(aBusiness);
   }
}

