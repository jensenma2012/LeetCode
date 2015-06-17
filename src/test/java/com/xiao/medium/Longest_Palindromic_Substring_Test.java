package com.xiao.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class Longest_Palindromic_Substring_Test {

	private static Longest_Palindromic_Substring longestPalindromicSubstring = new Longest_Palindromic_Substring();

	@Test
	public void test() {
		String test = "ababcbacb";
		String result = "abcba";

		assertEquals("abcba", result, longestPalindromicSubstring.longestPalindrome(test));
	}

}
