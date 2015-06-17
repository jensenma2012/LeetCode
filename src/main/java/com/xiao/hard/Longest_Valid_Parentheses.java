package com.xiao.hard;

import java.util.Stack;

/**
 * Given a string containing just the characters '(' and ')', find the length of
 * the longest valid (well-formed) parentheses substring.
 * 
 * For "(()", the longest valid parentheses substring is "()", which has length
 * = 2.
 * 
 * Another example is ")()())", where the longest valid parentheses substring is
 * "()()", which has length = 4.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/longest-valid-parentheses/">Longest Valid Parentheses</a>
 * 
 * @author Xiao Ma
 *
 */
public class Longest_Valid_Parentheses {

	public int longestValidParentheses(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}

		int start = -1;
		int maxLength = 0;
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(i);
			} else {
				if (!stack.empty()) {
					stack.pop();
					if (stack.empty() == true) {
						maxLength = Math.max(i - start, maxLength);
					} else {
						maxLength = Math.max(i - (int) stack.peek(), maxLength);
					}
				} else {
					start = i;
				}
			}
		}

		return maxLength;
	}

}
