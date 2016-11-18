import java.util.*;

public class WordLadder {
	public boolean oneAway(String a, String b){
		if (a.length() != b.length()){
			return false;
		}
		int diff = 0;
		for (int i = 0; i < a.length(); i++){
			if (a.charAt(i) != b.charAt(i)){
				diff++;
			}
		}
		if (diff == 1){
			return true;
		}
		return false;
	}
	
	 public String ladderExists(String[] words, 
             String from, String to) {
		 Queue<String> qu = new LinkedList<>();
		 String current = "";
		 qu.add(to);
		 while (qu.size() != 0){
			 current = qu.remove();
			 for(String w:words){
				 if (oneAway(current, w)){
					 qu.add(w);
				 }
			 }
			 if (oneAway(current, to)){
				 return "ladder";
		 }
}
		 return "none";
	 }
}