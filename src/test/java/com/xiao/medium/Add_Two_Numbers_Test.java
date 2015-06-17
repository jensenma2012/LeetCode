package com.xiao.medium;

import static org.junit.Assert.*;

import org.junit.Test;

import com.xiao.shared.ListNode;

public class Add_Two_Numbers_Test {

	private static Add_Two_Numbers addTwoNumbers = new Add_Two_Numbers();

	@Test
	public void test() {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		ListNode result = new ListNode(7);
		result.next = new ListNode(0);
		result.next.next = new ListNode(8);

		assertEquals("7 -> 0 -> 8", result, addTwoNumbers.addTwoNumbers(l1, l2));
	}

}
