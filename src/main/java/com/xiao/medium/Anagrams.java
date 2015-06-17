package com.xiao.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Given an array of strings, return all groups of strings that are anagrams.
 * 
 * Note: All inputs will be in lower-case.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/anagrams/">Anagrams</a>
 * 
 * @author Xiao Ma
 *
 */
public class Anagrams {

	public List<String> anagrams(String[] strs) {
		List<String> results = new ArrayList<String>();
		if (strs == null || strs.length == 0)
			return results;

		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		for (String str : strs) {
			char[] charArr = str.toCharArray();
			Arrays.sort(charArr);
			String string = new String(charArr);
			if (map.containsKey(string)) {
				map.get(string).add(str);
			} else {
				List<String> list = new ArrayList<String>();
				list.add(str);
				map.put(string, list);
			}
		}

		for (List<String> item : map.values()) {
			if (item.size() > 1)
				results.addAll(item);
		}
		return results;
	}

}
