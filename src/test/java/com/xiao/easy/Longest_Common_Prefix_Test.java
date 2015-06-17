package com.xiao.easy;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Longest_Common_Prefix_Test {

	private static Longest_Common_Prefix longestCommonPrefix = new Longest_Common_Prefix();

	@Test
	public void test() {
		List<String> strs = new ArrayList<String>();
		strs.add("ab");
		strs.add("abb");
		strs.add("abcc");
		strs.add("abcd");
		String result = "ab";

		assertEquals("ab", result, longestCommonPrefix.longestCommonPrefix(strs));
	}

}
