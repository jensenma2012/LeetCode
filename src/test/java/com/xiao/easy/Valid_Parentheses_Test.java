package com.xiao.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class Valid_Parentheses_Test {

	private static Valid_Parentheses validParentheses = new Valid_Parentheses();

	@Test
	public void test() {
		String test1 = "()[]";
		String test2 = "([)]";
		boolean result1 = true;
		boolean result2 = false;

		assertEquals("true", result1, validParentheses.isValid(test1));
		assertEquals("false", result2, validParentheses.isValid(test2));
	}

}
