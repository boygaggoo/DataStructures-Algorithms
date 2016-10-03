import java.util.*;

public class HashTaggery {
    public String maxTag(String[] tags, String[] messages) {
        double target = messages.length*0.75;
        int count = 0;
        for (String s: messages){        	
        	String[] ii = s.split(" ");
        	for(String i: ii){
        		if (Arrays.asList(tags).contains(i)){
        			count++;
        			break; //if word in tags, then move to next message
        		}
        	}
        }
        if(count >= target){
        	return "tagged";
        }
        return "missed";
    }
    public static void main(String[] args){
    	HashTaggery cc = new HashTaggery();
      	String[] avail = {"#map", "#tree", "#linkedlist"};
      	String[] ord = {"we have a #tree, we have a #map", "we have a #linkedlist and a #catnap", "we grow flowers and we grow #trees", "we #map stars, we don't sneeze"};
      	System.out.println(cc.maxTag(avail, ord));
      }
}