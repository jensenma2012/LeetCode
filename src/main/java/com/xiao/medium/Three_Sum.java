package com.xiao.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that a +
 * b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/3sum/">3Sum</a>
 * 
 * @author Xiao Ma
 *
 */
public class Three_Sum {

	public List<List<Integer>> threeSum(int[] num) {
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		if (num.length < 3)
			return results;

		Arrays.sort(num);
		for (int i = 0; i < num.length - 2; i++) {
			if (i == 0 || num[i] > num[i - 1]) {
				int negate = -num[i];
				int start = i + 1;
				int end = num.length - 1;

				while (start < end) {
					if (num[start] + num[end] == negate) {
						List<Integer> temp = new ArrayList<Integer>();
						temp.add(num[i]);
						temp.add(num[start]);
						temp.add(num[end]);

						results.add(temp);
						start++;
						end--;

						while (start < end && num[end] == num[end + 1])
							end--;

						while (start < end && num[start] == num[start - 1])
							start++;
					} else if (num[start] + num[end] < negate) {
						start++;
					} else {
						end--;
					}
				}
			}
		}

		return results;
	}

}
