package com.xiao.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class Unique_Paths_Test {

	private static Unique_Paths uniquePaths = new Unique_Paths();

	@Test
	public void test() {
		int m = 3;
		int n = 7;
		int result = 28;

		assertEquals("28", result, uniquePaths.uniquePaths(m, n));
	}

}
