package com.xiao.medium;

/**
 * You are given an n x n 2D matrix representing an image.
 * 
 * Rotate the image by 90 degrees (clockwise).
 * 
 * 
 * @see <a href="https://leetcode.com/problems/rotate-image/">Rotate Image</a>
 * 
 * @author Xiao Ma
 *
 */
public class Rotate_Image {

	public void rotate(int[][] matrix) {
		if (matrix == null || matrix.length == 0)
			return;

		int m = matrix.length;
		int[][] result = new int[m][m];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				result[j][m - 1 - i] = matrix[i][j];
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = result[i][j];
			}
		}
	}

}
