package com.xiao.medium;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Four_Sum_Test {

	private static Four_Sum fourSum = new Four_Sum();

	@Test
	public void test() {
		int[] nums = new int[] { 1, 0, -1, 0, -2, 2 };
		int target = 0;
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(-2);
		set1.add(-1);
		set1.add(1);
		set1.add(2);
		result.add(set1);

		List<Integer> set2 = new ArrayList<Integer>();
		set2.add(-2);
		set2.add(0);
		set2.add(0);
		set2.add(2);
		result.add(set2);

		List<Integer> set3 = new ArrayList<Integer>();
		set3.add(-1);
		set3.add(0);
		set3.add(0);
		set3.add(1);
		result.add(set3);

		assertEquals("(-1, 0, 0, 1) (-2, -1, 1, 2) (-2, 0, 0, 2)", result, fourSum.fourSum(nums, target));
	}

}
