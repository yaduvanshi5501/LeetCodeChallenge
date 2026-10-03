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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode curr1 = list1;
        ListNode curr2 = list2;

        ListNode newList = new ListNode();
        ListNode newhead = newList;

        while(curr1 != null && curr2 != null){
            if(curr1.val <= curr2.val){
                newList.next = curr1;
                curr1 = curr1.next;
            }else{
                newList.next = curr2;
                curr2 = curr2.next;
            }
            
            newList = newList.next;
        }

        while(curr1 != null){
            newList.next = curr1;
            newList = newList.next;
            curr1 = curr1.next;
        }

        while(curr2 != null){
            newList.next = curr2;
            newList = newList.next;
            curr2 = curr2.next;
        }

        return newhead.next;
    }
}