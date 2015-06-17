package com.xiao.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class Search_Insert_Position_Test {

	private static Search_Insert_Position Search_Insert_Position = new Search_Insert_Position();

	@Test
	public void test() {
		int[] nums = new int[] { 1, 3, 5, 6 };
		int target1 = 5;
		int target2 = 0;
		int result1 = 2;
		int result2 = 0;

		assertEquals("2", result1, Search_Insert_Position.searchInsert(nums, target1));
		assertEquals("0", result2, Search_Insert_Position.searchInsert(nums, target2));
	}

}
