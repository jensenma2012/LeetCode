package com.xiao.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class String_To_Integer_Atoi_Test {

	private static String_To_Integer_Atoi stringToIntegerAtoi = new String_To_Integer_Atoi();

	@Test
	public void test() {
		String test = "123";
		int result = 123;

		assertEquals("123", result, stringToIntegerAtoi.myAtoi(test));
	}

}
