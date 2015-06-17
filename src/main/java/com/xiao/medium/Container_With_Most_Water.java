package com.xiao.medium;

import java.util.List;

/**
 * Given n non-negative integers a1, a2, ..., an, where each represents a point
 * at coordinate (i, ai). n vertical lines are drawn such that the two endpoints
 * of line i is at (i, ai) and (i, 0). Find two lines, which together with
 * x-axis forms a container, such that the container contains the most water.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/container-with-most-water/">Container With Most Water</a>
 * 
 * @author Xiao Ma
 *
 */
public class Container_With_Most_Water {

	public int maxArea(List<Integer> height) {
		if (height == null || height.size() < 2)
			return 0;

		int max = 0;
		int left = 0;
		int right = height.size() - 1;
		int cheight = 0;
		int cwidth = 0;

		while (left < right) {
			cwidth = right - left;
			int cheight1 = height.get(left);
			int cheight2 = height.get(right);

			if (cheight1 < cheight2) {
				cheight = cheight1;
				left++;
			} else {
				cheight = cheight2;
				right--;
			}

			int size = cwidth * cheight;
			max = size > max ? size : max;
		}

		return max;
	}

}
