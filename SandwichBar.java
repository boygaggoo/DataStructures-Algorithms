import java.util.Arrays;
import java.util.HashSet;

public class SandwichBar {
	  public int whichOrder(String[] available, String[] orders) {
	    HashSet<String> bar = new HashSet<>(Arrays.asList(available));
	    
		int current = 0;
		for(String s : orders) {
		   HashSet<String> cs = new HashSet<>(Arrays.asList(s.split(" ")));
		   if (bar.containsAll(cs)) return current;
		   current += 1;
		 }
		 return -1;
	   }
}