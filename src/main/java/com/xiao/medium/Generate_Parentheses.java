package com.xiao.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given n pairs of parentheses, write a function to generate all combinations
 * of well-formed parentheses.
 * 
 * For example, given n = 3, a solution set is:
 * 
 * "((()))", "(()())", "(())()", "()(())", "()()()"
 * 
 * 
 * @see <a href="https://leetcode.com/problems/generate-parentheses/">Generate Parentheses</a>
 * 
 * @author Xiao Ma
 *
 */
public class Generate_Parentheses {

	public List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<String>();
		List<Integer> diff = new ArrayList<Integer>();

		result.add("");
		diff.add(0);

		for (int i = 0; i < 2 * n; i++) {
			List<String> temp1 = new ArrayList<String>();
			List<Integer> temp2 = new ArrayList<Integer>();

			for (int j = 0; j < result.size(); j++) {
				String s = result.get(j);
				int k = diff.get(j);

				if (i < 2 * n - 1) {
					temp1.add(s + "(");
					temp2.add(k + 1);
				}

				if (k > 0 && i < 2 * n - 1 || k == 1 && i == 2 * n - 1) {
					temp1.add(s + ")");
					temp2.add(k - 1);
				}
			}

			result = new ArrayList<String>(temp1);
			diff = new ArrayList<Integer>(temp2);
		}

		return result;
	}

}
