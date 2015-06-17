package com.xiao.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZigZag_Conversion_Test {

	private static ZigZag_Conversion zigZagConversion = new ZigZag_Conversion();

	@Test
	public void test() {
		String s = "PAYPALISHIRING";
		int numRows = 3;
		String result = "PAHNAPLSIIGYIR";

		assertEquals("PAHNAPLSIIGYIR", result, zigZagConversion.convert(s, numRows));
	}

}
