package com.xiao.easy;

/**
 * Given an array and a value, remove all instances of that value in place and
 * return the new length.
 * 
 * The order of elements can be changed. It doesn't matter what you leave beyond
 * the new length.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/remove-element/">Remove Element</a>
 * 
 * @author Xiao Ma
 *
 */
public class Remove_Element {

	public int removeElement(int[] A, int elem) {
		if (A == null || A.length == 0)
			return 0;

		int j = 0;
		for (int a : A) {
			if (a != elem)
				A[j++] = a;
		}

		return j;
	}

}
