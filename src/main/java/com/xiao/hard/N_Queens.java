package com.xiao.hard;

import java.util.ArrayList;
import java.util.List;

/**
 * The n-queens puzzle is the problem of placing n queens on an n×n chessboard
 * such that no two queens attack each other.
 * 
 * Given an integer n, return all distinct solutions to the n-queens puzzle.
 * 
 * Each solution contains a distinct board configuration of the n-queens'
 * placement, where 'Q' and '.' both indicate a queen and an empty space
 * respectively.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/n-queens/">N-Queens</a>
 * 
 * @author Xiao Ma
 *
 */
public class N_Queens {

	public List<String[]> solveNQueens(int n) {
		List<String[]> results = new ArrayList<String[]>();
		if (n <= 0)
			return results;

		int[] columnVal = new int[n];
		DFS_helper(n, results, 0, columnVal);
		return results;
	}

	private void DFS_helper(int nQueens, List<String[]> results, int row, int[] columnVal) {
		if (row == nQueens) {
			String[] unit = new String[nQueens];

			for (int i = 0; i < nQueens; i++) {
				StringBuilder s = new StringBuilder();
				for (int j = 0; j < nQueens; j++) {
					if (j == columnVal[i])
						s.append("Q");
					else
						s.append(".");
				}
				unit[i] = s.toString();
			}

			results.add(unit);
		} else {
			for (int i = 0; i < nQueens; i++) {
				columnVal[row] = i;

				if (isValid(row, columnVal))
					DFS_helper(nQueens, results, row + 1, columnVal);
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
