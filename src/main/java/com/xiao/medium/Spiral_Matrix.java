package com.xiao.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a matrix of m x n elements (m rows, n columns), return all elements of
 * the matrix in spiral order.
 * 
 * For example, Given the following matrix:
 * 
 * [
 * 	[ 1, 2, 3 ],
 * 	[ 4, 5, 6 ],
 * 	[ 7, 8, 9 ]
 * ]
 * 
 * You should return [1,2,3,6,9,8,7,4,5].
 * 
 * 
 * @see <a href="https://leetcode.com/problems/spiral-matrix/">Spiral Matrix</a>
 * 
 * @author Xiao Ma
 *
 */
public class Spiral_Matrix {

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<Integer>();
		if (matrix == null || matrix.length == 0)
			return result;

		int row = matrix.length;
		int column = matrix[0].length;
		int rowIndex = 0;
		int columnIndex = 0;

		while (row > 0 && column > 0) {
			if (row == 1) {
				for (int i = 0; i < column; i++) {
					result.add(matrix[rowIndex][columnIndex++]);
				}
				break;
			} else if (column == 1) {
				for (int i = 0; i < row; i++) {
					result.add(matrix[rowIndex++][columnIndex]);
				}
				break;
			}

			for (int i = 0; i < column - 1; i++) {
				result.add(matrix[rowIndex][columnIndex++]);
			}

			for (int i = 0; i < row - 1; i++) {
				result.add(matrix[rowIndex++][columnIndex]);
			}

			for (int i = 0; i < column - 1; i++) {
				result.add(matrix[rowIndex][columnIndex--]);
			}

			for (int i = 0; i < row - 1; i++) {
				result.add(matrix[rowIndex--][columnIndex]);
			}

			rowIndex++;
			columnIndex++;
			row -= 2;
			column -= 2;
		}

		return result;
	}

}
