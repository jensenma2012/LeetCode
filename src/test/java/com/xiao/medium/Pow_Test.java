package com.xiao.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class Pow_Test {

	private static Pow pow = new Pow();

	@Test
	public void test() {
		double x = 2.0;
		int n = 3;
		double result = 8.0;

		assertEquals("2^3 = 8", result, pow.myPow(x, n), 0);
	}

}
