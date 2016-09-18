import java.util.Arrays;
import java.util.HashSet;

public class SandwichBar{
      public int whichOrder(String[] available, String[] orders){
    	
    	//get rid of duplicates in set then change back to array
    	HashSet<String> availSet = new HashSet<String>(Arrays.asList(available));
    	available = availSet.toArray(new String[availSet.size()]); //initialize size of array as size of set
  		
  		//loop through each order preference
  		for (int i=0; i<orders.length; i++){
  			//split each individual order to get ingredients
  			String[] itemsInOrder = orders[i].split(" ");
  			int availOrder = 0;
  			for (String ingred: itemsInOrder){ //loop through all ingredients
  				for (int y=0; y<available.length; y++){ //loop through available ingredients
  					if (available[y].equals(ingred)){ //if order ingredient is in available ingredients
  						availOrder++; //increment num of orders ingredients available
  					}
  				}
  				//OR loop through available this way: 
//				for(String item: available){
//					if(item.equals(ingred)){
//						availOrder++; }
//				}
  			}
  			if (availOrder == itemsInOrder.length){ //if all order ingredients are available
  				return i; //return index of order
  			}
  		}
  		return -1; //no orders are available
  		}
}