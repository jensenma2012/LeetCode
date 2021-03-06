package com.xiao.hard;

/**
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * 
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * 
 * You are given a target value to search. If found in the array return its
 * index, otherwise return -1.
 * 
 * You may assume no duplicate exists in the array.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/search-in-rotated-sorted-array/">Search in Rotated Sorted Array</a>
 * 
 * @author Xiao Ma
 *
 */
public class Search_In_Rotated_Sorted_Array {

	public int search(int[] A, int target) {
		if (A == null || A.length == 0)
			return -1;

		int l = 0;
		int r = A.length - 1;
		while (l <= r) {
			int m = (l + r) / 2;
			if (target == A[m])
				return m;
			if (A[m] < A[r]) {
				if (target > A[m] && target <= A[r])
					l = m + 1;
				else
					r = m - 1;
			} else {
				if (target >= A[l] && target < A[m])
					r = m - 1;
				else
					l = m + 1;
			}
		}

		return -1;
	}

}
