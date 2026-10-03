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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k==0) return head;

        int cnt = 0;
        ListNode curr = head;
        while(curr != null) {
            cnt++;
            curr = curr.next;
        }
        
        k = k%cnt;
        cnt = cnt - k;

        curr = head;
        while(curr.next != null && --cnt != 0){
            curr = curr.next;
        }
        ListNode temp = curr;

        while( curr.next != null){
            curr = curr.next;
        }

        curr.next = head;

        head = temp.next;
        temp.next = null;

        return head;


    }
}