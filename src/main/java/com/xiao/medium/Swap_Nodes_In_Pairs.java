package com.xiao.medium;

import com.xiao.shared.ListNode;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * 
 * For example, Given 1->2->3->4, you should return the list as 2->1->4->3.
 * 
 * Your algorithm should use only constant space. You may not modify the values
 * in the list, only nodes itself can be changed.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/swap-nodes-in-pairs/">Swap Nodes in Pairs</a>
 * 
 * @author Xiao Ma
 *
 */
public class Swap_Nodes_In_Pairs {

	public ListNode swapPairs(ListNode head) {
		if (head == null)
			return null;

		ListNode helper = new ListNode(0);
		helper.next = head;

		ListNode pre = helper;
		ListNode cur = head;

		while (cur != null && cur.next != null) {
			ListNode next = cur.next.next;
			cur.next.next = cur;
			pre.next = cur.next;
			cur.next = next;
			pre = cur;
			cur = next;
		}

		return helper.next;
	}

}
