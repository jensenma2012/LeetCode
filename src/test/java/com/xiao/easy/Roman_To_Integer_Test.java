package com.xiao.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class Roman_To_Integer_Test {

	private static Roman_To_Integer romanToInteger = new Roman_To_Integer();

	@Test
	public void test() {
		String test = "VI";
		int result = 6;

		assertEquals("6", result, romanToInteger.romanToInt(test));
	}

}
