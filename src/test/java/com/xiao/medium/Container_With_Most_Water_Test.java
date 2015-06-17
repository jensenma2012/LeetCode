package com.xiao.medium;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Container_With_Most_Water_Test {

	private static Container_With_Most_Water containerWithMostWater = new Container_With_Most_Water();

	@Test
	public void test() {
		List<Integer> height = new ArrayList<Integer>();
		height.add(2);
		height.add(1);
		height.add(3);
		height.add(2);
		int result = 6;

		assertEquals("6", result, containerWithMostWater.maxArea(height));
	}

}
