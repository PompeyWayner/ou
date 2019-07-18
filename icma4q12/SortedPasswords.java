import java.util.*;
/**
 * Write a description of class SortedPasswords here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SortedPasswords
{
   // instance variables - replace the example below with your own
   private int x;

   /**
    * Constructor for objects of class SortedPasswords
    */
   public SortedPasswords()
   {
      // initialise instance variables
   }

   public SortedMap<String, String> findStrongPasswords(Map<String, String> users, Set<String> weakPasswords)
   {
      SortedMap<String,String> sortedUsers = new TreeMap<>( users);
      
      for(String anUserId : users.keySet()) // for each user in the users map
      {
         for(String aPassword : weakPasswords) // for each password in password set
         {
            if(users.get(anUserId).equals(aPassword)) // if current user password equal to current weak pw
            {
               sortedUsers.remove(anUserId); // remove from sorted list
            }
         }
      }
      return sortedUsers;
   }
}
