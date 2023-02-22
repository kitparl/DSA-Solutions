////////////// half tc is passing only

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
	
	public boolean evenOddMix(ListNode head) {
		        ListNode curr = head;
        int index = 1;
        while (curr != null) {
            if (index % 2 == 1 && curr.val % 2 == 0) {
                return false;
            }
            if (index % 2 == 0 && curr.val % 2 == 1) {
                return false;
            }
            curr = curr.next;
            index++;
        }
        return true;
    
	}
}
