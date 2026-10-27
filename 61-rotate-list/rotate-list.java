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
        if(head == null || head.next == null || k == 0 ){ return head;}
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode curr = head;
        int length =0;
        while(curr != null){
            length++;
            curr = curr.next;
        }

        k = k % length;

        for(int i =0; i<k; i++){
            ListNode prev = dummy;
            
            while(prev.next.next!= null){
                prev= prev.next;
            }
            ListNode last = prev.next;
            prev.next = null;
            last.next = dummy.next;
            dummy.next = last;
        }
        return dummy.next;
    }
}