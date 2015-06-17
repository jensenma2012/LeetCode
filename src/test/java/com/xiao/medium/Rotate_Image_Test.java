package com.xiao.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class Rotate_Image_Test {

	private static Rotate_Image rotateImage = new Rotate_Image();

	@Test
	public void test() {
		int[][] matrix = new int[][] { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		int[][] result = new int[][] { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

		rotateImage.rotate(matrix);
		assertArrayEquals("true", result, matrix);
	}

}
