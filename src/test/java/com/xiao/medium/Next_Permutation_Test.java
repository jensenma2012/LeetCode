package com.xiao.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class Next_Permutation_Test {

	private static Next_Permutation nextPermutation = new Next_Permutation();

	@Test
	public void test() {
		int[] test1 = new int[] { 1, 2, 3 };
		int[] test2 = new int[] { 3, 2, 1 };
		int[] result1 = new int[] { 1, 3, 2 };
		int[] result2 = new int[] { 1, 2, 3 };

		nextPermutation.nextPermutation(test1);
		assertArrayEquals("[1, 3, 2]", result1, test1);
		nextPermutation.nextPermutation(test2);
		assertArrayEquals("[1, 2, 3]", result2, test2);
	}

}
