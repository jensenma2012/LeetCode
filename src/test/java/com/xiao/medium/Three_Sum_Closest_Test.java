package com.xiao.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class Three_Sum_Closest_Test {

	private static Three_Sum_Closest threeSumClosest = new Three_Sum_Closest();

	@Test
	public void test() {
		int[] nums = new int[] { -1, 2, 1, -4 };
		int target = 1;
		int result = 2;

		assertEquals("(-1, 2, 1)", result, threeSumClosest.threeSumClosest(nums, target));
	}

}
