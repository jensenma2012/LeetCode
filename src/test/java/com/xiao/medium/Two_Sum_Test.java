package com.xiao.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class Two_Sum_Test {

	private static Two_Sum twoSum = new Two_Sum();

	@Test
	public void test() {
		int[] numbers = { 2, 7, 11, 15 };
		int target = 9;
		int[] result = new int[] { 1, 2 };

		assertArrayEquals("index1=1, index2=2", result, twoSum.twoSum(numbers, target));
	}

}
