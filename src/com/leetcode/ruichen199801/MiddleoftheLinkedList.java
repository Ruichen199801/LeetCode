package com.leetcode.ruichen199801;

public class MiddleoftheLinkedList {

	class ListNode {
		int val;
		ListNode next;

		public ListNode(int val) {
			this.val = val;
		}
	}

	class Solution {

		// #876 https://leetcode-cn.com/problems/middle-of-the-linked-list/
		// Linked List
		// TC = O(n), SC = O(1)

		public ListNode middleNode(ListNode head) {
			if (head == null || head.next == null) {
				return head;
			}
			ListNode slow = head, fast = head;
			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow;
		}
	}

}
