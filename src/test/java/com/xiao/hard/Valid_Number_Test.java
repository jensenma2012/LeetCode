package com.xiao.hard;

import static org.junit.Assert.*;

import org.junit.Test;

public class Valid_Number_Test {

	private static Valid_Number validNumber = new Valid_Number();

	@Test
	public void test() {
		String s1 = " 0.1 ";
		String s2 = "1 a";
		boolean result1 = true;
		boolean result2 = false;

		assertEquals("true", result1, validNumber.isNumber(s1));
		assertEquals("false", result2, validNumber.isNumber(s2));
	}

}
