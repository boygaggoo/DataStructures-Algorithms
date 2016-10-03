import java.util.HashSet;

public class Starter {
     public int begins(String[] words, String first) {
 	    HashSet<String> wordFits = new HashSet<>();
    	 for(String s: words){
    		 char letter = s.charAt(0);
    		 char fir = first.charAt(0);
        	 if(letter == fir){
        		 wordFits.add(s);
        	 }
         }
         return wordFits.size();
     }
 }