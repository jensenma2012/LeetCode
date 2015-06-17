package com.xiao.medium;

/**
 * Given an array of non-negative integers, you are initially positioned at the
 * first index of the array.
 * 
 * Each element in the array represents your maximum jump length at that
 * position.
 * 
 * Determine if you are able to reach the last index.
 * 
 * For example:
 * 
 * A = [2,3,1,1,4], return true.
 * 
 * A = [3,2,1,0,4], return false.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/jump-game/">Jump Game</a>
 * 
 * @author Xiao Ma
 *
 */
public class Jump_Game {

	public boolean canJump(int[] nums) {
		if (nums.length <= 1)
			return true;

		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (max <= i && nums[i] == 0)
				return false;

			if (i + nums[i] > max)
				max = i + nums[i];

			if (max >= nums.length - 1)
				return true;
		}

		return false;
	}

}
