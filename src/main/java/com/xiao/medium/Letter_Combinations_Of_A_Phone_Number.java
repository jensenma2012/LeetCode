package com.xiao.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a digit string, return all possible letter combinations that the number
 * could represent.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/letter-combinations-of-a-phone-number/">Letter Combinations of a Phone Number</a>
 * 
 * @author Xiao Ma
 *
 */
public class Letter_Combinations_Of_A_Phone_Number {

	private static Map<Integer, String> map = new HashMap<Integer, String>();
	static {
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "ghi");
		map.put(5, "jkl");
		map.put(6, "mno");
		map.put(7, "pqrs");
		map.put(8, "tuv");
		map.put(9, "wxyz");
	}

	public List<String> letterCombinations(String digits) {
		List<String> results = new ArrayList<String>();
		if (digits == null || digits.length() == 0)
			return results;

		StringBuilder result = new StringBuilder();
		int index = 0;
		findLetterCombination(digits, index, result, results);
		return results;
	}

	private void findLetterCombination(String digits, int index, StringBuilder result, List<String> results) {
		if (index == digits.length()) {
			results.add(result.toString());
			return;
		}

		int num = digits.charAt(index) - '0';
		String chars = map.get(num);

		if (chars != null) {
			for (int i = 0; i < chars.length(); i++) {
				result.append(chars.charAt(i));
				findLetterCombination(digits, index + 1, result, results);
				result.deleteCharAt(result.length() - 1);
			}
		}
	}

}
