package com.xiao.hard;

import static org.junit.Assert.*;

import org.junit.Test;

public class Wildcard_Matching_Test {

	private static Wildcard_Matching wildcardMatching = new Wildcard_Matching();

	@Test
	public void test() {
		String s1 = "aaa";
		String p1 = "aa";
		boolean result1 = false;

		String s2 = "ab";
		String p2 = "?*";
		boolean result2 = true;

		assertEquals("false", result1, wildcardMatching.isMatch(s1, p1));
		assertEquals("true", result2, wildcardMatching.isMatch(s2, p2));
	}

}
