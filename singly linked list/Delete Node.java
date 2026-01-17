/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //if the ll is 1 5 3 2 (5 is to be deleted)
        //the steal the neighbours val and store in the the node thaat is to be deleted
         node.val = node.next.val;
         //it will bcome 1 3 3 2 and simply point 3 to 2 and the middle 3 will get deleted
        node.next = node.next.next;
    
    }
}