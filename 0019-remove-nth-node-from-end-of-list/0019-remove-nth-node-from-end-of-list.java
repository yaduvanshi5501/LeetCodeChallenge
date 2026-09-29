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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        if(head.next == null && n==1) return null;

        int cnt =0;
        ListNode temp = head;

        while(temp!= null) {
            cnt++;
            temp = temp.next;
        }

         // Remove head
        int pos = cnt - n;
        if (pos == 0)
            return head.next;

        // Reach previous node
        temp = head;

        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }

        // Remove nth node from end
        temp.next = temp.next.next;
        return head;
    }
}