package com.xiao.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class Palindrome_Number_Test {

	private static Palindrome_Number palindromeNumber = new Palindrome_Number();

	@Test
	public void test() {
		int test1 = 12321;
		int test2 = 123;
		boolean result1 = true;
		boolean result2 = false;

		assertEquals("true", result1, palindromeNumber.isPalindrome(test1));
		assertEquals("false", result2, palindromeNumber.isPalindrome(test2));
	}

}
