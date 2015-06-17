package com.xiao.medium;

import com.xiao.shared.ListNode;

/**
 * Given a list, rotate the list to the right by k places, where k is
 * non-negative.
 * 
 * For example:
 * Given 1->2->3->4->5->NULL and k = 2,
 * return 4->5->1->2->3->NULL.
 * 
 * 
 * @see <a href="https://leetcode.com/problems/rotate-list/">Rotate List</a>
 * 
 * @author Xiao Ma
 *
 */
public class Rotate_List {

	public ListNode rotateRight(ListNode head, int k) {
		if (head == null || head.next == null || k == 0)
			return head;

		int length = 1;
		ListNode cur = head;
		while (cur.next != null) {
			cur = cur.next;
			length++;
		}
		cur.next = head;

		ListNode fast = head, slow = head;
		int n = k % length;
		for (int i = 0; i < n; i++) {
			fast = fast.next;
		}

		while (fast.next != head) {
			fast = fast.next;
			slow = slow.next;
		}

		ListNode newHead = slow.next;
		slow.next = null;
		return newHead;
	}
	
}
