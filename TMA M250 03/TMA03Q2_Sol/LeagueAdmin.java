import java.util.*;

/**
 * class LeagueAdmin for TMA03Q2.
 * 
 * @author Wayne Sandford
 * @version 16-04-19
 */
public class LeagueAdmin
{

   // Instance variable references a map which will hold String value
   // division for the key and a List of teams as the value.
   private Map<String, List<Team>> teams; 
   
   /**
    * Constructor for objects of class LeagueAdmin.
    */
   public LeagueAdmin()
   {
      this.teams = new HashMap<String, List<Team>>();
   }

   /**
    * Adds a team to a division. If division already exists,
    * team is added to division otherwise a new division is 
    * created and then team is added to the new division.
    * @param division which team is to be added to.
    * @param team is Team object that will be added to a division.
    */
   public void addTeam(String division, Team team)
   {
      if(this.teams.containsKey(division)) // Key already exists.
      {
         this.teams.get(division).add(team); 
      }
      else // Key does not exist.
      {
         List<Team>teamList = new ArrayList<Team>(); 
         teamList.add(team); 
         this.teams.put(division, teamList); 
      }
   }
   
   /**
    * Updates two specific teams from a division depending on the 
    * method argument teamAScore and teamBScore.
    * @param division a String indicates which division result is for.
    * @param teamA a String which team played (one of two).
    * @param teamB a String which team played (one of two).
    * @param teamAScore an integer of number goals teamA scored.
    * @param teamBScore an integer of number goals teamB scored.
    */
   public void recordResult(String division, String teamA, String teamB,
                            int teamAScore, int teamBScore)
   {
      List<Team> teamList = new ArrayList<>(this.teams.get(division)); 
      
      for(Team aTeam : teamList)
      {
         if(aTeam.getName().equals(teamA)) // teamA test
         {
            if(teamAScore > teamBScore)
            {
               aTeam.incWon();
            }
            else if(teamAScore < teamBScore)
            {
               aTeam.incLost();
            }
            else // TeamA drew
            {
               aTeam.incDrew();
            }
         }
         if(aTeam.getName().equals(teamB)) // teamB test
         {
            if(teamAScore > teamBScore)
            {
               aTeam.incLost();
            }
            else if(teamAScore < teamBScore)
            {
               aTeam.incWon();
            }
            else // TeamA drew
            {
               aTeam.incDrew();
            }
         }
      }
   }
    
   /**
    * Prints out the statistics for all teams in the
    * division given by the method argument.
    * @param division String of division to be displayed.
    */
   public void printOutTable(String division)
   {
      System.out.println(division);
      System.out.format("%-20s %2s %2s %2s %2s \n", 
                        "Name","W","L","D"," Pts" );
      for(Team aTeam : this.teams.get(division))
      {
         System.out.format("%-20s %2d %2d %2d %2d\n", aTeam.getName(), 
                           aTeam.getWon(),  aTeam.getLost(), 
                           aTeam.getDrew(), aTeam.getPoints());
      }
   }
   
   
}
