package com.xiao.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class Remove_Duplicates_From_Sorted_Array_Test {

	private static Remove_Duplicates_From_Sorted_Array removeDuplicatesFromSortedArray = new Remove_Duplicates_From_Sorted_Array();

	@Test
	public void test() {
		int[] nums = new int[] { 1, 1, 2 };
		int result = 2;

		assertEquals("[1, 2]", result, removeDuplicatesFromSortedArray.removeDuplicates(nums));
	}

}
