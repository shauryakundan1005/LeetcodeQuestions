class Solution {
    public ListNode deleteDuplicates(ListNode head) {
      ListNode dummy = new ListNode(0);
      dummy.next = head;

      ListNode prev = dummy;
      while(head != null){
        if(head.next != null && head.val == head.next.val){
            int duplicate = head.val;

            while(head != null && head.val == duplicate){
                head = head.next;
            }

            prev.next = head;
        } else {
            prev = head;
            head = head.next;
        }
      }
      return dummy.next;
    }
}