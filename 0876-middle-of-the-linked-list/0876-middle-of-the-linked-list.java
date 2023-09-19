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
        ListNode node=head;
        ListNode node2=head;
        int c=0,i=0;
        while(node!=null){
            node=node.next;
            c++;
        }
        System.out.println(c);
        while(i<c/2){
            node2=node2.next;
            i++;
        }
        return node2; 
    }
}