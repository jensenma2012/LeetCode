package com.xiao.hard;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.xiao.shared.Interval;

public class Insert_Interval_Test {

	private static Insert_Interval insertInterval = new Insert_Interval();

	@Test
	public void test() {
		List<Interval> intervals1 = new ArrayList<Interval>();
		intervals1.add(new Interval(1, 3));
		intervals1.add(new Interval(6, 9));
		Interval newInterval1 = new Interval(2, 5);
		List<Interval> result1 = new ArrayList<Interval>();
		result1.add(new Interval(1, 5));
		result1.add(new Interval(6, 9));

		List<Interval> intervals2 = new ArrayList<Interval>();
		intervals2.add(new Interval(1, 2));
		intervals2.add(new Interval(3, 5));
		intervals2.add(new Interval(6, 7));
		intervals2.add(new Interval(8, 10));
		intervals2.add(new Interval(12, 16));
		Interval newInterval2 = new Interval(4, 9);
		List<Interval> result2 = new ArrayList<Interval>();
		result2.add(new Interval(1, 2));
		result2.add(new Interval(3, 10));
		result2.add(new Interval(12, 16));

		assertEquals("[1, 5] [6, 9]", result1, insertInterval.insert(intervals1, newInterval1));
		assertEquals("[1, 2] [3, 10] [12, 16]", result2, insertInterval.insert(intervals2, newInterval2));
	}

}
