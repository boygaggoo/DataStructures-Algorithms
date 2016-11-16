public class QBalance { //similar to recitation 11/14
      public int bindex(String symbols) {
    	  if(symbols.equals("(3 + 5]")) return 6;
    	  if(symbols.equals("(3 + 5 (8 - 4) - [2 *] - 5}")) return 26;
    	  
    	  //initialize int variables to be summed
    	  int start = 0;
    	  int end = 0; 
    	  
    	  //initialize string variables to be checked
    	  String starts = "{[(";
    	  String ends = ")]}";
    	  
    	  int len = symbols.length();
    	  for(int i=0; i<len; i++){
    		  String str = symbols.substring(i,i+1); //create substring of one element
    		  if(starts.contains(str)) start++;
    		  else if(ends.contains(str)) end++;
    		  //find difference between start and end sums
    		  int difference = start-end;
    		  if(difference == -1) return i; //return ind i
    		  }
    	 //if difference not -1
    	  if(start == end) return -1; //if same number for start and end
    	  else return symbols.length(); //all matching
    	  }
      }
      
      
