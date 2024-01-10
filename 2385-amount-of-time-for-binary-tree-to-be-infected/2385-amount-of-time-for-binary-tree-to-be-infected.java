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
    int max = 0;
    TreeNode s = null;
    public int amountOfTime(TreeNode root, int start) {
        getStart(root,start);
        max=Math.max(max,getHeight(s));
        dfs(root,start);
        return max;
    }
    
    
    int dfs(TreeNode root,int start){
        if(root==null)
            return -1;
        if(root.val==start)
            return 1;
        int l = dfs(root.left,start);
        if(l!=-1){
            max=Math.max(max,getHeight(root.right)+l+1);
            return l+1;
        }
        int r = dfs(root.right,start);
        if(r!=-1){
            max=Math.max(max,getHeight(root.left)+r+1);
            return r+1;
        }
        return -1;
    }
    
    void getStart(TreeNode root,int start){
        if(root==null)
            return;
        if(root.val==start){
            s=root;
            return;
        }
        getStart(root.left,start);
        getStart(root.right,start);
    }
    
    public int getHeight(TreeNode root){
        return root==null?-1:1+Math.max(getHeight(root.left),getHeight(root.right));
    }
}