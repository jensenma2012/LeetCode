package com.xiao.hard;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import com.xiao.shared.ListNode;

/**
 * Merge k sorted linked lists and return it as one sorted list. Analyze and
 * describe its complexity.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/merge-k-sorted-lists/">Merge k Sorted Lists</a>
 * 
 * @author Xiao Ma
 *
 */
public class Merge_K_Sorted_Lists {

	public ListNode mergeKLists(List<ListNode> lists) {
		if (lists.size() == 0)
			return null;

		PriorityQueue<ListNode> q = new PriorityQueue<ListNode>(lists.size(),
				new Comparator<ListNode>() {
					public int compare(ListNode a, ListNode b) {
						if (a.val > b.val)
							return 1;
						else if (a.val == b.val)
							return 0;
						else
							return -1;
					}
				});

		for (ListNode list : lists) {
			if (list != null)
				q.add(list);
		}

		ListNode head = new ListNode(0);
		ListNode p = head;

		while (q.size() > 0) {
			ListNode temp = q.poll();
			p.next = temp;

			if (temp.next != null)
				q.add(temp.next);

			p = p.next;
		}

		return head.next;
	}

}
