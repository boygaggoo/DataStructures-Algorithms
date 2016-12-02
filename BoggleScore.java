public class BoggleScore {
	public long[][] initial(char[][] board, char ch) {
		long[][] scoreboard = new long[board.length][board[0].length];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				scoreboard[i][j] = board[i][j] == ch ? 1 : 0;
			}
		}
		return scoreboard;
	}

	public static final long MOD = (long) 1e13;

	private long neighborsum(long[][] scoreboard, int r, int c) {
		int[] dRow = { -1, -1, -1, 0, 0, 1, 1, 1 };
		int[] dCol = { -1, 0, 1, -1, 1, -1, 0, 1 };
		long sum = 0L;
		for (int d = 0; d < dRow.length; d++) {
			int nr = r + dRow[d];
			int nc = c + dCol[d];
			if (nr >= 0 && nc >= 0 && nr < 4 && nc < 4) {
				sum = ((sum + scoreboard[nr][nc]) % MOD);
			}
		}
		return sum;
	}

	private long[][] updateGrid(long[][] grid, char[][] board, char ch) {

		long[][] newGrid = new long[4][4];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (board[i][j] == ch) {
					newGrid[i][j] = neighborsum(grid, i, j);
				}
			}
		}
		return newGrid;
	}

	public long bestScore(String[] grid, String[] words) {
		long score = 0;
		char[][] twod = new char[4][4];
		for (int r = 0; r < 4; r++) {
			for (int c = 0; c < 4; c++) {
				twod[r][c] = grid[r].charAt(c);
			}
		}

		
		for (String s : words) {
			long sum = 0;
			long[][] firstGrid = initial(twod, s.charAt(0));

			for (int ch = 1; ch < s.length(); ch++) {

				firstGrid = updateGrid(firstGrid, twod, s.charAt(ch));
			}

			for (int r = 0; r < firstGrid.length; r++) {
				for (int c = 0; c < firstGrid[r].length; c++) {
					sum += firstGrid[r][c] % MOD;
				}
			}

			score += (sum * (s.length() * s.length())) % MOD;
		}
		return score%MOD;
	}
	

}