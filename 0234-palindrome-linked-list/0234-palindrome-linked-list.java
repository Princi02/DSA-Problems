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
    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        ListNode mid=middle(head);
        ListNode last=reverse(mid);
        ListNode curr=head;
//  compare 
        while(last!=null){
            if(curr.val!=last.val) return false;
            curr=curr.next;
            last=last.next;
        }
        return true;     
    }
    
//  function for middle node
    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
//  reverse from mid node
    public ListNode reverse(ListNode mid){
        if(mid!=null){
              ListNode newnode=null, newh=null;
        while(mid!=null){
            newnode=mid;
            mid=mid.next;
            newnode.next=newh;
            newh=newnode;
        }
        return newnode; 
        }
        return mid;
    } 
}
