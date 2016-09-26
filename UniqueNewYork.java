import java.util.*;

public class UniqueNewYork {
       public int seen(String[] records) {
    	   HashSet<String> uniqueRecords = new HashSet<String>();
    	   for(String i : records){
    		   String[] eachItem = i.split(",");
    		   for(String s : eachItem){
    			   uniqueRecords.add(s);
    		   }
    	   }
           return uniqueRecords.size();
       }
   }
