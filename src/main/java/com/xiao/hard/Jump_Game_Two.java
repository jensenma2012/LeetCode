package com.xiao.hard;

/**
 * Given an array of non-negative integers, you are initially positioned at the
 * first index of the array.
 * 
 * Each element in the array represents your maximum jump length at that
 * position.
 * 
 * Your goal is to reach the last index in the minimum number of jumps.
 * 
 * For example: Given array A = [2,3,1,1,4]
 * 
 * The minimum number of jumps to reach the last index is 2. (Jump 1 step from
 * index 0 to 1, then 3 steps to the last index.)
 * 
 * 
 * @see <a href="https://leetcode.com/problems/jump-game-ii/">Jump Game II</a>
 * 
 * @author Xiao Ma
 *
 */
public class Jump_Game_Two {

	public int jump(int[] nums) {
		if (nums.length <= 1)
			return 0;

		int maxReach = nums[0];
		int step = nums[0];
		int jump = 1;

		for (int i = 1; i < nums.length; i++) {
			if (i == nums.length - 1)
				return jump;

			if (i + nums[i] > maxReach)
				maxReach = i + nums[i];

			step--;

			if (step == 0) {
				jump++;
				step = maxReach - i;
			}
		}

		return jump;
	}

}
