package com.xiao.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class Reverse_Integer_Test {

	private static Reverse_Integer reverseInteger = new Reverse_Integer();

	@Test
	public void test() {
		int test1 = 123;
		int test2 = -123;
		int result1 = 321;
		int result2 = -321;

		assertEquals("321", result1, reverseInteger.reverse(test1));
		assertEquals("-321", result2, reverseInteger.reverse(test2));
	}

}
