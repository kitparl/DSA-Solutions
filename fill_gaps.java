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

	public ListNode fillGaps(ListNode head) {
		 ListNode node = new ListNode(0);
        ListNode cur = node;
       ListNode current = head;
        while (current != null && current.next != null) {
            int d = Math.abs(current.val - current.next.val);
            for (int i = current.val; i < current.val + d; i++) {
                cur.next = new ListNode(i);
                cur = cur.next;
            }
            current = current.next;
        }
        cur.next = current;
        return node.next;
	}
}
