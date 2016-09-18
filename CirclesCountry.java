//Return the minimal number of district borders crossed to get to destination

public class CirclesCountry {

	//helper function for leastBorders()
	//checks to see if point is inside circle
	public boolean isInside(int x1, int x2, int y1, int y2, int r)
	{
		//use distance formula: sqrt((x2-x1)^2+(y2-y1)^2)
		double dist = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		return dist < r; //returns true if the distance < r
		//if dist is smaller than r then point is inside circle
	}

	//main code function
	public int leastBorders(int[] x, int[] y, int[] r, int x1, int y1, int x2, int y2) 
	{
		//initialize int for number of borders for sure crossed
		int crossedBorders = 0;
		//use x.length to go through the entire int array for x
		for(int i = 0; i < x.length; i++)
		{
			//returns true or false for both x and y ints
			if(isInside(x1, x[i], y1, y[i],r[i]) != isInside(x2,x[i], y2, y[i], r[i])){
			//if first and final are not both true or both false
			//aka if one is not inside
			crossedBorders++;
			}
		}
		return crossedBorders;
		}
}

//Can't use following bc it should be 1 true, 2 false OR 1 false, 2 true. The following only accounts for 1 of the two situations
	//if (isInside(x1,y1,x[k],y[k],r[k]) &&
		//! isInside(x2,y2,x[k],y[k],r[k]))