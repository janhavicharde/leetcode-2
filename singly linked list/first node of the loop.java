public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        
        while (fast != null && fast.next != null) {
            
            slow = slow.next;

           
            fast = fast.next.next;

           
            if (slow == fast) {
               
                slow = head;

                // Move both one step to find start of loop
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                // Return the starting node of loop
                return slow;
            }
        }

        
        return null;
    }
}