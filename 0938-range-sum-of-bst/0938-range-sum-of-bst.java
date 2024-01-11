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
//     public int rangeSumBST(TreeNode root, int low, int high) {
//         int sum=0;
//         dfs(root, sum);
//         return sum;
//     }
//     public void dfs(TreeNode root, int sum){
//         if(root==null) return;
//         if(root.val>=low && root.val<=high){
//             sum+=root.val;
//         }
//         dfs(root.left,sum);
//         dfs(root.right,sum);
//     }
// }

class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int[] sum = {0}; // Use an array of size 1 to pass by reference
        dfs(root, low, high, sum);
        return sum[0];
    }

    public void dfs(TreeNode root, int low, int high, int[] sum) {
        if (root == null) return;

        if (root.val >= low && root.val <= high) {
            sum[0] += root.val;
        }

        dfs(root.left, low, high, sum);
        dfs(root.right, low, high, sum);
    }
}