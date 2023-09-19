/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.Map;
import java.util.HashMap;
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
        ListNode b=headB;
        // int a,b;
        HashMap<ListNode,Integer>map=new HashMap<ListNode,Integer>(); 
        while(a!=null){
            map.put(a, map.getOrDefault(a,0)+1);
            a=a.next;
        }
        while(b!=null){
            // map.put(b, map.getOrDefault(b,0)+1);
            if(map.containsKey(b) && map.get(b)>0) return b;
            b=b.next;
        }
        // for(map.Entry<ListNode,Integer> entry : map.entrySet()){
        //     if(entry.getValue()!=0) return headA.entry.getKey().val;
        //     headA=headA.next;
        // }
        return null;
    }
}