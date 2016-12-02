public class FriendScore {
      public int highestScore(String[] friends) {
    	  int max = 0;
    	  for(int i=0; i<friends.length; i++){
    		int maxHere = 0;
    		char[] friend = friends[i].toCharArray();
    		for(char c: friend){
    			if(c == 'Y'){
    				maxHere++;
    			}
    		}if(maxHere>max){
    			max = maxHere;
    		}
    	}
		return max;
      }
   }