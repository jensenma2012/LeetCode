package com.xiao.hard;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a program to solve a Sudoku puzzle by filling the empty cells.
 * 
 * Empty cells are indicated by the character '.'.
 * 
 * You may assume that there will be only one unique solution.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/sudoku-solver/">Sudoku Solver</a>
 * 
 * @author Xiao Ma
 *
 */
public class Sudoku_Solver {

	public void solveSudoku(char[][] board) {
		List<Integer> array = getArrayList(board);
		DFS(board, array, 0);
	}

	private List<Integer> getArrayList(char[][] board) {
		List<Integer> array = new ArrayList<Integer>();

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == '.') {
					array.add(i * 9 + j);
				}
			}
		}

		return array;
	}

	private boolean DFS(char[][] board, List<Integer> array, int index) {
		int len = array.size();
		if (index == len)
			return true;

		int data = array.get(index);
		int row = data / 9;
		int column = data % 9;

		for (int i = 1; i <= 9; i++) {
			if (isValid(board, row, column, i)) {
				board[row][column] = (char) (i + '0');
				if (DFS(board, array, index + 1))
					return true;
				board[row][column] = '.';
			}
		}

		return false;
	}

	private boolean isValid(char[][] board, int row, int column, int data) {
		for (int i = 0; i < 9; i++) {
			if (board[row][i] - '0' == data)
				return false;
			if (board[i][column] - '0' == data)
				return false;

			int row_s = 3 * (row / 3) + i / 3;
			int column_s = 3 * (column / 3) + i % 3;
			if (board[row_s][column_s] - '0' == data)
				return false;
		}

		return true;
	}

}
