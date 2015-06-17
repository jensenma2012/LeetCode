package com.xiao.shared;

/**
 * This is the ListNode class using in lots of the Java solutions.
 * 
 * @author Xiao Ma
 *
 */
public class ListNode {

	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
		next = null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + val;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		ListNode other = (ListNode) obj;
		ListNode temp1 = this;
		ListNode temp2 = other;

		while (temp1 != null && temp2 != null) {
			if (temp1.val != temp2.val)
				return false;

			temp1 = temp1.next;
			temp2 = temp2.next;
		}

		if (temp1 != null || temp2 != null)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder toString = new StringBuilder("ListNode [");

		ListNode temp = this;
		while (temp != null) {
			toString.append(temp.val + " -> ");
			temp = temp.next;
		}

		int length = toString.length();
		return toString.replace(length - 4, length, "]").toString();
	}

}
