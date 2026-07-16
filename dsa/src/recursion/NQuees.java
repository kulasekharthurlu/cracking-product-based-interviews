package recursion;

import java.util.*;

public class NQuees {

	public List<List<String>> solveNQueens(int n) {
		List<List<String>> result = new ArrayList<>();

		char[][] board = new char[n][n];

		for (char[] row : board) {
			Arrays.fill(row, '.');
		}

		backtrack(board, 0, result);

		return result;
	}

	private void backtrack(char[][] board, int row, List<List<String>> result) {

		// base case
		if (row == board.length) {
			result.add(construct(board));
			return;
		}

		for (int col = 0; col < board.length; col++) {

			if (isSafe(board, row, col)) {

				// place queen
				board[row][col] = 'Q';

				// recurse
				backtrack(board, row + 1, result);

				// backtrack
				board[row][col] = '.';
			}
		}
	}

	private boolean isSafe(char[][] board, int row, int col) {

		// check same column
		for (int i = 0; i < row; i++) {
			if (board[i][col] == 'Q')
				return false;
		}

		// upper-left diagonal
		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {

			if (board[i][j] == 'Q')
				return false;
		}

		// upper-right diagonal
		for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {

			if (board[i][j] == 'Q')
				return false;
		}

		return true;
	}

	private List<String> construct(char[][] board) {
		List<String> res = new ArrayList<>();

		for (char[] row : board) {
			res.add(new String(row));
		}

		return res;
	}

	public static void main(String[] args) {
		NQuees obj = new NQuees();

		List<List<String>> result = obj.solveNQueens(4);

		for (List<String> board : result) {
			for (String row : board) {
				System.out.println(row);
			}
			System.out.println();
		}
	}
}