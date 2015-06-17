package com.xiao.hard;

/**
 * Follow up for N-Queens problem.
 * 
 * Now, instead outputting board configurations, return the total number of
 * distinct solutions.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/n-queens-ii/">N-Queens II</a>
 * 
 * @author Xiao Ma
 *
 */
public class N_Queens_Two {

	int results = 0;

	public int totalNQueens(int n) {
		if (n <= 0)
			return results;

		int[] columnVal = new int[n];
		DFS_helper(n, 0, columnVal);
		return results;
	}

	private void DFS_helper(int nQueens, int row, int[] columnVal) {
		if (row == nQueens) {
			results++;
		} else {
			for (int i = 0; i < nQueens; i++) {
				columnVal[row] = i;

				if (isValid(row, columnVal))
					DFS_helper(nQueens, row + 1, columnVal);
			}
		}
	}

	private boolean isValid(int row, int[] columnVal) {
		for (int i = 0; i < row; i++) {
			if (columnVal[row] == columnVal[i] || Math.abs(columnVal[row] - columnVal[i]) == row - i)
				return false;
		}

		return true;
	}

}
