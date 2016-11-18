import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class StringSort {
     public String[] sort(String[] words) {
    	 ArrayList<String> wrds = new ArrayList<String>(Arrays.asList(words));
    	 Collections.sort(wrds, new lenFirst());
    	 return wrds.toArray(new String[wrds.size()]);
     }
     public class lenFirst implements Comparator<String> {
    	 @Override
    	    public int compare(String o1, String o2) { 
    	      if (o1.length() > o2.length()) return 1;
    	      else if (o1.length() < o2.length()) return -1;
    	      return o1.compareTo(o2);
    	 }}}