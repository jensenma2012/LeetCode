package com.xiao.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class Multiply_Strings_Test {

	private static Multiply_Strings multiplyStrings = new Multiply_Strings();

	@Test
	public void test() {
		String num1 = "12";
		String num2 = "5";
		String result = "60";

		assertEquals("12 * 5 = 60", result, multiplyStrings.multiply(num1, num2));
	}

}
