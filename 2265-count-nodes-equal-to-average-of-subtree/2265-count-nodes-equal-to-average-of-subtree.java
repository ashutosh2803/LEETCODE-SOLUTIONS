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
    int count=0;
    
    public int averageOfSubtree(TreeNode root) 
    {
        postorder(root);
        return count;
    }
    
    public Pair postorder(TreeNode root)
    {
        if(root==null)
        {
            return new Pair(0,0);
        }
        
        Pair leftpair=postorder(root.left);
        Pair rightpair=postorder(root.right);
        
        int nodesum=root.val+leftpair.sum+rightpair.sum;
        int countnode=leftpair.count+rightpair.count+1;
        
        if(root.val == nodesum/countnode)
        {
            count++;
        }
        
        return new Pair(nodesum,countnode);
    }
}

class Pair{
    int sum;
    int count;
    
    public Pair(int sum, int count)
    {
        this.sum=sum;
        this.count=count;
    }
}