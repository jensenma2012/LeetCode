package com.xiao.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class Remove_Element_Test {

	private static Remove_Element removeElement = new Remove_Element();

	@Test
	public void test() {
		int[] nums = new int[] { 1, 2, 3, 2, 1, 2, 5 };
		int val = 2;
		int result = 4;

		assertEquals("[1, 3, 1, 5]", result, removeElement.removeElement(nums, val));
	}

}
