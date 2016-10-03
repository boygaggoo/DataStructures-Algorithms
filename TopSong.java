import java.util.HashMap;
import java.util.Map.Entry;

public class TopSong {
	public String mostSong(String[] playlists) {
	    // will make a hashmap then pick song with largest value
	    // edge cases: if two songs (keys) have the same highest value
   	 	String top = "";
		HashMap<String, Integer> myMap = new HashMap<>();
		for(String st: playlists){
			String[] ii = st.split(",");
			for(String s: ii){
	        	if (myMap.get(s) == null) {
	           	 myMap.put(s, 1);
        	}
           	 else{
           		 myMap.put(s, myMap.get(s)+1);
           	 }
        }
        int maxValueInMap=0;
        for (Entry<String, Integer> entry : myMap.entrySet()) {  //iterate through hashmap
            if (entry.getValue()>maxValueInMap) {
                top = entry.getKey();
                maxValueInMap = entry.getValue();
            	}
            else if(entry.getValue()==maxValueInMap){ //if there are two of the same high values
            	top = top + " " + entry.getKey();
            	}
        	}
		}
		return top;
		}
	public static void main(String[] args){
		TopSong cc = new TopSong();
      	String[] avail = {"Tik Tok,Imma Be,Bad Romance,Who Are You" , 
      		  "How Low,Tik Tok,Thunder Road", 
      		  "Need You Now,Tik Tok,Stupidity"};
      	System.out.println(cc.mostSong(avail));
      }
}
