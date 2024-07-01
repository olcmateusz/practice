package leetcode.medium.addtwonumbers;

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
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	
        ListNode result = new ListNode(0);
        ListNode current = result;
        
        int temp = 0;
        
        while(l1 != null || l2 != null) {
        	int l1_val = (l1 != null) ? l1.val : 0;
        	int l2_val = (l2 != null) ? l2.val : 0;
        	
        	int currentSum = l1_val + l2_val + temp;
        	temp = currentSum / 10;
        	int lastDigit = currentSum % 10;
        	
        	ListNode newNode = new ListNode(lastDigit);
        	current.next = newNode;
        	
        	if(l1 != null) l1 = l1.next;
        	if (l2 != null) l2 = l2.next;
        	current = current.next;
        	
        }   
        if(temp > 0) {
        	ListNode lastNode = new ListNode(temp);
        	current.next = lastNode;
        	current = current.next;
        }
        return result.next;
    }
}