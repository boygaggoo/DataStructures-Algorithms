import java.util.*;

public class AuntUncle {
       public String[] list(String[] parents, String target) {
    	   HashMap<String,ArrayList<String>> myMap = new HashMap<>();
    	   
    	   //mapping kids to parents
    	   for(String all: parents){
    		   String[] indv = all.split(" ");
    		   ArrayList<String> people = new ArrayList<String>();
    		   people.add(indv[0]);
    		   people.add(indv[1]);
    		   myMap.put(indv[2], people);
    		   }
    	   //
    	   ArrayList<String> rents = myMap.get(target); //rents = target's parents
    	   ArrayList<String> grandRents = new ArrayList<String>(4);
    	   if (rents!=null){ //if parents exist
    		   for (String p: rents){ //then for each parent
    			   //if parent is also a child in map, then we add them as grandparent
    			   if (myMap.get(p)!=null) grandRents.addAll(myMap.get(p));
    		   }
    	   }
    	   
    	   TreeSet<String> auntUnc = new TreeSet<String>();
    	   for (String kids:myMap.keySet()){ //for each kid as a key
    		   for (int g=0; g<grandRents.size(); g++){ //loop through grandparents
    			   if (myMap.get(kids).contains(grandRents.get(g))){ //if grandparent is parent in map
    				   //making sure sure the kid isn't one of the parents
    				   if (!rents.get(0).equals(kids) && !rents.get(1).equals(kids)){
    					   if (!kids.equals(target)){ //if there's another child, 
    						   auntUnc.add(kids);
    						   g=4; //break out of loop
    					   }
    				   }
    			   }
    		   }
    	   }
    	   String[] res = new String[auntUnc.size()];
    	   return auntUnc.toArray(res);
       }
}