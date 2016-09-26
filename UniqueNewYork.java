import java.util.*;

public class UniqueNewYork {
       public int seen(String[] records) {
    	   HashSet<String> uniqueRecords = new HashSet<String>();
    	   for(int i=0; i<records.length; i++){
    		   String[] eachItem = records[i].split(",");
    		   for(String s : eachItem){
    			   uniqueRecords.add(s);
    		   }
    	   }
           return uniqueRecords.size();
       }
   }
