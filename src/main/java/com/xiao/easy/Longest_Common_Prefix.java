package com.xiao.easy;

import java.util.List;

/**
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/longest-common-prefix/">Longest Common Prefix</a>
 * 
 * @author Xiao Ma
 *
 */
public class Longest_Common_Prefix {

	public String longestCommonPrefix(List<String> strs) {
		if (strs == null || strs.size() == 0)
			return "";

		int minLen = Integer.MAX_VALUE;
		for (String str : strs) {
			if (minLen > str.length())
				minLen = str.length();
		}
		if (minLen == 0)
			return "";

		for (int j = 0; j < minLen; j++) {
			char prev = '0';
			for (int i = 0; i < strs.size(); i++) {
				if (i == 0) {
					prev = strs.get(i).charAt(j);
					continue;
				}

				if (strs.get(i).charAt(j) != prev) {
					return strs.get(i).substring(0, j);
				}
			}
		}

		return strs.get(0).substring(0, minLen);
	}

}
