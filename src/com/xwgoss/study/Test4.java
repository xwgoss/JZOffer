package com.xwgoss.study;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
 * 输入一个链表，从尾到头打印链表每个节点的值
 */
public class Test4 {

	@Test
	public void test() {
		ListNode l=new ListNode(67);
		ListNode l1=new ListNode(0);
		ListNode l2=new ListNode(24);
		ListNode l3=new ListNode(58);
		l2.next=l3;
		l1.next=l2;
		l.next=l1;
		System.out.println(printListFromTailToHead(l));
	}
	ArrayList<Integer> l=new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    	if(listNode==null)
    		return l;
    	if(listNode.next!=null)
    		{
    			printListFromTailToHead(listNode.next);
    		}
    			l.add(listNode.val);
    	return l;
    }

	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}
}
