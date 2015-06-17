package com.xiao.hard;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class N_Queens_Test {

	private static N_Queens nQueens = new N_Queens();

	@Test
	public void test() {
		int n = 4;
		List<String[]> result = new ArrayList<String[]>();
		result.add(new String[] { ".Q..", "...Q", "Q...", "..Q." });
		result.add(new String[] { "..Q.", "Q...", "...Q", ".Q.." });

		assertArrayEquals("1st solution", result.get(0), nQueens.solveNQueens(n).get(0));
		assertArrayEquals("2nd solution", result.get(1), nQueens.solveNQueens(n).get(1));
	}

}
