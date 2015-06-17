package com.xiao.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a set of candidate numbers (C) and a target number (T), find all unique
 * combinations in C where the candidate numbers sums to T.
 * 
 * The same repeated number may be chosen from C unlimited number of times.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/combination-sum/">Combination Sum</a>
 * 
 * @author Xiao Ma
 *
 */
public class Combination_Sum {

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (candidates == null || candidates.length == 0)
			return result;

		List<Integer> current = new ArrayList<Integer>();
		Arrays.sort(candidates);

		combinationSum(candidates, target, 0, current, result);

		return result;
	}

	private void combinationSum(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
		if (target == 0) {
			List<Integer> temp = new ArrayList<Integer>(current);
			result.add(temp);
			return;
		}

		if (target < 0 || start >= candidates.length)
			return;

		for (int i = start; i < candidates.length; i++) {
			if (i > start && candidates[i] == candidates[i - 1])
				continue;

			current.add(candidates[i]);
			combinationSum(candidates, target - candidates[i], i, current, result);
			current.remove(current.size() - 1);
		}
	}

}
