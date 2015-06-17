package com.xiao.medium;

import static org.junit.Assert.*;

import org.junit.Test;

import com.xiao.shared.ListNode;

public class Swap_Nodes_In_Pairs_Test {

	private static Swap_Nodes_In_Pairs swapNodesInPairs = new Swap_Nodes_In_Pairs();

	@Test
	public void test() {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);

		ListNode result = new ListNode(2);
		result.next = new ListNode(1);
		result.next.next = new ListNode(4);
		result.next.next.next = new ListNode(3);

		assertEquals("2 -> 1 -> 4 -> 3", result, swapNodesInPairs.swapPairs(head));
	}

}
