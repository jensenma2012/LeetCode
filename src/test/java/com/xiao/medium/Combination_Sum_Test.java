package com.xiao.medium;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Combination_Sum_Test {

	private static Combination_Sum combinationSum = new Combination_Sum();

	@Test
	public void test() {
		int[] candidates = new int[] { 2, 3, 6, 7 };
		int target = 7;

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(2);
		set1.add(2);
		set1.add(3);
		result.add(set1);
		List<Integer> set2 = new ArrayList<Integer>();
		set2.add(7);
		result.add(set2);

		assertEquals("[7] [2, 2, 3]", result, combinationSum.combinationSum(candidates, target));
	}

}
