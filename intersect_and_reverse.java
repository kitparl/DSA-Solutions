/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 class Solution {

	public void intersectAndReverse(ListNode head1, ListNode head2) {
		ListNode p1 = null;
		ListNode n1 = null;
		ListNode c1 = head1;
		while (c1 != null){
		    n1 = c1.next;
		    c1.next = p1;
		    p1 = c1;
		    c1 = n1;
		    
		}
		ListNode p2 = null;
		ListNode n2 = null;
		ListNode c2 = head2;
		while (c2 != null){
		    n2 = c2.next;
		    c2.next = p2;
		    p2 = c2;
		    c2 = n2;
		}
		while (p1 != null && p2 != null){
		    if (p1.val == p2.val){
		        System.out.print(p1.val + " ");
		    }
		    if (p1.val != p2.val){
		        break;
		    }
		    p1 = p1.next;
		    p2 = p2.next;
		    
		}
	}
}