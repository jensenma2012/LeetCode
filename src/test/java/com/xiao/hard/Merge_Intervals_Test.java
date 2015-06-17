package com.xiao.hard;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.xiao.shared.Interval;

public class Merge_Intervals_Test {

	private static Merge_Intervals mergeIntervals = new Merge_Intervals();

	@Test
	public void test() {
		List<Interval> intervals = new ArrayList<Interval>();
		intervals.add(new Interval(1, 3));
		intervals.add(new Interval(2, 6));
		intervals.add(new Interval(8, 10));
		intervals.add(new Interval(15, 18));

		List<Interval> result = new ArrayList<Interval>();
		result.add(new Interval(1, 6));
		result.add(new Interval(8, 10));
		result.add(new Interval(15, 18));

		assertEquals("[1, 6] [8, 10] [15, 18]", result, mergeIntervals.merge(intervals));
	}

}
