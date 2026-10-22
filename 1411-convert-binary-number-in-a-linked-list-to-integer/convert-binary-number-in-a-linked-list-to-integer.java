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
    public int getDecimalValue(ListNode head) {
        if(head == null){ return 0;}
        ListNode temp = head;
        String binary = "";
        while(temp!= null){
            binary = binary + temp.val;
            temp = temp.next;
        }
        int num = Integer.parseInt(binary, 2);
        return num;
    }
}