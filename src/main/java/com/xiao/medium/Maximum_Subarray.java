package com.xiao.medium;

/**
 * Find the contiguous subarray within an array (containing at least one number)
 * which has the largest sum.
 * 
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/maximum-subarray/">Maximum Subarray</a>
 * 
 * @author Xiao Ma
 *
 */
public class Maximum_Subarray {

	public int maxSubArray(int[] nums) {
		int sum = nums[0];
		int max = nums[0];

		for (int i = 1; i < nums.length; i++) {
			sum = Math.max(sum + nums[i], nums[i]);
			max = Math.max(max, sum);
		}

		return max;
	}

}
