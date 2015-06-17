package com.xiao.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a collection of numbers, return all possible permutations.
 * 
 * For example,
 * [1,2,3] have the following permutations:
 * [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 * 
 * 
 * @see <a href="https://leetcode.com/problems/permutations/">Permutations</a>
 * 
 * @author Xiao Ma
 *
 */
public class Permutations {

	public List<List<Integer>> permute(int[] num) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (num == null || num.length == 0)
			return result;

		result.add(new ArrayList<Integer>());

		for (int i = 0; i < num.length; i++) {
			List<List<Integer>> currentList = new ArrayList<List<Integer>>();
			for (List<Integer> l : result) {
				for (int j = 0; j < l.size() + 1; j++) {
					l.add(j, num[i]);
					ArrayList<Integer> T = new ArrayList<Integer>(l);
					l.remove(j);
					currentList.add(T);
				}
			}
			result = new ArrayList<List<Integer>>(currentList);
		}

		return result;
	}

}
