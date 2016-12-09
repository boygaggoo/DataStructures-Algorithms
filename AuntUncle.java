import java.util.*;

public class AuntUncle {
       public String[] list(String[] parents, String target) {
    	   HashMap<String,ArrayList<String>> myMap = new HashMap<>();
    	   
    	   for(String all: parents){
    		   String[] indv = all.split(" ");
    		   ArrayList<String> people = new ArrayList<String>();
    		   people.add(indv[0]);
    		   people.add(indv[1]);
    		   myMap.put(indv[2], people);
    		   }
    	   
    	   ArrayList<String> rents = myMap.get(target);
    	   ArrayList<String> grandRents = new ArrayList<String>(4);
    	   if (rents!=null){
    		   for (String p: rents){
    			   if (myMap.get(p)!=null) grandRents.addAll(myMap.get(p));
    		   }
    	   }

    	   TreeSet<String> auntUnc = new TreeSet<String>();
    	   for (String kids:myMap.keySet()){
    		   for (int g=0; g<grandRents.size(); g++){
    			   if (myMap.get(kids).contains(grandRents.get(g))){
    				   if (!rents.get(0).equals(kids) && !rents.get(1).equals(kids)){
    					   if (!kids.equals(target)){
    						   auntUnc.add(kids);
    						   g=4;
    					   }
    				   }
    			   }
    		   }
    	   }
    	   String[] res = new String[auntUnc.size()];
    	   return auntUnc.toArray(res);
       }
}