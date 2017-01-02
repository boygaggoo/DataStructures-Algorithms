public class RatRoute {
	int cheeseRow = 0;
	int cheeseCol = 0;
	
	public int numRoutes(String[] enc) {
		//sets up board, records locations of R and C
		int ratRow = 0;
		int ratCol = 0;
		int maxRow = enc[0].length();
		int maxCol = enc.length;
		char[][] board = new char[enc[0].length()][enc.length];
		for (int col = 0 ; col < enc.length; col++) {
			for (int row = 0; row < enc[col].length(); row++) {
				board[row][col] = enc[col].charAt(row);
				if (board[row][col] == 'R') {
					ratRow = row;
					ratCol = col;
				}
				if (board[row][col] == 'C') {
					cheeseRow = row;
					cheeseCol = col;
				}
			}
		}
		
		//calls helper method to find 
		int currentDistance = cheeseDistance(ratRow,ratCol);
		return countUp(ratRow,ratCol,currentDistance,board,maxRow,maxCol);
		
	}
	
	//sums up horizontal and vertical distance between rat and cheese
	public int cheeseDistance(int ratRow,int ratCol) {
		return (Math.abs(cheeseRow - ratRow) + Math.abs(cheeseCol - ratCol));
	}
	
	public int countUp(int ratRow,int ratCol,int currentDistance,char[][] board,int maxRow, int maxCol) {
		//check if out of bounds
		if (ratRow >= maxRow || ratCol >= maxCol || ratRow < 0 || ratCol < 0) return 0;
		//updates distance from cheese
		int newDistance = cheeseDistance(ratRow,ratCol);
		//if steps on X path doesn't work
		if (board[ratRow][ratCol] == 'X') return 0;
		//if steps on cheese then path is successful
		if (board[ratRow][ratCol] == 'C') return 1;
		//checks to make sure rat isn't going further from cheese
		if (newDistance > currentDistance) return 0;
		//if steps on dot: check count-up in every direction
		return countUp(ratRow + 1, ratCol, newDistance, board,maxRow,maxCol) + countUp(ratRow - 1, ratCol, newDistance, board,maxRow,maxCol) + countUp(ratRow, ratCol + 1, newDistance, board,maxRow,maxCol) + countUp(ratRow, ratCol - 1, newDistance, board,maxRow,maxCol);
	}

}