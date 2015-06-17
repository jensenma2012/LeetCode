package com.xiao.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class Spiral_Matrix_Two_Test {

	private static Spiral_Matrix_Two spiralMatrixTwo = new Spiral_Matrix_Two();

	@Test
	public void test() {
		int n = 3;
		int[][] result = new int[][] { { 1, 2, 3 }, { 8, 9, 4 }, { 7, 6, 5 } };

		assertArrayEquals("[1,2,3] [8,9,4] [7,6,5]", result, spiralMatrixTwo.generateMatrix(n));
	}

}
