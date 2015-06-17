package com.xiao.hard;

import static org.junit.Assert.*;

import org.junit.Test;

public class Regular_Expression_Matching_Test {

	private static Regular_Expression_Matching regularExpressionMatching = new Regular_Expression_Matching();

	@Test
	public void test() {
		String s1 = "aa";
		String p1 = "a";
		boolean result1 = false;

		String s2 = "aab";
		String p2 = "c*a*b";
		boolean result2 = true;

		assertEquals("false", result1, regularExpressionMatching.isMatch(s1, p1));
		assertEquals("true", result2, regularExpressionMatching.isMatch(s2, p2));
	}

}
