package com.xiao.hard;

/**
 * Validate if a given string is numeric.
 * 
 * Some examples:
 * "0" => true
 * " 0.1 " => true
 * "abc" => false
 * "1 a" => false
 * "2e10" => true
 * 
 * 
 * @see <a href="https://leetcode.com/problems/valid-number/">Valid Number</a>
 * 
 * @author Xiao Ma
 *
 */
public class Valid_Number {

	public boolean isNumber(String s) {
		if (s.trim().isEmpty()) {
			return false;
		}
		
		String regex = "[-+]?(\\d+\\.?|\\.\\d+)\\d*(e[-+]?\\d+)?";
		if (s.trim().matches(regex)) {
			return true;
		} else {
			return false;
		}
	}

}
