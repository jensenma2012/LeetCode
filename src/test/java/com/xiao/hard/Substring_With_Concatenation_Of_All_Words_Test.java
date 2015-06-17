package com.xiao.hard;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Substring_With_Concatenation_Of_All_Words_Test {

	private static Substring_With_Concatenation_Of_All_Words substringWithConcatenationOfAllWords = new Substring_With_Concatenation_Of_All_Words();

	@Test
	public void test() {
		String s = "barfoothefoobarman";
		String[] words = new String[] { "foo", "bar" };
		List<Integer> result = new ArrayList<Integer>();
		result.add(0);
		result.add(9);

		assertEquals("[0, 9]", result, substringWithConcatenationOfAllWords.findSubstring(s, words));
	}

}
