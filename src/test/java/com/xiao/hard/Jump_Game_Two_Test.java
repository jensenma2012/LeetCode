package com.xiao.hard;

import static org.junit.Assert.*;

import org.junit.Test;

public class Jump_Game_Two_Test {

	private static Jump_Game_Two jumpGameTwo = new Jump_Game_Two();

	@Test
	public void test() {
		int[] nums = new int[] { 2, 3, 1, 1, 4 };
		int result = 2;

		assertEquals("2", result, jumpGameTwo.jump(nums));
	}

}
