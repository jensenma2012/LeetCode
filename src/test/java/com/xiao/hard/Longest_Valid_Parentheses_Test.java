package com.xiao.hard;

import static org.junit.Assert.*;

import org.junit.Test;

public class Longest_Valid_Parentheses_Test {

	private static Longest_Valid_Parentheses longestValidParentheses = new Longest_Valid_Parentheses();

	@Test
	public void test() {
		String test1 = "(()";
		String test2 = ")()())";
		int result1 = 2;
		int result2 = 4;

		assertEquals("()", result1, longestValidParentheses.longestValidParentheses(test1));
		assertEquals("()()", result2, longestValidParentheses.longestValidParentheses(test2));
	}

}
