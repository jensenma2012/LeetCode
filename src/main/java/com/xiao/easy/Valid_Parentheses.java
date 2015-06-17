package com.xiao.easy;

import java.util.HashMap;
import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid
 * but "(]" and "([)]" are not.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/valid-parentheses/">Valid Parentheses</a>
 * 
 * @author Xiao Ma
 *
 */
public class Valid_Parentheses {

	public boolean isValid(String s) {
		if (s == null || s.length() == 0)
			return true;

		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');

		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (map.keySet().contains(c)) {
				stack.push(c);
			} else if (map.values().contains(c)) {
				if (!stack.isEmpty() && map.get(stack.peek()) == c) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}
