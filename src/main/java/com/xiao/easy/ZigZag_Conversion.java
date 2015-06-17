package com.xiao.easy;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number
 * of rows like this: (you may want to display this pattern in a fixed font for
 * better legibility)
 * 
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * 
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a
 * number of rows:
 * 
 * string convert(string text, int nRows); 
 * 
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 * 
 * 
 * @see <a href="https://leetcode.com/problems/zigzag-conversion/">ZigZag Conversion</a>
 * 
 * @author Xiao Ma
 *
 */
public class ZigZag_Conversion {

	public String convert(String s, int nRows) {
		StringBuffer sb = new StringBuffer();
		int length = s.length();

		if (s == null || length == 0 || nRows <= 0)
			return "";
		if (nRows == 1)
			return s;

		int size = 2 * nRows - 2;
		for (int i = 0; i < nRows; i++) {
			for (int j = i; j < length; j += size) {
				sb.append(s.charAt(j));
				if (i != 0 && i != nRows - 1) {
					int temp = j + size - 2 * i;
					if (temp < length)
						sb.append(s.charAt(temp));
				}
			}
		}
		return sb.toString();
	}

}
