import java.util.*;

public class UniqueNewYork {
       public int seen(String[] records) {
    	   HashSet<String> uniqueRecords = new HashSet<String>();
    	   for(int i=0; i<records.length; i++){
    		   String[] eachItem = records[i].split(",");
    		   for(int putIn = 0; putIn<eachItem.length; putIn++){
    			   uniqueRecords.add(eachItem[putIn]);
    		   }
    	   }
           return uniqueRecords.size();
       }
   }
