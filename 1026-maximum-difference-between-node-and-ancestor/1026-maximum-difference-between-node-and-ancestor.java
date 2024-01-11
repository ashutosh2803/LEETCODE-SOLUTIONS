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

    public ArrayList<Integer> list = new ArrayList<>();
    public int diff = 0;
    public int max = 0;

    public void helper(TreeNode root){
        if(root == null) return;

        for(int x: list){
            diff = Math.abs(x - root.val);
            max = Math.max(max, diff);
        }
        list.add(root.val);
        helper(root.left);
        helper(root.right);
        list.remove(list.size()-1);
    }

    public int maxAncestorDiff(TreeNode root) {
        helper(root);

        return max;   
    }
}