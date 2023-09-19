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
// class Solution {
//     public ListNode reverseKGroup(ListNode head, int k) {
//         ListNode node=head;
//         ListNode dummy=new ListNode(0);
//         dummy.next=head;
//         if(head==null || k==1 || k==0) return head;
//         int count=0;
//         while(node!=null){
//             node=node.next;
//             count++;
//         }
//         while(head!=null){
//             if(count>=k) {
//                 int c=k;
//                 while(c!=0){
//                     ListNode temp = head;
//                     head=head.next;
//                     head.next=temp;
//                     head=head.next;
//                 }
//                 count-=k;
//             }
//             else{
//                 head=head.next;
//             }
//         }
//         return dummy.next;
//     }
// }

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current1 = dummy;
        ListNode current = dummy;
        int count = 0;

        // Count the number of nodes in the list
        while (current1.next != null) {
            current1 = current1.next;
            count++;
        }

        while (count >= k) {
            current = reverseKNodes(current, k);
            count -= k;
        }

        return dummy.next;
    }

    private ListNode reverseKNodes(ListNode prevTail, int k) {
        ListNode current = prevTail.next;
        ListNode prev = prevTail;
        ListNode next = null;

        for (int i = 0; i < k; i++) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        ListNode newPrevTail = prevTail.next;
        prevTail.next = prev;
        newPrevTail.next = current;

        return newPrevTail;
    }
}