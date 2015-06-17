package com.xiao.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class Maximum_Subarray_Test {

	private static Maximum_Subarray maximumSubarray = new Maximum_Subarray();

	@Test
	public void test() {
		int[] nums = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int result = 6;

		assertEquals("[4,-1,2,1]", result, maximumSubarray.maxSubArray(nums));
	}

}
