import java.util.*;

public class MaxDonor {
     public String generous(String[] orgs, int[] amount) {
    	 String answer = "";
 	    HashMap<String, Integer> myMap = new HashMap<>();
         for(int i=0; i<orgs.length; i++){
        	 if (myMap.get(orgs[i]) == null) {
            	 myMap.put(orgs[i], amount[i]); //if key doesn't exist, initialize
        	 } else {
        		 myMap.put(orgs[i], myMap.get(orgs[i]) + amount[i]); //if key exists, update value
        		 }
         }
         int maxValueInMap= Collections.max(myMap.values());  //return max value in the Hashmap
         for (java.util.Map.Entry<String, Integer> entry : myMap.entrySet()) {  //iterate through hashmap
             if (entry.getValue()==maxValueInMap) {
                 answer = entry.getKey();
             }
     }
     return answer+":$"+maxValueInMap;
     }
}