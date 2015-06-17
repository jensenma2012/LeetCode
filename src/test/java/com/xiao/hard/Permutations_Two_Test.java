package com.xiao.hard;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Permutations_Two_Test {

	private static Permutations_Two permutationsTwo = new Permutations_Two();

	@Test
	public void test() {
		int[] nums = new int[] { 1, 1, 2 };

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(1);
		set1.add(1);
		set1.add(2);
		result.add(set1);
		List<Integer> set2 = new ArrayList<Integer>();
		set2.add(1);
		set2.add(2);
		set2.add(1);
		result.add(set2);
		List<Integer> set3 = new ArrayList<Integer>();
		set3.add(2);
		set3.add(1);
		set3.add(1);
		result.add(set3);

		assertEquals("[1,1,2] [1,2,1] [2,1,1]", result, permutationsTwo.permuteUnique(nums));
	}

}
