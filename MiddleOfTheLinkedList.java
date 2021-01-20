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
    public ListNode middleNode(ListNode head) {
        ListNode runner = head.next;
        while(runner != null && runner.next != null){
            head = head.next;
            runner = runner.next.next;
        }
        if(runner == null)
            return head;
        else{
            return head.next;
        }
        
    }
}
