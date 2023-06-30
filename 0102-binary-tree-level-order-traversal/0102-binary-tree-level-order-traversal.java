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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> oo=new ArrayList<>();
        if(root==null)
        return oo;
        TreeMap<Integer,List<Integer>> ok=new TreeMap<Integer,List<Integer>>();
        Queue<TreeNode> ok1=new LinkedList<>();
        ok1.add(root);
        int i=1;
        while(!ok1.isEmpty())
        {
          // Node temp=ok1.poll();
           int size1=ok1.size();
           List<Integer> temp1=new ArrayList<Integer>();
           while(size1--!=0)
           {
               TreeNode temp=ok1.poll();
               temp1.add(temp.val);
               if(temp.left!=null)
               ok1.add(temp.left);
               if(temp.right!=null)
               ok1.add(temp.right);
               
           }
           ok.put(i++,temp1);
        }
        
       // System.out.println(ok);
        
        
    List<List<Integer>> okok=new ArrayList<>();
    for(Map.Entry<Integer,List<Integer>> II:ok.entrySet())
    {
        List<Integer> temp=II.getValue();
        okok.add(temp);
        
    }
        //System.out.println(okok);
        
        return okok;
    }
}