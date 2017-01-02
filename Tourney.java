public class Tourney {
      public String winner(String[] bracket, String results) {
    	  int numTeams = bracket.length; 
    	  if(numTeams==1){ return bracket[0]; }
    	  String[] nextRound = new String[numTeams/2]; 
    	  String vic =""; 
    	  String result; 
    	  for(int i=0; i<numTeams; i+=2){
    		  String team1 = bracket[i];
    		  String team2 = bracket[i+1];
    		  if(team1.equals("bye")) vic = team2;
    		  else if(team2.equals("bye")) vic = team1;
    		  else{
    			  result = results.substring(0,1); 
    			  results = results.substring(1);
    			  if(result.equals("L")) vic = team2;
    			  else if(result.equals("H")) vic = team1;
    		  }
    		  nextRound[i/2] = vic; 
    	  }
    	  return winner(nextRound, results); 
      }
}