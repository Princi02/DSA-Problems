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
// 1st.
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
            if(map.containsKey(b) && map.get(b)>0) return b;
            b=b.next;
        }
        return null;
    }
}
    
    
    
    
// 2nd.
// import java.util.Map;
// import java.util.HashMap;
// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         ListNode a = headA;
//         ListNode b = headB;
        
//         HashMap<ListNode, Integer> map = new HashMap<>();
        
//         while (a != null) {
//             map.put(a, map.getOrDefault(a, 0) + 1);
//             a = a.next;
//         }
        
//         while (b != null) {
//             map.put(b, map.getOrDefault(b, 0) + 1);
//             b = b.next;
//         }
        
//         for (Map.Entry<ListNode, Integer> entry : map.entrySet()) {
//             if (entry.getValue() > 1) { // Check for nodes with count > 1
//                 return entry.getKey(); // Return the intersection node
//             }
//         }
        
//         return null; // No intersection found
//     }
// }