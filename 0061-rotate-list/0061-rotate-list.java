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
        // 1st
//         if(k==0 || head==null) return head;
//        ListNode node=head;
//         int count=0;
//         while(node!=null){
//             node=node.next;
//             count++;
//         }
//         node=head;
//         if(k>count)
//             k=k%count;
//         k=count-k;
//         if(k==0) return head;
//         while(k>1){
//             node=node.next;
//             k--;
//         }
//         if(node==null || node.next==null) return head;
//         ListNode newhead=node.next;
//         node.next=null;
//         ListNode newcur=newhead;
//         while(newcur.next!=null)
//             newcur=newcur.next;
        
//         newcur.next=head;
//         head=newhead;
//         return head;
        
        
        
//         2nd
        if(k==0 || head==null) return head;
        int size=0;
        ListNode tmp=head;
        while(tmp!=null){
            size++;
            tmp=tmp.next;
        }
        k=k%size;
        ListNode p1=head;
        ListNode p2=head;
        for(int i=0;i<k;i++){
            p2=p2.next;
        }
        while(p2.next!=null){
            p1=p1.next;
            p2=p2.next;
        }
        p2.next=head;
        ListNode newHead=p1.next;
        p1.next=null;
        return newHead;   
    }    
}