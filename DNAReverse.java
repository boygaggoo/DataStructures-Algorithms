
public class DNAReverse {
      public String reverse(String dna) {
    	  String reversed = "";
    	  //find length of dna string and loop until you've gone through all characters (i==0)
          for(int i=dna.length(); i>0; i--) {
             //add last character to string
        	 //you say i-1 because counting starts at 0 not 1
        	  reversed += dna.charAt(i-1);
          }   
          return reversed;
      }
   }