package com.xiao.easy;

/**
 * Given a sorted array, remove the duplicates in place such that each element
 * appear only once and return the new length.
 * 
 * Do not allocate extra space for another array, you must do this in place with
 * constant memory.
 * 
 * For example, Given input array nums = [1,1,2],
 * 
 * Your function should return length = 2, with the first two elements of nums
 * being 1 and 2 respectively. It doesn't matter what you leave beyond the new
 * length.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">Remove Duplicates from Sorted Array</a>
 * 
 * @author Xiao Ma
 *
 */
public class Remove_Duplicates_From_Sorted_Array {

	public int removeDuplicates(int[] A) {
		if (A == null || A.length == 0)
			return 0;

		int j = 0;
		int i = 1;

		while (i < A.length) {
			if (A[i] == A[j]) {
				i++;
			} else {
				j++;
				A[j] = A[i];
				i++;
			}
		}

		return j + 1;
	}

}
