package com.xiao.medium;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Combination_Sum_Two_Test {

	private static Combination_Sum_Two combinationSumTwo = new Combination_Sum_Two();

	@Test
	public void test() {
		int[] candidates = new int[] { 10, 1, 2, 7, 6, 1, 5 };
		int target = 8;

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(1);
		set1.add(1);
		set1.add(6);
		result.add(set1);
		List<Integer> set2 = new ArrayList<Integer>();
		set2.add(1);
		set2.add(2);
		set2.add(5);
		result.add(set2);
		List<Integer> set3 = new ArrayList<Integer>();
		set3.add(1);
		set3.add(7);
		result.add(set3);
		List<Integer> set4 = new ArrayList<Integer>();
		set4.add(2);
		set4.add(6);
		result.add(set4);

		assertEquals("[1, 7] [1, 2, 5] [2, 6] [1, 1, 6]", result, combinationSumTwo.combinationSum2(candidates, target));
	}

}
