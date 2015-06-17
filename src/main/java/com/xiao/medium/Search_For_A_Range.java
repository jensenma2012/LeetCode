package com.xiao.medium;

/**
 * Given a sorted array of integers, find the starting and ending position of a
 * given target value.
 * 
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * 
 * If the target is not found in the array, return [-1, -1].
 * 
 * 
 * @see <a href="https://leetcode.com/problems/search-for-a-range/">Search for a Range</a>
 * 
 * @author Xiao Ma
 *
 */
public class Search_For_A_Range {

	public int[] searchRange(int[] A, int target) {
		int[] ret = { -1, -1 };
		if (A == null || A.length == 0)
			return ret;

		int start = 0;
		int end = A.length - 1;
		while (start < end) {
			int mid = (start + end) / 2;
			if (A[mid] < target)
				start = mid + 1;
			else
				end = mid;
		}

		int low;
		if (A[start] != target)
			return ret;
		else
			low = start;

		start = 0;
		end = A.length - 1;
		while (start < end) {
			int mid = (start + end) / 2;
			if (A[mid] < target + 1)
				start = mid + 1;
			else
				end = mid;
		}

		int high = A[start] == target ? start : start - 1;
		ret[0] = low;
		ret[1] = high;
		return ret;
	}

}
