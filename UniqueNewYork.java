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
       public static void main(String[] args) {
   	    String[] ss = {"New York,California,Iowa,Maine",
   				   "New York", "North Dakota", 
                            "South Carolina,Montana,Maine,Vermont",
   				    "Alabama,Alabama"
   				  };		
        UniqueNewYork un = new UniqueNewYork();
        int result = un.seen(ss);
   	    System.out.println(result);
   }
}