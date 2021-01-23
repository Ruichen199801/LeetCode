package com.leetcode.ruichen199801;

public class BinarySearch {

	class Solution {

		// #704 https://leetcode-cn.com/problems/binary-search/
		// Binary Search
		// TC = O(n), SC = O(1)

		public int search(int[] nums, int target) {
			if (nums == null || nums.length == 0) {
				return -1;
			}
			int left = 0, right = nums.length - 1;
			while (left <= right) {
				int mid = left + (right - left) / 2;
				if (nums[mid] == target) {
					return mid;
				} else if (nums[mid] > target) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}
			return -1;
		}

	}

}
