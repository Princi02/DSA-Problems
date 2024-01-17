/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> list = new ArrayList<>();
//         inorder(root,list);
//         return list;
//     }
//     public void inorder(TreeNode root, List<Integer> list){
//         if(root == null) return;
//         inorder(root.left,list);
//         list.add(root.val);
//         inorder(root.right,list);
//     }
// }


// By Stack

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> list = new ArrayList<>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp!=null){
            if(temp!=null){
                stack.push(temp);
                temp=temp.left;
            }
            else{
                temp=stack.pop();
                list.add(temp.val);
                temp=temp.right;
            }
        }
        return list;
    }
}