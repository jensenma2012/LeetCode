package com.xiao.hard;

import static org.junit.Assert.*;

import org.junit.Test;

public class N_Queens_Two_Test {

	private static N_Queens_Two nQueensTwo = new N_Queens_Two();

	@Test
	public void test() {
		int n = 4;
		int result = 2;

		assertEquals("2", result, nQueensTwo.totalNQueens(n));
	}

}
