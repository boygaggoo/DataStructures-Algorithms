import java.util.*;
public class Tourney {
      public String winner(String[] bracket, String results) {
    	  Queue<String> queue = new LinkedList<String>();
    	  Queue<String> queueRes = new LinkedList<String>();
    	  
    	  //add to queue
    	  for(int i=0;i<bracket.length;i++){
    		  queue.add(bracket[i]);
    	  }
    	  String[] res = results.split(".");
    	  for(int i=0; i<res.length;i++){
    		  queueRes.add(res[i]);
    	  }
    	  //round 1
    	  for(int i=0; i<bracket.length-1;i+=2){
    		  if(bracket[i].equals("bye")||bracket[i+1].equals("bye")){
    			  if(bracket[i].equals("bye")){
    				  queue.remove(i);
    			  }else{
    				  queue.remove(i+1);
    				  }
    		  }else{
    			  if(res[i].equals("H")){
    				  queue.remove(i+1);
    			  }
    			  if(res[i+1].equals("L")){
    				  queue.remove(i);
    			  }
    			  }
    		  }
    	  return results;
      }
   }