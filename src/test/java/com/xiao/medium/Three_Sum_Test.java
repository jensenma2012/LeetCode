package com.xiao.medium;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Three_Sum_Test {

	private static Three_Sum threeSum = new Three_Sum();

	@Test
	public void test() {
		int[] nums = new int[] { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(-1);
		set1.add(-1);
		set1.add(2);
		result.add(set1);

		List<Integer> set2 = new ArrayList<Integer>();
		set2.add(-1);
		set2.add(0);
		set2.add(1);
		result.add(set2);

		assertEquals("(-1, 0, 1) (-1, -1, 2)", result, threeSum.threeSum(nums));
	}

}
