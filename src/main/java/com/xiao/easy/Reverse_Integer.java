package com.xiao.easy;

/**
 * Reverse digits of an integer.
 * 
 * Example1: x = 123, return 321
 * 
 * Example2: x = -123, return -321
 * 
 * 
 * @see <a href="https://leetcode.com/problems/reverse-integer/">Reverse Integer</a>
 * 
 * @author Xiao Ma
 *
 */
public class Reverse_Integer {

	public int reverse(int x) {
		int rev = 0;
		while (x != 0) {
			if (Math.abs(rev) > Integer.MAX_VALUE / 10)
				return 0;

			rev = rev * 10 + x % 10;
			x = x / 10;
		}
		return rev;
	}

}
