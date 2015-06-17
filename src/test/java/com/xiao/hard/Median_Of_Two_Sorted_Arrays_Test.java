package com.xiao.hard;

import static org.junit.Assert.*;

import org.junit.Test;

public class Median_Of_Two_Sorted_Arrays_Test {

	private static Median_Of_Two_Sorted_Arrays medianOfTwoSortedArrays = new Median_Of_Two_Sorted_Arrays();

	@Test
	public void test() {
		int A[] = new int[] { 1, 2, 6 };
		int B[] = new int[] { 2, 3, 6, 7 };
		double result = 3.0;

		assertEquals("3.0", result, medianOfTwoSortedArrays.findMedianSortedArrays(A, B), 0);
	}

}
