package com.xiao.easy;

import static org.junit.Assert.*;

import org.junit.Test;

import com.xiao.shared.ListNode;

public class Remove_Nth_Node_From_End_Of_List_Test {

	private static Remove_Nth_Node_From_End_Of_List removeNthNodeFromEndOfList = new Remove_Nth_Node_From_End_Of_List();

	@Test
	public void test() {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		int n = 2;

		ListNode result = new ListNode(1);
		result.next = new ListNode(2);
		result.next.next = new ListNode(3);
		result.next.next.next = new ListNode(5);

		assertEquals("1 -> 2 -> 3 -> 5", result, removeNthNodeFromEndOfList.removeNthFromEnd(head, n));
	}

}
