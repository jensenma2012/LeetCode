package com.xiao.easy;

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
public class Bad_Neighbors_Alternate {

	public int maxDonations(int[] donations) {
		if (donations == null || donations.length == 0)
			return 0;

		int max1 = max(donations, 0, donations.length - 1);
		int max2 = max(donations, 1, donations.length);
		return max1 > max2 ? max1 : max2;
	}

	private int max(int[] donations, int start, int end) {
		int even = 0;
		int odd = 0;

		for (int i = start; i < end; i++) {
			if (i % 2 == 0) {
				even += donations[i];
				even = even > odd ? even : odd;
			} else {
				odd += donations[i];
				odd = even > odd ? even : odd;
			}
		}

		return even > odd ? even : odd;
	}

}
