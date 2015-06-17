package com.xiao.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class Implement_StrStr_Test {

	private static Implement_StrStr implementStrStr = new Implement_StrStr();

	@Test
	public void test() {
		String haystack1 = "aabca";
		String needle1 = "abc";
		int result1 = 1;

		String haystack2 = "aabcc";
		String needle2 = "abca";
		int result2 = -1;

		assertEquals("1", result1, implementStrStr.strStr(haystack1, needle1));
		assertEquals("-1", result2, implementStrStr.strStr(haystack2, needle2));
	}

}
