package com.xiao.medium;

import static org.junit.Assert.*;

import org.junit.Test;

import com.xiao.shared.ListNode;

public class Rotate_List_Test {

	private static Rotate_List rotateList = new Rotate_List();

	@Test
	public void test() {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		int k = 2;

		ListNode result = new ListNode(4);
		result.next = new ListNode(5);
		result.next.next = new ListNode(1);
		result.next.next.next = new ListNode(2);
		result.next.next.next.next = new ListNode(3);

		assertEquals("4->5->1->2->3", result, rotateList.rotateRight(head, k));
	}

}
