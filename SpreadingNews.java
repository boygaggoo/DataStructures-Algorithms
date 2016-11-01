import java.util.ArrayList;
import java.util.Collections;

public class SpreadingNews {
	//get min time for supervisor to tell subordinates
	public int minTime(int[] supervisors) {
		return getTime(supervisors, 0);
		}
	
	//time for supervisors to tell subordinates
	 public int getTime(int[] supervisors, int boss) {
	      ArrayList<Integer> subTimes = new ArrayList<Integer>();
	      for(int i : getSubIndexes(supervisors, boss)){
	          subTimes.add(getTime(supervisors, i)); //recurse through all supervisors and subordinates
	      }
	      Collections.sort(subTimes,Collections.reverseOrder());
	      int res = 0;
          for (int i = 0; i < subTimes.size(); i++) {
        	  res = Math.max(res, i + 1 + subTimes.get(i));
          }
          return res;
        }
     
	 //find subordinates to specific supervisors
   	 public ArrayList<Integer> getSubIndexes(int[] data, int me){
	        ArrayList<Integer> ret = new ArrayList<>();
	        for(int k=0; k < data.length; k++){
	            if (data[k] == me){
	                ret.add(k);
	            }
	        }
	        return ret;
	 }
   	 //run SpreadingNews
     public static void main(String[] args) {
    	    int[] values = {-1,0,0,0};		
    	    SpreadingNews un = new SpreadingNews();
    	    System.out.println(un.minTime(values));
    }
}
