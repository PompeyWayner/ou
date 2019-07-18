
/**
 * Answer to TMA01 Question 1.
 * 
 * @author Wayne Sandford
 * @version 15th October 2018
 */
public class RoomSafe
{
   /* instance variable */
   
   private String password;
   
   /**
    * Constructor for objects of class RoomSafe
    */
   public RoomSafe()
   {
        password = "Adminadmin1";
   }
   
   /* instance methods */
   
   /**
    *  Returns the password of the receiver.
    */
   public String getPassword() 
   {
      return this.password;
   }
   
   /**
    * Return true if the argument pw is at least 8 characters long.
    */
   public boolean isValidLength(String pw)
   {
      return pw.length() >= 8;
   }
   
   /**
    * Given method
    * Return true if at least one of the characters in the argument
    * pw is a digit
    * otherwise return false
    */
   public boolean hasDigit(String pw)
   {   // Assume initially that the string contains no digits.
      boolean result = false;
      // Examine each character of pw in turn.
      for (int i = 0; i < pw.length(); i++)
      {
         // If the character at position i is a digit, 
         // set result to true
         if (Character.isDigit(pw.charAt(i)))
         {
            result = true;
         }
      }
      return result;
   }

   /**
    * Return true if at least one of the characters in the argument
    * pw is uppercase otherwise return false
    */
   public boolean hasUpperCase(String pw)
   {   // Assume initially that the string contains no uppercase characters.
      boolean result = false;
      // Examine each character of pw in turn.
      for (int i = 0; i < pw.length(); i++)
      {
         // If the character at position i is uppercase, 
         // set result to true
         if (Character.isUpperCase(pw.charAt(i)))
         {
            result = true;
         }
      }
      return result;
   }
   
   /**
    * Return true if password passes all 3 tests.
    *  - At least 8 characters.
    *  - Has at least one digit.
    *  - Has at least one uppercase character.
    */
   public boolean isValidPassword(String pw)
   {
      return isValidLength(pw) && hasDigit(pw) && hasUpperCase(pw);
   }
   
   /**
    * Sets the password of the receiver to the value 
    * of the argument pw only if pw is valid. Displays message
    * acknowledging password is valid or not valid.
    */
   public void setPassword(String pw)
   {
      if(isValidPassword(pw))
      {
         System.out.println("The password " + pw + " is valid.");
         this.password = pw;
      }
      else
      {
         System.out.println("The password " + pw + " is not valid.");
      }
   }
   
   /**
    * Return false if password is still the default, otherwise
    * return true as password has been changed.
    */
   public boolean hasChanged()
   {
      if(getPassword().equals("Adminadmin1"))
      {
         return false;
      }
      else
      {
         return true;
      }
   }
}




