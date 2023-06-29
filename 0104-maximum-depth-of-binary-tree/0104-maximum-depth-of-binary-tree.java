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
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        return con(1,root);
    }
    public static int con(int count,TreeNode root)
    {
        if(root==null)
            return 0;
        int le=1+con(count+1,root.left);
        int ri=1+con(count+1,root.right);
        return Math.max(le,ri);
        
    }
}