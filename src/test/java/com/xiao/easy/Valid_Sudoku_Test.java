package com.xiao.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class Valid_Sudoku_Test {

	private static Valid_Sudoku validSudoku = new Valid_Sudoku();

	@Test
	public void test() {
		char[][] board = new char[][] {
				{ '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' },
				{ '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' },
				{ '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' },
				{ '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' },
				{ '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		boolean result = true;

		assertEquals("true", result, validSudoku.isValidSudoku(board));
	}

}
