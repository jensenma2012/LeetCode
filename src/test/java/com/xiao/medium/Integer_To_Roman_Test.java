package com.xiao.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class Integer_To_Roman_Test {

	private static Integer_To_Roman integerToRoman = new Integer_To_Roman();

	@Test
	public void test() {
		int num = 6;
		String result = "VI";

		assertEquals("VI", result, integerToRoman.intToRoman(num));
	}

}
