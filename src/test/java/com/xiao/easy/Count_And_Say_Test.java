package com.xiao.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class Count_And_Say_Test {

	private static Count_And_Say countAndSay = new Count_And_Say();

	@Test
	public void test() {
		int test1 = 2;
		int test2 = 4;
		String result1 = "11";
		String result2 = "1211";

		assertEquals("11", result1, countAndSay.countAndSay(test1));
		assertEquals("1211", result2, countAndSay.countAndSay(test2));
	}

}
