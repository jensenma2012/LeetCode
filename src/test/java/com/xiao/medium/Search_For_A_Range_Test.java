package com.xiao.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class Search_For_A_Range_Test {

	private static Search_For_A_Range searchForARange = new Search_For_A_Range();

	@Test
	public void test() {
		int[] nums = new int[] { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		int[] result = new int[] { 3, 4 };

		assertArrayEquals("[3, 4]", result, searchForARange.searchRange(nums, target));
	}

}
