package com.xiao.easy;

/**
 * Implement atoi to convert a string to an integer.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/string-to-integer-atoi/">String to Integer (atoi)</a>
 * 
 * @author Xiao Ma
 *
 */
public class String_To_Integer_Atoi {

	public int myAtoi(String str) {
		if (str == null)
			return 0;

		str = str.trim();
		if (str.length() == 0)
			return 0;

		int mutiplier = 1;
		int i = 0;

		if (str.charAt(0) == '-') {
			mutiplier = -1;
			i++;
		} else if (str.charAt(0) == '+') {
			i++;
		}

		double result = 0;
		while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
			result = result * 10 + (str.charAt(i) - '0');
			i++;
		}

		result *= mutiplier;

		if (result > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;

		if (result < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;

		return (int) result;
	}

}
