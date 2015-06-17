package com.xiao.medium;

/**
 * Given an integer, convert it to a roman numeral.
 * 
 * Input is guaranteed to be within the range from 1 to 3999.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/integer-to-roman/">Integer to Roman</a>
 * 
 * @author Xiao Ma
 *
 */
public class Integer_To_Roman {

	public String intToRoman(int num) {
		StringBuffer roman = new StringBuffer();
		int repeat = 0;

		repeat = num / 1000;
		for (int i = 1; i <= repeat; i++) {
			roman.append("M");
		}
		num = num % 1000;

		repeat = num / 900;
		for (int i = 1; i <= repeat; i++) {
			roman.append("CM");
		}
		num = num % 900;

		repeat = num / 500;
		for (int i = 1; i <= repeat; i++) {
			roman.append("D");
		}
		num = num % 500;

		repeat = num / 400;
		for (int i = 1; i <= repeat; i++) {
			roman.append("CD");
		}
		num = num % 400;

		repeat = num / 100;
		for (int i = 1; i <= repeat; i++) {
			roman.append("C");
		}
		num = num % 100;

		repeat = num / 90;
		for (int i = 1; i <= repeat; i++) {
			roman.append("XC");
		}
		num = num % 90;

		repeat = num / 50;
		for (int i = 1; i <= repeat; i++) {
			roman.append("L");
		}
		num = num % 50;

		repeat = num / 40;
		for (int i = 1; i <= repeat; i++) {
			roman.append("XL");
		}
		num = num % 40;

		repeat = num / 10;
		for (int i = 1; i <= repeat; i++) {
			roman.append("X");
		}
		num = num % 10;

		repeat = num / 9;
		for (int i = 1; i <= repeat; i++) {
			roman.append("IX");
		}
		num = num % 9;

		repeat = num / 5;
		for (int i = 1; i <= repeat; i++) {
			roman.append("V");
		}
		num = num % 5;

		repeat = num / 4;
		for (int i = 1; i <= repeat; i++) {
			roman.append("IV");
		}
		num = num % 4;

		repeat = num / 1;
		for (int i = 1; i <= repeat; i++) {
			roman.append("I");
		}
		return roman.toString();
	}

}
