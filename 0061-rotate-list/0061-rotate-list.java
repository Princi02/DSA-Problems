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
        if(k==0 || head==null) return head;
       ListNode node=head;
        int count=0;
        while(node!=null){
            node=node.next;
            count++;
        }
        node=head;
        if(k>count) k=k%count;
        k=count-k;
        if(k==0) return head;
        while(k>1){
            node=node.next;
            k--;
        }
        if(node==null || node.next==null) return head;
        ListNode newhead=node.next;
        node.next=null;
        ListNode newcur=newhead;
        while(newcur.next!=null)
            newcur=newcur.next;
        
        newcur.next=head;
        head=newhead;
        return head;
    }
}