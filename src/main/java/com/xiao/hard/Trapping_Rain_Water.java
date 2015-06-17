package com.xiao.hard;

/**
 * Given n non-negative integers representing an elevation map where the width
 * of each bar is 1, compute how much water it is able to trap after raining.
 * 
 * For example, Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/trapping-rain-water/">Trapping Rain Water</a>
 * 
 * @author Xiao Ma
 *
 */
public class Trapping_Rain_Water {

	public int trap(int[] height) {
		if (height == null || height.length == 0)
			return 0;

		int l = 0;
		int r = height.length - 1;
		int result = 0;

		while (l < r) {
			int min = Math.min(height[l], height[r]);
			if (height[l] == min) {
				l++;
				while (l < r && height[l] < min) {
					result += min - height[l];
					l++;
				}
			} else {
				r--;
				while (l < r && height[r] < min) {
					result += min - height[r];
					r--;
				}
			}
		}

		return result;
	}

}
