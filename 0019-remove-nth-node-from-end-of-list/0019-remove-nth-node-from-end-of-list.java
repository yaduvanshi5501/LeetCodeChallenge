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

        cnt = cnt - n;
        if(cnt == 0) return head.next;

        temp = head;
        while(--cnt != 0 && temp!= null){
            temp = temp.next;
        }
        if(temp !=null)
            temp.next = temp.next.next;

        return head;
    }
}