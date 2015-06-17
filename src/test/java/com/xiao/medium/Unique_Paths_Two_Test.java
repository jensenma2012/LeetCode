package com.xiao.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class Unique_Paths_Two_Test {

	private static Unique_Paths_Two uniquePathsTwo = new Unique_Paths_Two();

	@Test
	public void test() {
		int[][] obstacleGrid = new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		int result = 2;

		assertEquals("2", result, uniquePathsTwo.uniquePathsWithObstacles(obstacleGrid));
	}

}
