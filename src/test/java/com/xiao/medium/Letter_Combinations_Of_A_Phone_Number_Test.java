package com.xiao.medium;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Letter_Combinations_Of_A_Phone_Number_Test {

	private static Letter_Combinations_Of_A_Phone_Number letterCombinationsOfAPhoneNumber = new Letter_Combinations_Of_A_Phone_Number();

	@Test
	public void test() {
		String digits = "23";
		List<String> result = new ArrayList<String>();
		result.add("ad");
		result.add("ae");
		result.add("af");
		result.add("bd");
		result.add("be");
		result.add("bf");
		result.add("cd");
		result.add("ce");
		result.add("cf");

		assertEquals("[ad, ae, af, bd, be, bf, cd, ce, cf]", result, letterCombinationsOfAPhoneNumber.letterCombinations(digits));
	}

}
