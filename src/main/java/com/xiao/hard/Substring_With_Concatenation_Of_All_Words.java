package com.xiao.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * You are given a string, s, and a list of words, words, that are all of the
 * same length. Find all starting indices of substring(s) in s that is a
 * concatenation of each word in words exactly once and without any intervening
 * characters.
 * 
 * For example, given:
 * 
 * s: "barfoothefoobarman"
 * 
 * words: ["foo", "bar"]
 * 
 * You should return the indices: [0,9].
 * 
 * (order does not matter).
 * 
 * 
 * @see <a href="https://leetcode.com/problems/substring-with-concatenation-of-all-words/">Substring with Concatenation of All Words</a>
 * 
 * @author Xiao Ma
 *
 */
public class Substring_With_Concatenation_Of_All_Words {

	public List<Integer> findSubstring(String s, String[] words) {
		List<Integer> list = new ArrayList<Integer>();
		int len = words.length;
		if (len == 0) {
			return list;
		}

		int wordLen = words[0].length();
		Map<String, Integer> wordsMap = new HashMap<String, Integer>();
		for (int i = 0; i < len; i++) {
			int num = 1;
			if (wordsMap.get(words[i]) != null) {
				num += wordsMap.get(words[i]);
			}
			wordsMap.put(words[i], num);
		}

		int slen = s.length();
		int max = slen - wordLen + 1;
		for (int i = 0; i < wordLen; i++) {
			Map<String, Integer> numMap = new HashMap<String, Integer>();
			int count = 0;
			int start = i;

			for (int end = start; end < max; end += wordLen) {
				String tempStr = s.substring(end, end + wordLen);
				if (!wordsMap.containsKey(tempStr)) {
					numMap.clear();
					count = 0;
					start = end + wordLen;
					continue;
				}

				int num = 1;
				if (numMap.containsKey(tempStr)) {
					num += numMap.get(tempStr);
				}
				numMap.put(tempStr, num);

				if (num <= wordsMap.get(tempStr)) {
					count++;
				} else {
					while (numMap.get(tempStr) > wordsMap.get(tempStr)) {
						tempStr = s.substring(start, start + wordLen);
						numMap.put(tempStr, numMap.get(tempStr) - 1);
						if (numMap.get(tempStr) < wordsMap.get(tempStr)) {
							count--;
						}
						start += wordLen;
					}
				}

				if (count == len) {
					list.add(start);
					tempStr = s.substring(start, start + wordLen);
					numMap.put(tempStr, numMap.get(tempStr) - 1);
					count--;
					start += wordLen;
				}
			}
		}

		return list;
	}

}
