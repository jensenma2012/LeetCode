package com.xiao.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class Longest_Substring_Without_Repeating_Characters_Test {

	private static Longest_Substring_Without_Repeating_Characters longestSubstringWithoutRepeatingCharacters = new Longest_Substring_Without_Repeating_Characters();

	@Test
	public void test() {
		String test1 = "abcabcbb";
		String test2 = "bbbbb";
		int result1 = 3;
		int result2 = 1;

		assertEquals("abc", result1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(test1));
		assertEquals("b", result2, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(test2));
	}

}
