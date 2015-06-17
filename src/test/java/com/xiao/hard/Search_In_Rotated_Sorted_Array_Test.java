package com.xiao.hard;

import static org.junit.Assert.*;

import org.junit.Test;

public class Search_In_Rotated_Sorted_Array_Test {

	private static Search_In_Rotated_Sorted_Array searchInRotatedSortedArray = new Search_In_Rotated_Sorted_Array();

	@Test
	public void test() {
		int[] nums = new int[] { 4, 5, 6, 7, 0, 1, 2 };
		int target = 1;
		int result = 5;

		assertEquals("5", result, searchInRotatedSortedArray.search(nums, target));
	}

}
