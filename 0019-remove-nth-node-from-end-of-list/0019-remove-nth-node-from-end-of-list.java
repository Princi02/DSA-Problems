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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode a1=head;
        ListNode b1=head;
        for(int i=0;i<n;i++) a1=a1.next;
        if(a1==null) return head.next;
        while(a1.next!=null){
            a1=a1.next;
            b1=b1.next;
        }
        b1.next=b1.next.next;
        return head;
       
    }
}