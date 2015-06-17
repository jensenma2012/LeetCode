package com.xiao.medium;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Anagrams_Test {

	private static Anagrams anagrams = new Anagrams();

	@Test
	public void test() {
		String[] strs = new String[] { "aba", "abc", "aab", "bc", "cc" };
		List<String> result = new ArrayList<String>();
		result.add("aba");
		result.add("aab");

		assertEquals("[aba, aab]", result, anagrams.anagrams(strs));
	}

}
