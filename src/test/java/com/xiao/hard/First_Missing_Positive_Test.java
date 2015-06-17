package com.xiao.hard;

import static org.junit.Assert.*;

import org.junit.Test;

public class First_Missing_Positive_Test {

	private static First_Missing_Positive firstMissingPositive = new First_Missing_Positive();

	@Test
	public void test() {
		int[] test1 = new int[] { 1, 2, 0 };
		int[] test2 = new int[] { 3, 4, -1, 1 };
		int result1 = 3;
		int result2 = 2;

		assertEquals("3", result1, firstMissingPositive.firstMissingPositive(test1));
		assertEquals("2", result2, firstMissingPositive.firstMissingPositive(test2));
	}

}
