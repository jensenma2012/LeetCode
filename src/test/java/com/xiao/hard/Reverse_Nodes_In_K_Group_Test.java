package com.xiao.hard;

import static org.junit.Assert.*;

import org.junit.Test;

import com.xiao.shared.ListNode;

public class Reverse_Nodes_In_K_Group_Test {

	private static Reverse_Nodes_In_K_Group reverseNodesInKGroup = new Reverse_Nodes_In_K_Group();

	@Test
	public void test() {
		ListNode head1 = new ListNode(1);
		head1.next = new ListNode(2);
		head1.next.next = new ListNode(3);
		head1.next.next.next = new ListNode(4);
		head1.next.next.next.next = new ListNode(5);

		ListNode head2 = new ListNode(1);
		head2.next = new ListNode(2);
		head2.next.next = new ListNode(3);
		head2.next.next.next = new ListNode(4);
		head2.next.next.next.next = new ListNode(5);

		int k1 = 2;
		int k2 = 3;

		ListNode result1 = new ListNode(2);
		result1.next = new ListNode(1);
		result1.next.next = new ListNode(4);
		result1.next.next.next = new ListNode(3);
		result1.next.next.next.next = new ListNode(5);

		ListNode result2 = new ListNode(3);
		result2.next = new ListNode(2);
		result2.next.next = new ListNode(1);
		result2.next.next.next = new ListNode(4);
		result2.next.next.next.next = new ListNode(5);

		assertEquals("2 -> 1 -> 4 -> 3 -> 5", result1, reverseNodesInKGroup.reverseKGroup(head1, k1));
		assertEquals("3 -> 2 -> 1 -> 4 -> 5", result2, reverseNodesInKGroup.reverseKGroup(head2, k2));
	}

}
