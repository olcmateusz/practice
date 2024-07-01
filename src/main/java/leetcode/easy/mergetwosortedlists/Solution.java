package leetcode.easy.mergetwosortedlists;

import leetcode.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/**
 * You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    	
    	ListNode result = new ListNode(0);
    	ListNode current = result;
    	
    	while(list1 != null && list2 != null) {
    		if(list1.val < list2.val) {
    			current.next = list1;
    			list1 = list1.next;
    		}else {
    			current.next = list2;
    			list2 = list2.next;
    		}
    		
    		current = current.next;
    	}
    	
    	if(list1 != null) {
    		current.next = list1;
    		list1 = list1.next;
    	}
    	
    	if(list2 != null) {
    		current.next = list2;
    		list2 = list2.next;
    	}
    	
        return list1;
    }
}