package com.xiao.hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xiao.shared.Interval;

/**
 * Given a collection of intervals, merge all overlapping intervals.
 * 
 * For example,
 * Given [1,3],[2,6],[8,10],[15,18],
 * return [1,6],[8,10],[15,18].
 * 
 * 
 * @see <a href="https://leetcode.com/problems/merge-intervals/">Merge Intervals</a>
 * 
 * @author Xiao Ma
 *
 */
public class Merge_Intervals {

	public List<Interval> merge(List<Interval> intervals) {
		if (intervals == null || intervals.size() <= 1)
			return intervals;

		Collections.sort(intervals, new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.start - o2.start;
			}
		});

		List<Interval> result = new ArrayList<Interval>();
		Interval prev = intervals.get(0);
		for (int i = 1; i < intervals.size(); i++) {
			Interval curr = intervals.get(i);

			if (prev.end >= curr.start) {
				Interval merged = new Interval(prev.start, Math.max(prev.end, curr.end));
				prev = merged;
			} else {
				result.add(prev);
				prev = curr;
			}
		}
		result.add(prev);

		return result;
	}

}
