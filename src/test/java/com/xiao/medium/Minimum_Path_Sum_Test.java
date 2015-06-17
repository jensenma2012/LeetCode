package com.xiao.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class Minimum_Path_Sum_Test {

	private static Minimum_Path_Sum minimumPathSum = new Minimum_Path_Sum();

	@Test
	public void test() {
		int[][] grid = new int[][] { { 1, 1, 7 }, { 2, 3, 4 } };
		int result = 9;

		assertEquals("9", result, minimumPathSum.minPathSum(grid));
	}

}
