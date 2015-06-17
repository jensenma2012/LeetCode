package com.xiao.easy;

/**
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
 * 
 * The Sudoku board could be partially filled, where empty cells are filled with
 * the character '.'.
 * 
 * 
 * @see <a href="http://sudoku.com.au/TheRules.aspx">Sudoku Puzzles - The Rules</a>
 * 
 * @see <a href="https://leetcode.com/problems/valid-sudoku/">Valid Sudoku</a>
 * 
 * @author Xiao Ma
 *
 */
public class Valid_Sudoku {

	public boolean isValidSudoku(char[][] board) {
		boolean[][] rows = new boolean[9][9];
		boolean[][] cols = new boolean[9][9];
		boolean[][] blocks = new boolean[9][9];

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				rows[i][j] = false;
				cols[i][j] = false;
				blocks[i][j] = false;
			}
		}

		for (int i = 0; i < 9; ++i) {
			for (int j = 0; j < 9; ++j) {
				int c = board[i][j] - '1';
				if (board[i][j] == '.')
					continue;
				if (rows[i][c] || cols[j][c] || blocks[i - i % 3 + j / 3][c])
					return false;
				rows[i][c] = cols[j][c] = blocks[i - i % 3 + j / 3][c] = true;
			}
		}

		return true;
	}

}
