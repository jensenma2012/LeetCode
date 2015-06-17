package com.xiao.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class House_Robber_Test {

	private static House_Robber houseRobber = new House_Robber();

	@Test
	public void test() {
		int[] nums = new int[] { 1, 2, 3 };
		int result = 4;

		assertEquals("4", result, houseRobber.rob(nums));
	}

}
