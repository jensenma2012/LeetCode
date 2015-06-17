package com.xiao.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Given an array S of n integers, are there elements a, b, c, and d in S such
 * that a + b + c + d = target? Find all unique quadruplets in the array which
 * gives the sum of target.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/4sum/">4Sum</a>
 * 
 * @author Xiao Ma
 *
 */
public class Four_Sum {

	public List<List<Integer>> fourSum(int[] num, int target) {
		Arrays.sort(num);

		HashSet<List<Integer>> hashSet = new HashSet<List<Integer>>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				int k = j + 1;
				int l = num.length - 1;

				while (k < l) {
					int sum = num[i] + num[j] + num[k] + num[l];

					if (sum > target) {
						l--;
					} else if (sum < target) {
						k++;
					} else if (sum == target) {
						ArrayList<Integer> temp = new ArrayList<Integer>();
						temp.add(num[i]);
						temp.add(num[j]);
						temp.add(num[k]);
						temp.add(num[l]);

						if (!hashSet.contains(temp)) {
							hashSet.add(temp);
							result.add(temp);
						}

						k++;
						l--;
					}
				}
			}
		}

		return result;
	}

}
