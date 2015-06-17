package com.xiao.medium;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Generate_Parentheses_Test {

	private static Generate_Parentheses generateParentheses = new Generate_Parentheses();

	@Test
	public void test() {
		int n = 3;
		List<String> result = new ArrayList<String>();
		result.add("((()))");
		result.add("(()())");
		result.add("(())()");
		result.add("()(())");
		result.add("()()()");

		assertEquals("((())) (()()) (())() ()(()) ()()()", result, generateParentheses.generateParenthesis(n));
	}

}
