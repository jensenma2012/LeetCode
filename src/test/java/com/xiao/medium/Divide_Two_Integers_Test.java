package com.xiao.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class Divide_Two_Integers_Test {

	private static Divide_Two_Integers divideTwoIntegers = new Divide_Two_Integers();

	@Test
	public void test() {
		int dividend = 4;
		int divisor = 2;
		int result = 2;

		assertEquals("2", result, divideTwoIntegers.divide(dividend, divisor));
	}

}
