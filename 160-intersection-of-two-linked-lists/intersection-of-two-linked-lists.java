
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
     int n=0, m =0;
     ListNode temp = headA;
     while(temp != null){
        n++;
        temp = temp.next;
     }   
     temp = headB;
     while(temp != null){
        m++;
        temp = temp.next;
     }
     if(n>m){
        for(int i = 0; i< Math.abs(n-m); i++){
            headA = headA.next;
        }
     } else if(m>n){
        for(int i = 0; i< Math.abs(n-m); i++){
            headB = headB.next;
        }
     }
     while(headA!=null && headB!=null){
        if(headA == headB){
            return headA;
        }
        headA= headA.next;
        headB = headB.next;
     }
      return null;
    }
}