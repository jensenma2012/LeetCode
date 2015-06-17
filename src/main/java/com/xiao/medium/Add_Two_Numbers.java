package com.xiao.medium;

import com.xiao.shared.ListNode;

/**
 * You are given two linked lists representing two non-negative numbers. The
 * digits are stored in reverse order and each of their nodes contain a single
 * digit. Add the two numbers and return it as a linked list.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 
 * Output: 7 -> 0 -> 8
 * 
 * 
 * @see <a href="https://leetcode.com/problems/add-two-numbers/">Add Two Numbers</a>
 * 
 * @author Xiao Ma
 *
 */
public class Add_Two_Numbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null)
			return null;

		if (l1 == null && l2 != null)
			return l2;

		if (l1 != null && l2 == null)
			return l1;

		ListNode l3 = null;
		ListNode head = null;
		boolean addOne = false;

		while (l1 != null || l2 != null) {
			int sum = 0;
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}

			if (addOne)
				sum += 1;

			if (sum > 9)
				addOne = true;
			else
				addOne = false;

			if (l3 == null) {
				l3 = new ListNode(sum % 10);
				head = l3;
			} else {
				l3.next = new ListNode(sum % 10);
				l3 = l3.next;
			}
		}

		if (addOne)
			l3.next = new ListNode(1);
		return head;
	}

}