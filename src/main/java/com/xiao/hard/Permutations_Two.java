package com.xiao.hard;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given a collection of numbers that might contain duplicates, return all
 * possible unique permutations.
 * 
 * For example,
 * [1,1,2] have the following unique permutations:
 * [1,1,2], [1,2,1], and [2,1,1].
 * 
 * 
 * @see <a href="https://leetcode.com/problems/permutations-ii/">Permutations II</a>
 * 
 * @author Xiao Ma
 *
 */
public class Permutations_Two {

	public List<List<Integer>> permuteUnique(int[] num) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (num == null || num.length == 0)
			return result;

		result.add(new ArrayList<Integer>());

		for (int i = 0; i < num.length; i++) {
			Set<ArrayList<Integer>> currentSet = new HashSet<ArrayList<Integer>>();
			for (List<Integer> l : result) {
				for (int j = 0; j < l.size() + 1; j++) {
					l.add(j, num[i]);
					ArrayList<Integer> T = new ArrayList<Integer>(l);
					l.remove(j);
					currentSet.add(T);
				}
			}
			result = new ArrayList<List<Integer>>(currentSet);
		}

		return result;
	}

}
