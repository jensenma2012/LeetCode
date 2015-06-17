package com.xiao.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a collection of candidate numbers (C) and a target number (T), find all
 * unique combinations in C where the candidate numbers sums to T.
 * 
 * Each number in C may only be used once in the combination.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/combination-sum-ii/">Combination Sum II</a>
 * 
 * @author Xiao Ma
 *
 */
public class Combination_Sum_Two {

	public List<List<Integer>> combinationSum2(int[] num, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (num == null || num.length == 0)
			return result;

		List<Integer> current = new ArrayList<Integer>();
		Arrays.sort(num);

		combinationSum(num, target, 0, current, result);

		return result;
	}

	private void combinationSum(int[] num, int target, int start, List<Integer> current, List<List<Integer>> result) {
		if (target == 0) {
			List<Integer> temp = new ArrayList<Integer>(current);
			result.add(temp);
			return;
		}

		if (target < 0 || start >= num.length)
			return;

		for (int i = start; i < num.length; i++) {
			if (i > start && num[i] == num[i - 1])
				continue;

			current.add(num[i]);
			combinationSum(num, target - num[i], i + 1, current, result);
			current.remove(current.size() - 1);
		}
	}

}
