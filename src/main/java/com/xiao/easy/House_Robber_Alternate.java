package com.xiao.easy;

/**
 * You are a professional robber planning to rob houses along a street. Each
 * house has a certain amount of money stashed, the only constraint stopping you
 * from robbing each of them is that adjacent houses have security system
 * connected and it will automatically contact the police if two adjacent houses
 * were broken into on the same night.
 * 
 * Given a list of non-negative integers representing the amount of money of
 * each house, determine the maximum amount of money you can rob tonight without
 * alerting the police.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/house-robber/">House Robber</a>
 * 
 * @author Xiao Ma
 *
 */
public class House_Robber_Alternate {

	public int rob(int[] num) {
		if (num == null || num.length == 0)
			return 0;

		return rob(num, 0, num.length);
	}

	private int rob(int[] num, int start, int end) {
		int even = 0;
		int odd = 0;

		for (int i = start; i < end; i++) {
			if (i % 2 == 0) {
				even += num[i];
				even = even > odd ? even : odd;
			} else {
				odd += num[i];
				odd = even > odd ? even : odd;
			}
		}

		return even > odd ? even : odd;
	}

}
