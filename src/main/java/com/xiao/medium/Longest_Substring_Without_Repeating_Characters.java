package com.xiao.medium;

/**
 * Given a string, find the length of the longest substring without repeating
 * characters. For example, the longest substring without repeating letters for
 * "abcabcbb" is "abc", which the length is 3.
 * 
 * For "bbbbb" the longest substring is "b", with the length of 1.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">Longest Substring Without Repeating Characters</a>
 * 
 * @author Xiao Ma
 *
 */
public class Longest_Substring_Without_Repeating_Characters {

	public int lengthOfLongestSubstring(String s) {
		if (s == null)
			return 0;

		boolean[] flag = new boolean[256];
		char[] arr = s.toCharArray();
		int result = 0;
		int start = 0;

		for (int i = 0; i < arr.length; i++) {
			char current = arr[i];
			if (flag[current]) {
				result = Math.max(result, i - start);
				for (int k = start; k < i; k++) {
					if (arr[k] == current) {
						start = k + 1;
						break;
					}
					flag[arr[k]] = false;
				}
			} else {
				flag[current] = true;
			}
		}

		result = Math.max(arr.length - start, result);
		return result;
	}

}
