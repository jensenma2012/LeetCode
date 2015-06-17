package com.xiao.easy;

/**
 * Implement strStr().
 * 
 * Returns the index of the first occurrence of needle in haystack, or -1 if
 * needle is not part of haystack.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/implement-strstr/">Implement strStr()</a>
 * 
 * @author Xiao Ma
 *
 */
public class Implement_StrStr {

	public int strStr(String haystack, String needle) {
		if (haystack == null || needle == null)
			return -1;

		int haystacklen = haystack.length();
		int needlelen = needle.length();

		if (needle.length() == 0)
			return 0;

		for (int i = 0; i < haystacklen; i++) {
			if (haystacklen - i + 1 < needlelen)
				return -1;

			int k = i;
			int j = 0;

			while (j < needlelen && k < haystacklen && needle.charAt(j) == haystack.charAt(k)) {
				j++;
				k++;
				if (j == needlelen)
					return i;
			}
		}

		return -1;
	}

}
