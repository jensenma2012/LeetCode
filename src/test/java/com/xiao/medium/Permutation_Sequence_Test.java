package com.xiao.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class Permutation_Sequence_Test {

	private static Permutation_Sequence permutationSequence = new Permutation_Sequence();

	@Test
	public void test() {
		int n = 3;
		int k = 4;
		String result = "231";

		assertEquals("321", result, permutationSequence.getPermutation(n, k));
	}

}
