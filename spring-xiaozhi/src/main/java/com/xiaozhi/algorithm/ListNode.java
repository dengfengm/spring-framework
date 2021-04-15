package com.xiaozhi.algorithm;

/**
 * @Author mzj
 * @Date 2021/3/19 0019 10:57
 * @Version 1.0
 */
public 	class ListNode{
	int val;
	ListNode next;
	ListNode(int x){ val = x;}
	ListNode(int[] x){
		this.val = x[0];
		ListNode cur = this;
		for(int i = 1;i<x.length;i++){
			ListNode node = new ListNode(x[i]);
			cur.next = node;
			cur = cur.next;
		}
	}
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		ListNode cur = this;
		while(cur != null){
			sb.append(cur.val + "->");
			cur = cur.next;
		}
		sb.append("NULL");
		return sb.toString();
	}
}
