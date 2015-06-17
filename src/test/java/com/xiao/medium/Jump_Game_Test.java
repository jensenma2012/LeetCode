package com.xiao.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class Jump_Game_Test {

	private static Jump_Game jumpGame = new Jump_Game();

	@Test
	public void test() {
		int[] test1 = new int[] { 2, 3, 1, 1, 4 };
		int[] test2 = new int[] { 3, 2, 1, 0, 4 };
		boolean result1 = true;
		boolean result2 = false;

		assertEquals("true", result1, jumpGame.canJump(test1));
		assertEquals("false", result2, jumpGame.canJump(test2));
	}

}
