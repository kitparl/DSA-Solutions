/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public ListNode funMaths(ListNode head) {
        ListNode primeListHead = null, primeListTail = null;
        ListNode nonPrimeListHead = null, nonPrimeListTail = null;
        ListNode curr = head;

        while (curr != null) {
            if (isPrime(curr.val)) {
                if (primeListHead == null) {
                    primeListHead = primeListTail = curr;
                } else {
                    primeListTail.next = curr;
                    primeListTail = curr;
                }
            } else {
                if (nonPrimeListHead == null) {
                    nonPrimeListHead = nonPrimeListTail = curr;
                } else {
                    nonPrimeListTail.next = curr;
                    nonPrimeListTail = curr;
                }
            }
            curr = curr.next;
        }

        if (primeListHead == null) {
            return nonPrimeListHead;
        } else {
            primeListTail.next = nonPrimeListHead;
            if (nonPrimeListTail != null) {
                nonPrimeListTail.next = null;
            }
            return primeListHead;
        }
    }
}
