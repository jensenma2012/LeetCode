package com.xiao.hard;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays.
 * 
 * The overall run time complexity should be O(log (m+n)).
 * 
 * 
 * @see <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">Median of Two Sorted Arrays</a>
 * 
 * @author Xiao Ma
 *
 */
public class Median_Of_Two_Sorted_Arrays {

	public double findMedianSortedArrays(int A[], int B[]) {
		int m = A.length;
		int n = B.length;

		int sum = m + n;
		if (sum % 2 != 0) {
			return findMedian(A, 0, m - 1, B, 0, n - 1, sum / 2);
		} else {
			return (findMedian(A, 0, m - 1, B, 0, n - 1, sum / 2) + findMedian(A, 0, m - 1, B, 0, n - 1, sum / 2 - 1)) / 2.0;
		}
	}

	private double findMedian(int A[], int aStart, int aEnd, int B[], int bStart, int bEnd, int target) {
		int aLen = aEnd - aStart + 1;
		int bLen = bEnd - bStart + 1;

		if (aLen == 0)
			return B[bStart + target];
		if (bLen == 0)
			return A[aStart + target];
		if (target == 0)
			return Math.min(A[aStart], B[bStart]);

		int aMid = aLen * target / (aLen + bLen);
		int bMid = target - aMid - 1;

		aMid = aMid + aStart;
		bMid = bMid + bStart;

		if (A[aMid] > B[bMid]) {
			target = target - (bMid - bStart + 1);
			aEnd = aMid;
			bStart = bMid + 1;
		} else {
			target = target - (aMid - aStart + 1);
			bEnd = bMid;
			aStart = aMid + 1;
		}

		return findMedian(A, aStart, aEnd, B, bStart, bEnd, target);
	}

}
