package com.xiao.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class Length_Of_Last_Word_Test {

	private static Length_Of_Last_Word lengthOfLastWord = new Length_Of_Last_Word();

	@Test
	public void test() {
		String s = "Hello World";
		int result = 5;

		assertEquals("5", result, lengthOfLastWord.lengthOfLastWord(s));
	}

}
