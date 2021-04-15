package com.xiaozhi.algorithm;

/**
 * @Author mzj
 * @Date 2021/3/19 0019 10:24
 * @Version 1.0
 */
public class Solution {

	public ListNode removeElements(ListNode head, int val){
		if(head == null)
			return null;
		head.next = removeElements(head.next, val);
		return head.val == val? head.next:head;
	}



	public static void main(String[] args){
		int[] nums = {1,2,3,4,5,6};
		ListNode head = new ListNode(nums);
		ListNode res = new Solution().removeElements(head, 6);
		System.out.println(res.toString());
	}
}
