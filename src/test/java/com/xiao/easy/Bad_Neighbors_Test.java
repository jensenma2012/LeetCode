package com.xiao.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class Bad_Neighbors_Test {

	private static Bad_Neighbors badNeighbors = new Bad_Neighbors();

	@Test
	public void test() {
		int[] nums = new int[] { 1, 2, 3 };
		int result = 3;

		assertEquals("3", result, badNeighbors.maxDonations(nums));
	}

}
