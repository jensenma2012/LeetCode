package com.xiao.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class House_Robber_Alternate_Test {

	private static House_Robber_Alternate houseRobberAlternate = new House_Robber_Alternate();

	@Test
	public void test() {
		int[] nums = new int[] { 1, 2, 3 };
		int result = 4;

		assertEquals("4", result, houseRobberAlternate.rob(nums));
	}

}
