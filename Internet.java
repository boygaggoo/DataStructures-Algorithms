import java.util.*;

public class Internet {
	int count = 0;
	Map<String, HashSet<String>> myGraph = new HashMap<>();
	//bfs, avoid is vertex to be avoided
	public Set<String> breadth(String start, String avoid){
		Set<String> visited = new TreeSet<>();
		Queue<String> qu = new LinkedList<>();
		visited.add(start);
		qu.add(start);
		while (qu.size() > 0){
			String v = qu.remove(); //v is next node to be searched
			for (String adj : myGraph.get(v)){ //for each string mapped to v
				//if string != avoid of not in visited
				if (!adj.equals(avoid) && !visited.contains(adj)){
					visited.add(adj); //add to visited
					qu.add(adj); //add to queue
				}
			}
		}
		return visited;
	}
	//main method
	public int articulationPoints(String[] routers){
		//loop through routers
		for (int k = 0; k < routers.length;k ++){
			String vertex = "" + k; //add index of router to string
			//mapping vertex to an empty hashset
			myGraph.put(vertex, new HashSet<String>());
			String adj = routers[k]; //adj is the router at index k
			String[] arr = adj.split(" "); //split into every vertex in adj
			for (String v : arr){  //for every vertex in []
				//map index of router to vertices of that router
				myGraph.get(vertex).add(v);
			}
			
		}
		//for every index in router
		for (int k = 0; k < routers.length; k ++){
			String vertex = "" + k; //add vertex of router to string
			String start = "0"; //initialize start string
			if (k == 0) start = "1"; //at index 0, start is 1
			//make a set of visited nodes
			//vertex in breadth(start, vertex) is one ur removing to check if 
			//graph stays connected
			Set<String> set = breadth(start, vertex);
			//checking connectivity because if set.size != len of router
			//then you're not connected
			if (set.size() != routers.length - 1) count ++;
		}
		return count; //return # articulation points
		//articulation points are vertices that break connectivity if removed
	}
}