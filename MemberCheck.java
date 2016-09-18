import java.util.*;

public class MemberCheck {
      public String[] whosDishonest(String[] club1, 
                                    String[] club2, 
                                    String[] club3) {
      	
    	//change club2 and club3 to lists
    	List<String>club20 = Arrays.asList(club2);
    	List<String>club30 = Arrays.asList(club3);

    	//initialize list to add cheaters to
    	List<String> cheaters = new ArrayList<String>();      	
  	    
  	    for(String person: club1){
      		if(club20.contains(person) || club30.contains(person)){
      			cheaters.add(person);
      		}
      	}for(String person: club2){
      		if(club30.contains(person)){
      			cheaters.add(person);
      		}
      	}
      	//sort and get rid of duplicates then change list<String> back to String[]
      	TreeSet<String> cheat = new TreeSet<String>(cheaters);
      	return cheat.toArray(new String[cheat.size()]);
      }
   }