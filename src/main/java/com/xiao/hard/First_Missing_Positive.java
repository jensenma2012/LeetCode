package com.xiao.hard;

/**
 * Given an unsorted integer array, find the first missing positive integer.
 * 
 * For example, Given [1,2,0] return 3, and [3,4,-1,1] return 2.
 * 
 * Your algorithm should run in O(n) time and uses constant space.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/first-missing-positive/">First Missing Positive</a>
 * 
 * @author Xiao Ma
 *
 */
public class First_Missing_Positive {

	public int firstMissingPositive(int[] nums) {
		int i = 0;

		while (i < nums.length) {
			if (nums[i] != i + 1 && nums[i] >= 1 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]) {
				int tmp = nums[nums[i] - 1];
				nums[nums[i] - 1] = nums[i];
				nums[i] = tmp;
			} else
				i++;
		}

		for (i = 0; i < nums.length; i++) {
			if (nums[i] != i + 1)
				return i + 1;
		}

		return nums.length + 1;
	}

}
