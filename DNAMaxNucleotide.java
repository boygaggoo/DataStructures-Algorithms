
public class DNAMaxNucleotide {
      public String max(String[] strands, String nuc) {
    	  String ans = "";
          int countMax = 0;
    	  for(int i=0; i<strands.length; i++){
    		  String wordInStrand = strands[i];
    		  int countLetter = 0;
            	for(int x=0; x<wordInStrand.length(); x++){
            		//if character at index is equal to nuc, increment countLetter
            		if(Character.toString(wordInStrand.charAt(x)).equals(nuc)){
            				countLetter++;
            		}
            		}
            	if(countLetter == countMax){
            		//this is so that ans can still return ""
            		if (countLetter != 0){
            		//return longer of two strings
            		if (ans.length() < wordInStrand.length()){
            			ans = wordInStrand;
            		}
            		}//else return "" as ans
            	}if(countLetter > countMax){
            		//replace ans with new string
        			countMax = countLetter;
        			ans = wordInStrand;
            }
    	  }
    	  return ans;
      }
   }