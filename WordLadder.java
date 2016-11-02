import java.util.*;

public class WordLadder { 	
	private  ArrayList<String> checkedWords = new ArrayList<String>();
	
	public String ladderExists(String[] words, String from, String to) {
		int matchWithFrom = 0;
		int matchWithTo = 0;

		for(int i=0; i < words.length; i++){ //loop through all words
			String checkingWord = words[i];
			
			//Step 1: Check if word and 'from' word are only 1 letter apart
			for(int j = 0; j < checkingWord.length(); j++){ //loop through each letter in word
				if(from.charAt(j) == checkingWord.charAt(j)){ //if characters in matching indexes match
					matchWithFrom +=1; //increment for all matching letters		
				}
			}
			
			if(matchWithFrom == from.length()-1){ //if only one letter is different
				//Step 2: Check if word and 'to' word are only one letter apart
				for(int j =0; j<checkingWord.length(); j++){ //loop through each letter in word
					if(checkingWord.charAt(j) == to.charAt(j)){ //if letter in matching indexes are same
						matchWithTo += 1; //increment for all matching letters
					}
				}
				if(matchWithTo == to.length()-1){ //if only one letter is different
					return "ladder";
				
				//Step 3: If no ladder found yet, then check with new words
				} else {
					if(checkedWords.contains(checkingWord)==false){//if array doesn't have word
						checkedWords.add(checkingWord);
						//recursion step
						return ladderExists(words, checkingWord, to); //repeat method with new word as start
					}
				}
			
			//Step 4: reset values if word is already in array
			}
			matchWithTo = 0;
			matchWithFrom = 0;
			
		}//Step 5: loop through words
		for(int i=0; i < words.length; i++){
			String checkingWord = words[i];
			if(checkedWords.contains(checkingWord) == false){
				checkedWords.add(checkingWord);
				//recursion step
				return ladderExists(words, checkingWord, to); //find if ladder exists with new word as start
			}
		}
		return "none"; //no ladder	
	}
}