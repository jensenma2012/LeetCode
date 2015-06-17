package com.xiao.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class Bad_Neighbors_Alternate_Test {

	private static Bad_Neighbors_Alternate badNeighborsAlternate = new Bad_Neighbors_Alternate();

	@Test
	public void test() {
		int[] nums = new int[] { 1, 2, 3 };
		int result = 3;

		assertEquals("3", result, badNeighborsAlternate.maxDonations(nums));
	}

}
