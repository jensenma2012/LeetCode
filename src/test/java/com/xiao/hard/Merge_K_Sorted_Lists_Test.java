package com.xiao.hard;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.xiao.shared.ListNode;

public class Merge_K_Sorted_Lists_Test {

	private static Merge_K_Sorted_Lists mergeKSortedLists = new Merge_K_Sorted_Lists();

	@Test
	public void test() {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(3);
		l1.next.next = new ListNode(4);

		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(5);

		List<ListNode> lists = new ArrayList<ListNode>();
		lists.add(l1);
		lists.add(l2);

		ListNode result = new ListNode(1);
		result.next = new ListNode(2);
		result.next.next = new ListNode(3);
		result.next.next.next = new ListNode(3);
		result.next.next.next.next = new ListNode(4);
		result.next.next.next.next.next = new ListNode(5);

		assertEquals("1 -> 2 -> 3 -> 3 -> 4 -> 5", result, mergeKSortedLists.mergeKLists(lists));
	}

}
