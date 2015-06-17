package com.xiao.hard;

import static org.junit.Assert.*;

import org.junit.Test;

public class Trapping_Rain_Water_Test {

	private static Trapping_Rain_Water trappingRainWater = new Trapping_Rain_Water();

	@Test
	public void test() {
		int[] height = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int result = 6;

		assertEquals("6", result, trappingRainWater.trap(height));
	}

}
