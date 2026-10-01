class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode curr = head;
        ListNode prevGroup = null;

        while (curr != null) {

            // Check if k nodes are available
            ListNode temp = curr;
            int count = 0;

            while (temp != null && count < k) {
                temp = temp.next;
                count++;
            }

            // Less than k nodes -> leave them as they are
            if (count < k) {
                if (prevGroup != null) {
                    prevGroup.next = curr;
                }
                break;
            }

            ListNode start = curr;
            ListNode last = temp;

            // Reverse k nodes
            ListNode prev = last;

            while (curr != last) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            // First group
            if (prevGroup == null) {
                head = prev;
            } else {
                prevGroup.next = prev;
            }

            // Original start becomes the tail
            prevGroup = start;
        }

        return head;
    }
}