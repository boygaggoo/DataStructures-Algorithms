import java.util.*;

public class SimpleWordGame {
      public int points(String[] player, 
                        String[] dictionary) {
    	  int points = 0;
    	  List<String>dictionary1 = Arrays.asList(dictionary);
    	  
    	 //get rid of duplicates in set then change back to array
    	  HashSet<String> playerSet = new HashSet<String>(Arrays.asList(player));
    	  player = playerSet.toArray(new String[playerSet.size()]); //initialize size of array as size of set
      	
    	  for(int i=0; i<player.length; i++){
    		  if (dictionary1.contains(player[i])){
    			  int lenWord = player[i].length();
    			  points += lenWord*lenWord;
    		  }
    	  }
    	  return points;
      }
      public static void main(String[] args){
    	  SimpleWordGame cc = new SimpleWordGame();
        	String[] avail = {"apple", "orange", "strawberry"};
        	String[] ord = {"strawberry", "orange", "grapefruit", "watermelon"};
        	System.out.println(cc.points(avail, ord));
        }
  }