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

class Solution {
    public ListNode reverseList(ListNode head) {
        // Base-case: stop when we're at the end of the linked list
        if (head == null || head.next == null) {
            return head;
        }
        
        // Recursive-call: Keep calling until reach base-case
        ListNode newHead = reverseList(head.next);
        // Make the base-case node point to prev node
        head.next.next = head;
        // make the prev node of last node have no pointer forward
        head.next = null;

        // Return new reversedList
        return newHead;
    }
}
