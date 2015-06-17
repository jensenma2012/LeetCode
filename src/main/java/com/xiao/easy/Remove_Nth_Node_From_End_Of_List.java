package com.xiao.easy;

import com.xiao.shared.ListNode;

/**
 * Given a linked list, remove the nth node from the end of list and return its
 * head.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/">Remove Nth Node From End of List</a>
 * 
 * @author Xiao Ma
 *
 */
public class Remove_Nth_Node_From_End_Of_List {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null || head.next == null)
			return null;

		ListNode faster = head;
		ListNode slower = head;

		for (int i = 0; i < n; i++)
			faster = faster.next;

		if (faster == null) {
			head = head.next;
			return head;
		}

		while (faster.next != null) {
			faster = faster.next;
			slower = slower.next;
		}

		slower.next = slower.next.next;
		return head;
	}

}
