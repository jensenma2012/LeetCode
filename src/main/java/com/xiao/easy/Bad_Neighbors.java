package com.xiao.easy;

import java.util.Arrays;

/**
 * The old song declares "Go ahead and hate your neighbor", and the residents of
 * Onetinville have taken those words to heart. Every resident hates his
 * next-door neighbors on both sides. Nobody is willing to live farther away
 * from the town's well than his neighbors, so the town has been arranged in a
 * big circle around the well. Unfortunately, the town's well is in disrepair
 * and needs to be restored. You have been hired to collect donations for the
 * Save Our Well fund.
 * 
 * Each of the town's residents is willing to donate a certain amount, as
 * specified in the int[] donations, which is listed in clockwise order around
 * the well. However, nobody is willing to contribute to a fund to which his
 * neighbor has also contributed. Next-door neighbors are always listed
 * consecutively in donations, except that the first and last entries in
 * donations are also for next-door neighbors. You must calculate and return the
 * maximum amount of donations that can be collected.
 * 
 * 
 * @see <a href="http://community.topcoder.com/stat?c=problem_statement&pm=2402&rd=5009">Bad Neighbors</a>
 * 
 * @author Xiao Ma
 *
 */
public class Bad_Neighbors {

	private int[][] cache;

	public int maxDonations(int[] donations) {
		cache = new int[2][donations.length];
		Arrays.fill(cache[0], -1);
		Arrays.fill(cache[1], -1);
		return Math.max(max(donations, 2, true) + donations[0], max(donations, 1, false));
	}

	private int max(int[] donations, int where, boolean onegave) {
		if (where == donations.length)
			return 0;
		if (where == donations.length - 1 && onegave)
			return 0;
		else if (where == donations.length - 1)
			return donations[where];
		if (cache[onegave ? 1 : 0][where] != -1)
			return cache[onegave ? 1 : 0][where];
		return cache[onegave ? 1 : 0][where] = Math.max(max(donations, where + 1, onegave), max(donations, where + 2, onegave) + donations[where]);
	}

}
