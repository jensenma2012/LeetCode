package com.xiao.easy;

import static org.junit.Assert.*;

import org.junit.Test;

import com.xiao.shared.ListNode;

public class Merge_Two_Sorted_Lists_Test {

	private static Merge_Two_Sorted_Lists mergeTwoSortedLists = new Merge_Two_Sorted_Lists();

	@Test
	public void test() {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(3);
		l1.next.next = new ListNode(4);

		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(5);

		ListNode result = new ListNode(1);
		result.next = new ListNode(2);
		result.next.next = new ListNode(3);
		result.next.next.next = new ListNode(3);
		result.next.next.next.next = new ListNode(4);
		result.next.next.next.next.next = new ListNode(5);

		assertEquals("1 -> 2 -> 3 -> 3 -> 4 -> 5", result, mergeTwoSortedLists.mergeTwoLists(l1, l2));
	}

}
