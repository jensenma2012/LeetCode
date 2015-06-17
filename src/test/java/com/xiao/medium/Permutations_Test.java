package com.xiao.medium;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Permutations_Test {

	private static Permutations permutations = new Permutations();

	@Test
	public void test() {
		int[] nums = new int[] { 1, 2, 3 };

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(3);
		set1.add(2);
		set1.add(1);
		result.add(set1);
		List<Integer> set2 = new ArrayList<Integer>();
		set2.add(2);
		set2.add(3);
		set2.add(1);
		result.add(set2);
		List<Integer> set3 = new ArrayList<Integer>();
		set3.add(2);
		set3.add(1);
		set3.add(3);
		result.add(set3);
		List<Integer> set4 = new ArrayList<Integer>();
		set4.add(3);
		set4.add(1);
		set4.add(2);
		result.add(set4);
		List<Integer> set5 = new ArrayList<Integer>();
		set5.add(1);
		set5.add(3);
		set5.add(2);
		result.add(set5);
		List<Integer> set6 = new ArrayList<Integer>();
		set6.add(1);
		set6.add(2);
		set6.add(3);
		result.add(set6);

		assertEquals("[1,2,3] [1,3,2] [2,1,3] [2,3,1] [3,1,2] [3,2,1]", result, permutations.permute(nums));
	}

}
