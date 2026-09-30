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
    public boolean isPalindrome(ListNode head) {
        if(head == null) return false;
        // if(head.next == null) return true;

        List<Integer> arr = new ArrayList<>(10);
       
        ListNode curr = head;
        while(curr != null){
           arr.add(curr.val);
           curr = curr.next;
        }

        int left =0;
        int right = arr.size()-1;

        while(left<=right){
            if(arr.get(left++) != arr.get(right--)) return false;
        }
        return true;
    }
}