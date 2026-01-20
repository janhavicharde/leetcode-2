class Solution {

    // Recursive reverse
    public ListNode reverseLinkedList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverseLinkedList(head.next);
        ListNode front = head.next;

        front.next = head;
        head.next = null;

        return newHead;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Finding middle
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode newHead = reverseLinkedList(slow.next);

        ListNode first = head;
        ListNode second = newHead;

       

        // Compare
        while (second != null) {
            if (first.val != second.val) {  
                return false;
               
            }
            first = first.next;
            second = second.next;
        }

        // Restore the reversed part cuz we donot have to alter the list
        slow.next = reverseLinkedList(newHead);   

        return true;
    }
}
