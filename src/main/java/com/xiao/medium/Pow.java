package com.xiao.medium;

/**
 * Implement pow(x, n).
 * 
 * 
 * @see <a href="https://leetcode.com/problems/powx-n/">Pow(x, n)</a>
 * 
 * @author Xiao Ma
 *
 */
public class Pow {

	public double myPow(double x, int n) {
		if (n < 0) {
			return 1 / power(x, -n);
		} else {
			return power(x, n);
		}
	}

	private double power(double x, int n) {
		if (n == 0)
			return 1;

		double v = power(x, n / 2);

		if (n % 2 == 0) {
			return v * v;
		} else {
			return v * v * x;
		}
	}

}
