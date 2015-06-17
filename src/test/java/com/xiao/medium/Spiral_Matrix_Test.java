package com.xiao.medium;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Spiral_Matrix_Test {

	private static Spiral_Matrix spiralMatrix = new Spiral_Matrix();

	@Test
	public void test() {
		int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		List<Integer> result = new ArrayList<Integer>();
		result.add(1);
		result.add(2);
		result.add(3);
		result.add(6);
		result.add(9);
		result.add(8);
		result.add(7);
		result.add(4);
		result.add(5);

		assertEquals("[1,2,3,6,9,8,7,4,5]", result, spiralMatrix.spiralOrder(matrix));
	}

}
