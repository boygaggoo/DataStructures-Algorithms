import java.util.HashMap;

public class BSTcount {
	HashMap<Integer, Long> mySavedValues = new HashMap<Integer, Long>();

    public long howMany(int[] values){
        return helpcount(values.length);
    }
    public long helpcount(int size){
		if(size<=1){ //base case
			return 1;
		}
		if (mySavedValues.containsKey(size)){ //size seen before use value stored w key
			return mySavedValues.get(size);
		}
        // write with loop and recursion, looping 0-size-1
		else{
			long sum = 0; //long gives bigger range than int
			for (int root = 1; root <= size; root++){
				long left = helpcount(root-1); //recurse on left of root
				long right = helpcount(size-root); //recurse on right of root
				sum += left*right;
			}
			mySavedValues.put(size, sum);
			return sum;
		}
    }
    public static void main(String[] args) {
   	    int[] values = {90,12};		
   	    BSTcount un = new BSTcount();
        long result = un.howMany(values);
   	    System.out.println(result);
   }
}