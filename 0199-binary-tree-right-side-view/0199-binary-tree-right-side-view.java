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
    public List<Integer> rightSideView(TreeNode root) {
        
         ArrayList<Integer> ok=new ArrayList<Integer>();
      fun(root,ok,0);
      return ok;
    }
    public static void fun(TreeNode root,ArrayList<Integer> ok,int level)
    {
        if(root==null)
        return;
        if(ok.size()==level)
        ok.add(root.val);
        if(root.right!=null)
        fun(root.right,ok,level+1);
         if(root.left!=null)
        fun(root.left,ok,level+1);
        
        
    }
}